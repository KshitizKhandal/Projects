package com.nitish.dao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nitish.model.Product;

@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {

	@Autowired
	SessionFactory sessionFactory;

	public List<Product> getAllProducts() {
		List<Product> products = new ArrayList<Product>();
		try (Session session = sessionFactory.openSession()) {
			System.out.println("Here is calling!!");
			session.beginTransaction();
			CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
			CriteriaQuery<Product> criteriaQuery = criteriaBuilder.createQuery(Product.class);
			Root<Product> root = criteriaQuery.from(Product.class);
			criteriaQuery.select(root);
			products = session.createQuery(criteriaQuery).getResultList();
			System.out.println(products);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return products;
	}

	public Product getProductById(String productId) {
		Product pr = new Product();
		try (Session session = sessionFactory.openSession()) {
			System.out.println("here I am!!");
			session.beginTransaction();
			Query query = session.createNativeQuery("select * from product where productname LIKE '"+productId+"'"+" Or productbrand LIKE '"+productId+"'"+" Or productcode = '" +productId+"';");
			List<Object[]> objData =query.list();
			for(Object[] p: objData) {
				
				pr.setId(Long.valueOf(p[0].toString()));
				pr.setLongDesc(p[1].toString());
				pr.setProductbrand(p[2].toString());
				pr.setProductname(p[3].toString());
				pr.setProductcode(p[4].toString());
				pr.setUrl(p[5].toString());
				
				System.out.println(pr);
			}
			session.getTransaction().commit();
			
			return pr;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pr;
	}

	@Override
	public Product getProductByBrand(String productbrand) {
		try (Session session = sessionFactory.openSession()) {
			session.beginTransaction();
			Product product = (Product) session.get(Product.class, productbrand);
			session.getTransaction().commit();
			return product;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	


//	public List<Product> getFilteredData(Product product) {
//		Session session = null;
//		try {
//			session = sessionFactory.getCurrentSession();
//
//			ArrayList<Object> list_field = new ArrayList<Object>();
//
//			ArrayList<Object> list_value = new ArrayList<Object>();
//			// System.out.println(product.getProductname());
//
//			if (product.getProductname() == null || product.getProductname() == "") {
//			} else {
//				list_field.add("productname");
//				list_value.add(product.getProductname());
//			}
//			if (product.getProductcode() == null || product.getProductcode() == "") {
//			} else {
//				list_field.add("productcode");
//				list_value.add(product.getProductcode());
//			}
//			if (product.getProductbrand() == null || product.getProductbrand() == "") {
//
//			} else {
//				list_field.add("productbrand");
//				list_value.add(product.getProductbrand());
//			}
//
//			switch (list_field.size()) {
//
//			case 0:
//				Query<Product> query0 = session.createQuery("from Product");
//				return query0.list();
//			case 1:
//
//				Query query1 = session.createQuery("from Product where " + list_field.get(0) + " = :value0");
//				query1.setParameter("value0", list_value.get(0));
//				return query1.list();
//
//			case 2:
//				Query query2 = session.createQuery(
//						"from Product where " + list_field.get(0) + " =:value0 and " + list_field.get(1) + " =:value1");
//				query2.setParameter("value0", list_value.get(0));
//				query2.setParameter("value1", list_value.get(1));
//				return query2.list();
//
//			}
//
//			return null;
//		}
//
//		catch (Exception exception) {
//			System.out.println("Error while getting Filtered Data :: ");
//			return null;
//		} finally {
//			session.flush();
//		}
//
//	}

}
