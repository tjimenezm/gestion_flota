package com.restfull.core.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.restfull.core.repository.ConductorRepository;
import org.springframework.web.bind.annotation.*;
import com.restfull.core.entities.Conductor;


@RestController
public class ConductorController {


	@Autowired
	private ConductorRepository conductorRepository;

	@GetMapping("/conductors")
	public List<Conductor> query() {
		return conductorRepository.getAllConductors();
	}
	@GetMapping("/conductor/{id}")
	public List<Conductor> getConductorById(@PathVariable Long id) {
		return conductorRepository.getConductorById(id);
	}

}
