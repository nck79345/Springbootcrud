package com.springboot.employee.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.springboot.employee.exception.UserException;
import com.springboot.employee.models.Employee;
import com.springboot.employee.repo.EmployeeRepo;
@Service
public class EmployeeServiceImpl implements Employeeservice {
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Override
	public List<Employee> getAllEmployees() throws UserException {
		return employeeRepo.findAll();
 	}
	@Override
	public void saveEmployee(Employee employee) throws UserException {
		// TODO Auto-generated method stub
		this.employeeRepo.save(employee);
		
	}
	@Override
	public Employee getEmployeeById(long id) throws UserException {
		// TODO Auto-generated method stub
		Optional<Employee> optional = employeeRepo.findById(id);
		Employee employee = null;
		if(optional.isPresent()) {
			employee=optional.get();
		}else {
			throw new UserException("Employee not found:"+id);
		}
		return employee;
	}
	@Override
	public void deleteEmployeeById(long id) throws UserException{
		// TODO Auto-generated method stub
		
		this.employeeRepo.deleteById(id);
		
	}
}

