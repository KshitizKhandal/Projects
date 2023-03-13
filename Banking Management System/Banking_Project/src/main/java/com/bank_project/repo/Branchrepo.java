package com.bank_project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank_project.entity.Branch;

@Repository
public interface Branchrepo extends JpaRepository<Branch, Integer>  {

}
