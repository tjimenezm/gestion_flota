package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.IRegistrarSalidasDao;

import com.example.demo.models.entity.RegistrarSalida;


@Service
public class RegistrarSalidaServiceImpl  implements IRegistrarSalidaService{

	
	@Autowired
	private IRegistrarSalidasDao registrarSalidaDao;
	@Override
	@Transactional(readOnly=true)
	public List<RegistrarSalida> findAll() {
		
		return (List<RegistrarSalida>) registrarSalidaDao.findAll();
	}
	
	
	@Override
	@Transactional(readOnly=true)
	public RegistrarSalida findById(Long id) {
		
		return registrarSalidaDao.findById(id).orElse(null);
	}
	@Override
	@Transactional
	public RegistrarSalida save(RegistrarSalida registrarSalida) {
	
		return registrarSalidaDao.save(registrarSalida);
	}
	@Override
	@Transactional
	public void delete(Long id) {
		registrarSalidaDao.deleteById(id);
		
		
	}
}
