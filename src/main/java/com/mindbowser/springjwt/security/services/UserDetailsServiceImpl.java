package com.mindbowser.springjwt.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mindbowser.springjwt.models.User;
import com.mindbowser.springjwt.repository.UserRepository;

@Service
public  class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	UserRepository userRepository;

	@Transactional
	public UserDetails loadUserByEmail(String Username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(Username)
				.orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + Username));

		return UserDetailsImpl.build(user);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	

	

	

}
