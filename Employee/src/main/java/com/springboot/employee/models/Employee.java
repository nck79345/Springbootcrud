package com.springboot.employee.models;
import org.springframework.http.HttpStatusCode;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "Emp")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id;
	
	@Column(name = "Ename")
	private String Ename;
	@Column(name = "Address")
	private String Address;
	@Column(name = "Email")
	private String Email;
	@Column(name = "Erole")
	private String Erole;
		
	public String getErole() {
		return Erole;
	}
	public void setErole(String erole) {
		Erole = erole;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public HttpStatusCode getStatus() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setEmployeeId(String employeeId) {
		// TODO Auto-generated method stub
		return ;
	}
	
	
	
	
	
}
