package com.restfull.core.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.restfull.core.repository.EmpleadoRepository;
import org.springframework.web.bind.annotation.*;
import com.restfull.core.entities.Empleado;


@RestController
public class EmpleadoController {


	@Autowired
	private EmpleadoRepository empleadoRepository;

	@GetMapping("/empleados")
	public List<Empleado> query() {
		return empleadoRepository.getAllEmpleados();
	}
	@GetMapping("/empleado/{id}")
	public List<Empleado> getEmpleadoById(@PathVariable Long id) {
		return empleadoRepository.getEmpleadoById(id);
	}
}
