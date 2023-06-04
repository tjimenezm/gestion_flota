package com.restfull.core.services;

import com.restfull.core.controllers.PlanificacionController;
import com.restfull.core.entities.Planificacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanificacionService {

    @Autowired
    private PlanificacionController planificacionController;

    public List<Planificacion> getAllPlanificaciones() {
        return planificacionController.query();
    }

    public List<Planificacion> getPlanificacionById(Long id) {
        return planificacionController.getPlanificacionById(id);
    }
}