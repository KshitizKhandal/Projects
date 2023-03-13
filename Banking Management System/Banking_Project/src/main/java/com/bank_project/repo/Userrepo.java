package com.bank_project.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank_project.entity.User;

@Repository
public interface Userrepo extends JpaRepository<User,String > {

	List<User> findByUsername(String username);

	List<User> findByAddress(String address);

	List<User> findByAge(int age);


	
//  public User findByname(String username);
//public List<User> findByage(int age);
// public  List<User> findByaddress(String address);

}
