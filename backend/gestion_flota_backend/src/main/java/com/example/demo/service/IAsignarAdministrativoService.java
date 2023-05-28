package com.example.demo.service;

import java.util.List;

import com.example.demo.models.entity.AsignarAdministrativo;


public interface IAsignarAdministrativoService {
	
	public List<AsignarAdministrativo> findAll();
	
	public AsignarAdministrativo findById(Long id);
	
	public AsignarAdministrativo save(AsignarAdministrativo asignarAdministrativo);
	
	public void delete(Long id);
}
