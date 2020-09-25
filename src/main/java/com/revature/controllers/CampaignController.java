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

import com.revature.daos.ICampaignDAO;
import com.revature.models.Campaign;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value = "/campaign")
public class CampaignController {
	
	private ICampaignDAO camdao;
	
	@Autowired
	public CampaignController(ICampaignDAO camdao) {
		super();
		this.camdao = camdao;
	}
	
	@GetMapping
	public ResponseEntity<List<Campaign>> findAll(){
		return ResponseEntity.status(HttpStatus.OK).body(camdao.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Campaign> findById(@Valid @PathVariable("id") int i){
		Optional<Campaign> cam = camdao.findById(i);
		if (cam.isPresent()) {
			return ResponseEntity.status(HttpStatus.OK).body(cam.get());
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
	}
	
	@PostMapping("/new")
	public HttpStatus newCampaign(@Valid @RequestBody Campaign c) {
		System.out.println(c);
		camdao.save(c);
		return HttpStatus.ACCEPTED;
	}
	
	@PostMapping("/save")
	public HttpStatus saveCampaign(@Valid @RequestBody Campaign c) {
		camdao.save(c);
		return HttpStatus.ACCEPTED;
	}
}
