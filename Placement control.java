package com.tnsif.Placement.controller;



import java.util.List;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;



import com.tnsif.Placement.entity.Placement;

import com.tnsif.Placement.repository.PlacementRepository;



@RestController

public class PlacementController {

	//this is my controller class

	

	@Autowired

	private PlacementRepository rep;



	@GetMapping("/placement")

	public List<Placement> getPlacement() {

		return rep.findAll();



	}



	@GetMapping("/placement/{id}")

	public Optional<Placement> getPlacement(@PathVariable Long id) {

		return rep.findById(id);

	}



	@PostMapping("/placement")

	public Placement createPlacement(@RequestBody Placement p) {

		return rep.save(p);



	}



	@PutMapping("/placement/{id}")

	public Placement updatePlacement(@RequestBody Placement p, @PathVariable Long id) {

		p.setId(id);

		return rep.save(p);

	}



	@DeleteMapping("/placement/{id}")

	public void deletePlacement(@PathVariable Long id) {

		rep.deleteById(id);

	}



}
