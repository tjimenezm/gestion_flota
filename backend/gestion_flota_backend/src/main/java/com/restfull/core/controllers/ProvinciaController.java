package com.restfull.core.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.restfull.core.repository.ProvinciaRepository;
import org.springframework.web.bind.annotation.*;
import com.restfull.core.entities.Provincia;


@RestController
public class ProvinciaController {


	@Autowired
	private ProvinciaRepository provinciaRepository;

	@GetMapping("/provincias")
	public List<Provincia> query() {
		return provinciaRepository.getAllProvincias();
	}
	@GetMapping("/provincia/{id}")
	public List<Provincia> getProvinciaById(@PathVariable Long id) {
		return provinciaRepository.getProvinciaById(id);
	}
}
