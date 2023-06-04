package com.restfull.core.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.restfull.core.repository.ComunaRepository;
import org.springframework.web.bind.annotation.*;
import com.restfull.core.entities.Comuna;


@RestController
public class ComunaController {


	@Autowired
	private ComunaRepository comunaRepository;

	@GetMapping("/comunas")
	public List<Comuna> query() {
		return comunaRepository.getAllComunas();
	}
	@GetMapping("/comuna/{id}")
	public List<Comuna> getComunaById(@PathVariable Long id) {
		return comunaRepository.getComunaById(id);
	}
}
