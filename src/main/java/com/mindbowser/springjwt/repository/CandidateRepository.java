package com.mindbowser.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindbowser.springjwt.models.Candidate;


public interface CandidateRepository extends JpaRepository <Candidate, Integer>
{

}
