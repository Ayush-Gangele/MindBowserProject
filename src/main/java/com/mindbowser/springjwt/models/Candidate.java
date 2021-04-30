package com.mindbowser.springjwt.models;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name="t_candidate")
	public class Candidate<Candidate> 
	{
	 
		
		@Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Integer id;
	     
	    @Column(name="first_name")
	    private	String firstName;
	     
	    @Column(name="last_name")
	    private String lastName;
	     
	    @Column(name="email_address", nullable=false, length=200)
	    private String email;
	    
	    @Column(name="phone_no")
	    private String phone;
	    
	    
	    @Column(name="birth_date")
	    private Date birth_date;
	    
	   
	    @Column(name="gender")
	    private String gender;
	    
	    @Column(name="current_location")
	    private String current_location;
	    
	    
	    @Column(name="company")
	    private String company;
	    
	    @Column(name="address")
	    private String address;
	    
	    
	    
	    @Column(name="qualification")
	    private String qualification;
	    
	   @Column(name="experience")
	   	private String experience;
	   
	   
	   	private String fileName;

	    @Column(name="logo")
	    private byte[] logo;


	    	  
	 
	     public Integer getId() 
	    {
			return id;
		}
	     public void setId(Integer id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}
		public String getFileName() {
			return fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}


		public byte[] getLogo() {
			return logo;
		}

		public void setLogo(byte[] logo) {
			this.logo = logo;
		}

		public void setFirstName(String firstName)
		{
			this.firstName = firstName;
		}
		
		public String getLastName() 
		{
			return lastName;
		}
		public void setLastName(String lastName) 
		{
			this.lastName = lastName;
		}
		
		public String getEmail()
		{
			return email;
		}

		public String getPhone() 
		{
			return phone;
		}
		public void setPhone(String phone) 
		{
			this.phone = phone;
		}
		
		public String getAddress() 
		{
			return address;
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

		public String getCurrent_location() {
			return current_location;
		}
		public void setCurrent_location(String current_location) {
			this.current_location = current_location;
		}


		public String getQualification() {
			return qualification;
		}
		public void setQualification(String qualification) {
			this.qualification =  qualification;
		}

		public Date getBirth_date() {
			return birth_date;
		}
		public void setBirth_date(Date birth_date) {
			this.birth_date = birth_date;
		}
		
		
		
		public String getExperience() {
			return experience;
		}

		public void setExperience(String experience) {
			this.experience = experience;
		}
		
		
		
		@Override
	    public String toString() {
	        return "Candidate[ id=" + id + ",firstName=" + firstName + 
	        		", lastName=" + lastName + ", email=" + email   + 
	        		", phone=" + phone + " , address="+ address + ", gender="+ gender + ",company="+ company + ", current_location="+ current_location + 
	        			",  qualification="+  qualification + ",birth_date="+ birth_date + 
	        			",experience="+experience + "]";
	    }
	}
	
	

	
	
	
	
	
	

