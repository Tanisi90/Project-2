package com.revature.controllers;

import java.util.ArrayList;
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

import com.revature.daos.ICampaignDAO;
import com.revature.daos.ICharacterDAO;
import com.revature.daos.IUserDAO;
import com.revature.models.Campaign;
import com.revature.models.Character;
import com.revature.models.User;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value = "/character")
public class CharController {
	
	private ICampaignDAO camdao;
	private IUserDAO udao;
	private ICharacterDAO cdao; //Change name depending on DAOs
	
	@Autowired
	public CharController(ICampaignDAO camdao, IUserDAO udao, ICharacterDAO cdao) {
		super();
		this.camdao = camdao;
		this.udao = udao;
		this.cdao = cdao;
	}
	
	@GetMapping
	public ResponseEntity<List<Character>> findAll() {
		return ResponseEntity.status(HttpStatus.OK).body(cdao.findAll());
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<List<Character>> findByUser(@Valid @PathVariable("id") int i) {
		User u = udao.findById(i).get();
		List<Character> lpc = cdao.findByPlayer(u);
		List<Campaign> lcamp = camdao.findByDm(u);
		for (Campaign c : lcamp) {
			lpc.addAll(cdao.findByCampaign(c));
		}
		return ResponseEntity.status(HttpStatus.OK).body(lpc);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Character> findById(@Valid @PathVariable("id") int i) {
		Optional<Character> c = cdao.findById(i);
		if (c.isPresent()) {
			return ResponseEntity.status(HttpStatus.OK).body(c.get());
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
	}
	
	//Might need to change new and update
	@PostMapping("/new")
	public HttpStatus newChar(@Valid @RequestBody Character c) {
		cdao.save(c);
		return HttpStatus.ACCEPTED;
	}
	
	@PostMapping("/update")
	public HttpStatus updateChar(@Valid @RequestBody Character c) {
		cdao.save(c);
		return HttpStatus.ACCEPTED;
	}
	
}
