package com.restfull.core.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.restfull.core.repository.VehiculoRepository;
import org.springframework.web.bind.annotation.*;
import com.restfull.core.entities.Vehiculo;


@RestController
public class VehiculoController {


	@Autowired
	private VehiculoRepository vehiculoRepository;

	@GetMapping("/vehiculos")
	public List<Vehiculo> query() {
		return vehiculoRepository.getAllVehiculos();
	}
	@GetMapping("/vehiculo/{id}")
	public List<Vehiculo> getVehiculoById(@PathVariable Long id) {
		return vehiculoRepository.getVehiculoById(id);
	}
}
