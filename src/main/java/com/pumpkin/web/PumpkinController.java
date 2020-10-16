package com.pumpkin.web;

import org.springframework.web.bind.annotation.*;

import com.pumpkin.business.Pumpkin;

@RestController
@RequestMapping("/tests")
public class PumpkinController {
	

	@GetMapping("/pumpkin")
	public Pumpkin makePumpkin() {
		Pumpkin p = new Pumpkin(1,"orange",11.5, 12, 15, true);
		return p;
	}
}
