package com.restfull.core.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.restfull.core.repository.SolicitudRepository;
import com.restfull.core.entities.Solicitud;


@RestController
public class SolicitudController {


	@Autowired
	private SolicitudRepository solicitudRepository;

	@GetMapping("/solicitud")
	public List<Solicitud> query() {
		return solicitudRepository.getAllSolicitud();
	}
	
	
}

