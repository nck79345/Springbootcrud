package com.springboot.employee.controller;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.employee.exception.UserException;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//import com.springboot.employee.exception.BusinessException;
//import com.springboot.employee.exception.ControllerException;
import com.springboot.employee.models.Employee;
import com.springboot.employee.service.Employeeservice;
@Controller
public class EmployeeController {
	@Autowired 
	private Employeeservice employeeService;
	
	
	@GetMapping("/")
	public String ViewHomePage(Model model)throws UserException {
		model.addAttribute("listEmployees", employeeService.getAllEmployees()) ;
		return "index";
	} 
	
	@GetMapping("/showNewEmployeeForm")
	public String showNewEmployeeForm(Model model)throws UserException {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "New_Employee";
	}
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee")Employee employee)throws UserException {
		employeeService.saveEmployee(employee);
		return "redirect:/";
	}
	@GetMapping("/showFormForUpdate/{name}")
	public String showFormForUpdate(@PathVariable( value = "name")long id, Model model)throws UserException {
		Employee employee=employeeService.getEmployeeById(id);
		model.addAttribute("employee", employee);
		return "update_Employee"; 
	}
	
	@GetMapping("/deleteEmployee/{id}")
	public String deleteBook(@PathVariable( value = "id")long id) throws UserException{
		this.employeeService.deleteEmployeeById(id);
		return "redirect:/";

} 
		
}






























