package com.mindbowser.springjwt.security.services;

import java.sql.Date;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import javax.persistence.Column;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mindbowser.springjwt.models.User;

public class UserDetailsImpl implements UserDetails {
	private static final long serialVersionUID = 1L;

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





	private String email;

	@JsonIgnore
	private String password;

	private Collection<? extends GrantedAuthority> authorities;

	public UserDetailsImpl(Long id,String first_name, String last_name,long phone,Date dob,String address, int pincode,String current_location, String gender, String company, String email, String password,
			Collection<? extends GrantedAuthority> authorities) {
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
		this.password = password;
		this.authorities = authorities;
	}

	public static UserDetailsImpl build(User user) {
		List<GrantedAuthority> authorities = user.getRoles().stream()
				.map(role -> new SimpleGrantedAuthority(role.getName().name()))
				.collect(Collectors.toList());

		return new UserDetailsImpl(
				user.getId(), 
			 
				user.getFirst_name(),
				user.getLast_name(),
				user.getPhone(),
				user.getDob(),
				user.getAddress(),
				user.getPincode(),
				user.getCurrent_location(),
				user.getGender(),
				user.getCompany(),
				
				user.getEmail(),
				user.getPassword(), 
				authorities);
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	public Long getId() {
		return id;
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
	
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
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


	@Override
	public String getPassword() {
		return password;
	}

	
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		UserDetailsImpl user = (UserDetailsImpl) o;
		return Objects.equals(id, user.id);
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
