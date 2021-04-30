package com.mindbowser.springjwt.payload.response;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;

import org.springframework.format.annotation.NumberFormat;

public class JwtResponse {
	private String token;
	private String type = "Bearer";
	private Long id;
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



	private String email;
	private List<String> roles;

	public JwtResponse(String accessToken, Long id, String first_name, String last_name,long phone,Date dob,String address, int pincode,String current_location, String gender, String company, String email, List<String> roles) {
		this.token = accessToken;
		this.id = id;
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
		this.roles = roles;
	}

	public String getAccessToken() {
		return token;
	}

	public void setAccessToken(String accessToken) {
		this.token = accessToken;
	}

	public String getTokenType() {
		return type;
	}

	public void setTokenType(String tokenType) {
		this.type = tokenType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	public List<String> getRoles() {
		return roles;
	}
}
