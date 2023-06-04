package com.restfull.core.services;

import java.util.List;

import com.restfull.core.entities.RegistrarSalida;

public interface IRegistrarSalidaService {

	public List<RegistrarSalida> findAll();

	public RegistrarSalida findById(Long id);

	public RegistrarSalida save(RegistrarSalida registrarSalida);

	public void delete(Long id);

}
