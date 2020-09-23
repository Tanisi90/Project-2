package com.revature.controllers;

import java.util.List;
import java.util.Optional;

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

import com.revature.daos.IUserDAO;
import com.revature.models.User;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value = "/user")
public class UserController {

	private IUserDAO udao;
	
	@Autowired
	public UserController(IUserDAO udao) {
		super();
		this.udao = udao;
	}
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		return ResponseEntity.status(HttpStatus.OK).body(udao.findAll());
	}
	
	@PostMapping(value = "/login")
	public ResponseEntity<User> login(@Valid @RequestBody String username, @Valid @RequestBody String password) {
		Optional<User> u = Optional.of(udao.findByUsername(username));
		if(u.isPresent()) {
			Integer i = password.hashCode() * username.hashCode();
			String s = i.toString();
			if(s.equals(u.get().getPassword())) {
				return ResponseEntity.status(HttpStatus.OK).body(u.get());
			}
		}
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
	}
	
	@PostMapping(value = "/signup")
	public HttpStatus signup(@Valid @RequestBody User u) {
		udao.save(u);
		return HttpStatus.ACCEPTED;
	}
	
	@PostMapping(value = "/update")
	public HttpStatus updateUser(@Valid @RequestBody User u) {
		udao.save(u);
		return HttpStatus.ACCEPTED;
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> getUser(@Valid @PathVariable("id") int id){
		Optional<User> u = udao.findById(id);
		if(u.isPresent()) {
			return ResponseEntity.status(HttpStatus.OK).body(u.get());
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
	}
	
	
}
