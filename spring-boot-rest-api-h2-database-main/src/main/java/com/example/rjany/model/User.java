package com.example.rjany.model;

import com.example.rjany.UserType;
import com.fasterxml.jackson.annotation.JsonFormat;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
 //defining class name as Table name
public class User {
	 public User(Long id, UserType userType, String name, Integer age, String email, LocalDate customerSince, Integer customerDurationinYears, String userRole, Long updatedBillAmount) {
		 this.id = id;
		 this.userType = userType;
		 this.name = name;
		 this.age = age;
		 this.email = email;
		 this.customerSince = customerSince;
		 this.customerDurationinYears = customerDurationinYears;
		 this.userRole = userRole;
		 this.updatedBillAmount = updatedBillAmount;
	 }

	 @Column //defining id as primary key
	@Id
	private Long id;
	 @JsonFormat(shape = JsonFormat.Shape.STRING)
	private UserType userType;

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	@Column
	private String name;
	
	@Column
	private Integer age;
	
	@Column
	private String email;

	public LocalDate getCustomerSince() {
		return customerSince;
	}

	public void setCustomerSince(LocalDate customerSince) {
		this.customerSince = customerSince;
	}

	@Column
	private LocalDate customerSince;

	public String getUserRole() {
		return userRole;
	}

	public Integer getCustomerDurationinYears() {
		return customerDurationinYears;
	}

	public void setCustomerDurationinYears(Integer customerDurationinYears) {
		this.customerDurationinYears = customerDurationinYears;
	}

	@Column
	private Integer customerDurationinYears;

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public Long getUpdatedBillAmount() {
		return updatedBillAmount;
	}

	public void setUpdatedBillAmount(Long updatedBillAmount) {
		this.updatedBillAmount = updatedBillAmount;
	}

	@Column
	private String  userRole;

	@Column
	private Long updatedBillAmount;

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return id+" "+name+" "+age+" "+email;
	}
}

