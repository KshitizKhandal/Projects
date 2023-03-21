package com.nitish.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.persistence.NoResultException;
import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import com.nitish.model.Employee;

@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	SessionFactory factory;
	@SuppressWarnings("unused")
	private JdbcTemplate jdbcTemplate;
	@SuppressWarnings("unused")
	private final static EmployeeRowMapper Employee_Row_Mapper = new EmployeeRowMapper();

	public void registerEmployee(Employee employee) {
		// encryption is done

		employee.setPassword(BCrypt.hashpw(employee.getPassword(), BCrypt.gensalt()));
//		this.jdbcTemplate.update(
//				"INSERT INTO employee (firstname,lastname,userName,email,password,confirmPassword) VALUES (?,?,?,?,?,?)",
//				employee.getFirstname(), employee.getLastname(), employee.getUserName(), employee.getEmail(),
//				employee.getPassword(), employee.getConfirmPassword());
//
//		int result = this.jdbcTemplate.queryForObject("select id from employee where email = '?'",
//				new Object[] { employee }, Integer.class);
//		employee.setId(result);
		Session session = factory.getCurrentSession();

		session.save(employee);

	}

	@SuppressWarnings("deprecation")
	public Employee loginEmployee(Employee employee) {

		Session session = factory.getCurrentSession();
		try {
			Query<Employee> query = session
					.createQuery("from Employee where userName =:userName or password =:password", Employee.class);
			@SuppressWarnings("unused")
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

			query.setParameter("userName", employee.getUserName());

			query.setParameter("password", employee.getPassword());

			System.out.println("password");// it will prints password

			String var1 = BCrypt.hashpw(employee.getPassword(), BCrypt.gensalt());
			System.out.println(var1);

			//System.out.println(employee.getPassword());// it will print form password

			String result = query.getSingleResult().getPassword();
			System.out.println(result);
			System.out.println(employee.getPassword());
			if(
			encoder.matches(employee.getPassword(), result)) {
//			
			//String pass= query.getSingleResult().getPassword();
	

			return employee;
			}
			else {
				return null;
			}
		} catch (NoResultException e) {
			// TODO: handle exception
			return null;
		}
	}

	private static class EmployeeRowMapper implements RowMapper<Employee> {

		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee employee = new Employee();
			employee.setId(rs.getInt("id"));
			employee.setUserName(rs.getString("userName"));
			employee.setFirstname(rs.getString("firstname"));
			employee.setLastname(rs.getString("lastname"));
			employee.setEmail(rs.getString("email"));
			employee.setPassword(rs.getString("password"));
			employee.setConfirmPassword(rs.getString("confirmPassword"));

			return employee;

		}

	}

}
