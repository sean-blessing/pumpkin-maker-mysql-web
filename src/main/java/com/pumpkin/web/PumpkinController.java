package com.pumpkin.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pumpkin.business.Pumpkin;
import com.pumpkin.db.PumpkinRepo;

@CrossOrigin
@RestController
@RequestMapping("/pumpkins")
public class PumpkinController {
	
	@Autowired
	private PumpkinRepo pumpkinRepo;
	
	// list all pumpkins
	@GetMapping("/")
	public List<Pumpkin> getAllPumpkins() {
		return pumpkinRepo.findAll();
	}
	
	// get pumpkin by id
	@GetMapping("/{id}")
	public Optional getPumpkin(@PathVariable int id) {
		Optional<Pumpkin> p = pumpkinRepo.findById(id);
		return p;
	}
	
	// add a pumpkin
	@PostMapping("/")
	public Pumpkin addPumpkin(@RequestBody Pumpkin p) {
		return pumpkinRepo.save(p);
	}
	
	// update a pumpkin
	@PutMapping("/")
	public Pumpkin updatePumpkin(@RequestBody Pumpkin p) {
		return pumpkinRepo.save(p);
	}
	
	// delete a pumpkin
	@DeleteMapping("/")
	public void deletePumpkin(@RequestBody Pumpkin p) {
		pumpkinRepo.delete(p);
	}
	
}
