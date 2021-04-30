
package com.mindbowser.springjwt.controllers;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JsonParseException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mindbowser.springjwt.models.Candidate;
import com.mindbowser.springjwt.security.services.CandidateService;




@RestController 
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/ap")
public class CandidateController 
{
	@Autowired
	private CandidateService candidateService;
	
	

	@GetMapping("/candidate")
	public List<Candidate> list()
	{
		System.out.println("the get method called");
		return candidateService.listAll();
	}
	
	
	
       
	
	@GetMapping("/candidate/{id}")
	public Candidate get(@PathVariable(value="id") Integer id)
	{
		System.out.println("the fetching method called");
		 Candidate candidateObj=candidateService.get(id);
		 if(candidateObj==null)
		 {
			 throw new RuntimeException("Candidate with id" +id+ "is not there");
		 }
		 return candidateObj;
	}
	
	
	
	
	@PostMapping("/candidate")
	public ResponseEntity<Candidate> save(@RequestBody Candidate candidate)
	{
		System.out.println("the post method called");
		if(candidate==null)
		{
			throw new NullPointerException("candidate object cannot be null");
		}
		Candidate candidateObj=candidateService.save(candidate);
		return new ResponseEntity<Candidate>(candidateObj,HttpStatus.OK);
	
	}
	
	
	
	@PutMapping("/candidate/{id}")
	public Candidate Update(@RequestBody Candidate candidateObj)
	{
		System.out.println("the update method called");
		candidateService.save(candidateObj);
		return candidateObj;
	}
	
	@DeleteMapping("/candidate/{id}")
	public String delete(@PathVariable Integer id) 
	{
		System.out.println("Delete method called");
		candidateService.delete(id);
		return " candidate id has been deleted with id:" +id;
	}
	
}
