package com.example.demo.service;

import java.util.List;

import com.example.demo.models.entity.RegistrarSalida;

public interface IRegistrarSalidaService {
	
	public List<RegistrarSalida> findAll();
	
	public RegistrarSalida findById(Long id);
	
	public RegistrarSalida save(RegistrarSalida registrarSalida);
	
	public void delete(Long id);
}
