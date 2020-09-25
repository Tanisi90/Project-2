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
import com.revature.daos.IUserDAO;
import com.revature.models.Campaign;
import com.revature.models.User;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value = "/campaign")
public class CampaignController {
	
	private ICampaignDAO camdao;
	private IUserDAO udao;
	
	@Autowired
	public CampaignController(ICampaignDAO camdao, IUserDAO udao) {
		super();
		this.camdao = camdao;
		this.udao = udao;
	}
	
	@GetMapping
	public ResponseEntity<List<Campaign>> findAll(){
		List<Campaign> l = camdao.findAll();
		System.out.println(l);
		return ResponseEntity.status(HttpStatus.OK).body(l);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Campaign> findById(@Valid @PathVariable("id") int i){
		Optional<Campaign> cam = camdao.findById(i);
		if (cam.isPresent()) {
			System.out.println(cam.get());
			return ResponseEntity.status(HttpStatus.OK).body(cam.get());
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
	}
	
	@PostMapping("/new")
	public HttpStatus newCampaign(@Valid @RequestBody Campaign c) {
		System.out.println(c);
		c.setDm(udao.findById(c.getDm().getUser_id()).get());
		List<User> u = new ArrayList<User>();
		for (User temp : c.getPlayers()) {
			u.add(udao.findById(temp.getUser_id()).get());
		}
		c.setPlayers(u);
		camdao.save(c);
		return HttpStatus.ACCEPTED;
	}
	
	@PostMapping("/save")
	public HttpStatus saveCampaign(@Valid @RequestBody Campaign c) {

		c.setDm(udao.findById(c.getDm().getUser_id()).get());
		List<User> u = new ArrayList<User>();
		for (User temp : c.getPlayers()) {
			u.add(udao.findById(temp.getUser_id()).get());
		}
		c.setPlayers(u);
		camdao.save(c);
		return HttpStatus.ACCEPTED;
	}
}
