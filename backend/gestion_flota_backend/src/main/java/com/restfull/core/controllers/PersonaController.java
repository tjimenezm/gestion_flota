package com.restfull.core.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.restfull.core.repository.PersonaRepository;
import org.springframework.web.bind.annotation.*;
import com.restfull.core.entities.Persona;


@RestController
public class PersonaController {


	@Autowired
	private PersonaRepository personaRepository;

	@GetMapping("/personas")
	public List<Persona> query() {
		return personaRepository.getAllPersonas();
	}
	@GetMapping("/persona/{id}")
	public List<Persona> getPersonaById(@PathVariable Long id) {
		return personaRepository.getPersonaById(id);
	}
}
