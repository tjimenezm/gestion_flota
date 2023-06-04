package com.restfull.core.services;

import java.util.List;

import com.restfull.core.entities.AsignarAdministrativo;

public interface IAsignarAdministrativoService {
	
	public List<AsignarAdministrativo> findAll();
	
	public AsignarAdministrativo findById(Long id);
	
	public AsignarAdministrativo save(AsignarAdministrativo asignarAdministrativo);
	
	public void delete(Long id);
}
