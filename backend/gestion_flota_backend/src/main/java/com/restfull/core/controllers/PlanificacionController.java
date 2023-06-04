package com.restfull.core.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.restfull.core.repository.PlanificacionRepository;
import org.springframework.web.bind.annotation.*;
import com.restfull.core.entities.Planificacion;

@RestController
public class PlanificacionController {

	@Autowired
	private PlanificacionRepository planificacionRepository;

	@GetMapping("/planificacions")
	public List<Planificacion> query() {
		return planificacionRepository.getAllPlanificacions();
	}

	@GetMapping("/planificacion/{id}")
	public List<Planificacion> getPlanificacionById(@PathVariable Long id) {
		return planificacionRepository.getPlanificacionById(id);
	}
}
