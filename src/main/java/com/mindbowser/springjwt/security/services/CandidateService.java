package com.mindbowser.springjwt.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mindbowser.springjwt.models.Candidate;
import com.mindbowser.springjwt.repository.CandidateRepository;


@Service
public class CandidateService
{

	@Autowired
	private CandidateRepository candidateRepository;
	
	@Transactional
	
	 public List<Candidate> listAll()
	{
		 return candidateRepository.findAll();
	}
	@Transactional
	public Candidate get(Integer id)
	{
		 return candidateRepository.findById(id).get();
		
	}
	@Transactional
	public Candidate save(Candidate candidate) 
	{
		 return candidateRepository.save(candidate);
		
		
	}
	@Transactional
	public void delete(Integer id) {
		 candidateRepository.deleteById(id);
	}
	

}
