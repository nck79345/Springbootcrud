package com.springboot.employee.service;

import java.util.List;

import com.springboot.employee.exception.UserException;
import com.springboot.employee.models.Employee;

public interface Employeeservice {
	List<Employee> getAllEmployees ()throws UserException;
	void saveEmployee(Employee employee) throws UserException;
	Employee getEmployeeById(long id) throws UserException;
	void deleteEmployeeById(long id) throws UserException;
	

	
}
