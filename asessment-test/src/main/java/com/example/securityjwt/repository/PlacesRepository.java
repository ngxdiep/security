package com.example.securityjwt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.securityjwt.models.Places;

@Repository
public interface PlacesRepository extends JpaRepository<Places, Long> {
	List<Places> findAll();
}
