package com.revature.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.daos.IClassDAO;
import com.revature.models.Class;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value = "/class")
public class ClassController {
	
	private IClassDAO cldao;
	
	@Autowired
	public ClassController(IClassDAO cldao) {
		super();
		this.cldao = cldao;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Class> getClass(@Valid @PathVariable("id") int id){
		return ResponseEntity.status(HttpStatus.OK).body(cldao.findById(id).get());
	}
	
	@PostMapping
	public ResponseEntity<Class> addClass(@Valid @RequestBody Class c){
		Class c2 = cldao.save(c);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(c2);
	}
}
