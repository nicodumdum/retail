package com.enterprise.retail.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

@Entity(name="customer")
public class Customer {
	
	@Id
	@Column(name="customer_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long customerId;
	
	@Column(name="customer_first_name")
	@NotNull
	private String firstName;
	
	@Column(name="customer_last_name")
	@NotNull
	private String lastName;
	
	@Column(name="customer_address")
	@NotNull
	private String address;
	
	@Column(name="customer_birth_date")
	@NotNull
	private String birthDate;
	
	@Column(name="customer_contact_number")
	@NotNull
	private String contactNumber;
	
	@Column(name="customer_email")
	@NotNull
	private String email;
	
	@Column(name="customer_gender")
	@NotNull
	private String gender;

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Transient
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		
		return firstName + " " + lastName;
	}
}
