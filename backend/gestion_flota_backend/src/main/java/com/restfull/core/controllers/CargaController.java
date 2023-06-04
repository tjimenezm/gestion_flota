package com.restfull.core.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.restfull.core.repository.CargaRepository;
import org.springframework.web.bind.annotation.*;
import com.restfull.core.entities.Carga;


@RestController
public class CargaController {


	@Autowired
	private CargaRepository cargaRepository;

	@GetMapping("/cargas")
	public List<Carga> query() {
		return cargaRepository.getAllCargas();
	}
	@GetMapping("/carga/{id}")
	public List<Carga> getCargaById(@PathVariable Long id) {
		return cargaRepository.getCargaById(id);
	}
}
