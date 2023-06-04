package com.restfull.core.services;

import java.util.List;
import com.restfull.core.repository.SolicitudRepository;
import com.restfull.core.entities.Solicitud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SolicitudService {

    private final SolicitudRepository solicitudRepository;

    @Autowired
    public SolicitudService(SolicitudRepository solicitudRepository) {
        this.solicitudRepository = solicitudRepository;
    }

    public List<Solicitud> getAllSolicitudes() {
        return solicitudRepository.getAllSolicitud();
    }
}