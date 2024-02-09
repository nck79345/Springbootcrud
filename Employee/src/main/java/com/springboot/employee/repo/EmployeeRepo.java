package com.springboot.employee.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.springboot.employee.models.Employee;

@Repository

public interface EmployeeRepo  extends JpaRepository<Employee, Long> {

	

}
