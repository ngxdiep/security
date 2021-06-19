package com.example.securityjwt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.securityjwt.models.Places;
import com.example.securityjwt.services.PlacesService;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/places")
public class PlacesController {

	@Autowired
	PlacesService placesService;
	
	@GetMapping("/")
	public List<Places> findAll() throws Exception {
		return placesService.findAll();
	}
}
