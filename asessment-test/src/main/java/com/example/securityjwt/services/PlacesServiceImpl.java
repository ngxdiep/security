package com.example.securityjwt.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.securityjwt.models.Places;
import com.example.securityjwt.repository.PlacesRepository;

@Service
public class PlacesServiceImpl implements PlacesService {

	@Autowired
	PlacesRepository placesRepository;

	@Override
	public List<Places> findAll() {
		return placesRepository.findAll();
	}
}
