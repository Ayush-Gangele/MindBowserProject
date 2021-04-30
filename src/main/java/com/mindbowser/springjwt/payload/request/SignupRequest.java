package com.mindbowser.springjwt.payload.request;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.validation.constraints.*;

import org.springframework.format.annotation.NumberFormat;
 
public class SignupRequest {
    @NotBlank
    @Size(min = 3, max = 20)
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
    
    private Set<String> role;
    
    @NotBlank
    @Size(min = 6, max = 40)
    private String password;
  
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
	
	

 
   
    
    public Set<String> getRole() {
      return this.role;
    }
    
    public void setRole(Set<String> role) {
      this.role = role;
    }
}
