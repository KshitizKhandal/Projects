package com.bank_project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank_project.entity.Manager;

@Repository
public interface Managerrepo extends JpaRepository<Manager, Integer> {

}
