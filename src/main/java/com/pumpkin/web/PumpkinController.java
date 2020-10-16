package com.pumpkin.web;

import java.util.List;

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
	
	// add a pumpkin
	@PostMapping("/")
	public Pumpkin addPumpkin(Pumpkin p) {
		if (pumpkinRepo.save(p)!=null) {
			System.out.println("Pumpkin save was successful");
		}
		else {
			System.out.println("Pumpkin save ISSUE.");
		}
		return p;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
