package com.restfull.core.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.restfull.core.repository.DireccionRepository;
import org.springframework.web.bind.annotation.*;
import com.restfull.core.entities.Direccion;


@RestController
public class DireccionController {


	@Autowired
	private DireccionRepository direccionRepository;

	@GetMapping("/direccions")
	public List<Direccion> query() {
		return direccionRepository.getAllDireccions();
	}
	@GetMapping("/direccion/{id}")
	public List<Direccion> getDireccionById(@PathVariable Long id) {
		return direccionRepository.getDireccionById(id);
	}
}
