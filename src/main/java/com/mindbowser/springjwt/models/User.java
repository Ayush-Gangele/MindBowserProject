package com.mindbowser.springjwt.models;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.NumberFormat;

@Entity
@Table(	name = "users", 
		uniqueConstraints = { 
//			@UniqueConstraint(columnNames = "username"),
			@UniqueConstraint(columnNames = "email") 
		})
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String first_name;

	
	@Column
	private String last_name;

//	@Column
//	private String email;
//	
	@NumberFormat(pattern = "#")
	@Column
	private long phone;
	
	@Column
	private Date dob;
	
	@Column
	private String address;
	
	@Column
	private int pincode;
	
	@Column
	private String current_location;

//	@Column
//	@Lob
//	private byte[] documents;//the doc. content will be stored as a byte array in the database

	@Column
	private String gender;

	@Column
	private String company;


	
	@NotBlank
	@Size(max = 50)
	@Email
	private String email;

	@NotBlank
	@Size(max = 120)
	private String password;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(	name = "user_roles", 
				joinColumns = @JoinColumn(name = "user_id"), 
				inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles = new HashSet<>();

	public User() {
	}

	public User(String first_name, String last_name,long phone,Date dob,String address, int pincode,String current_location, String gender, String company, String email, String password) {
		this.first_name=first_name;
		this.last_name=last_name;
		this.phone=phone;
		this.dob=dob;
		this.address=address;
		this.pincode=pincode;
		this.current_location=current_location;
		this.gender=gender;
		this.company=company;
		this.email = email;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	
	
	
	
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public long getPhone() {
	
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCurrent_location() {
		return current_location;
	}
	public void setCurrent_location(String current_location) {
		this.current_location = current_location;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email="
				+ email + ", phone=" + phone + ", dob=" + dob + ", address=" + address + ", current_location="
				+ current_location + ", gender=" + gender + ", company="
				+ company + ", password= " + password + ", pincode= " + pincode + "]";
	}
}
