package com.restfull.core.dao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import com.restfull.core.entities.Solicitud;

@Component
public class SolicitudDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public SolicitudDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Solicitud> getAllSolicitud() {
        String sql = "SELECT id_solicitud, cliente_id, planificacion_id, estado, origen, destino, fecha_solicitud, fecha_entrega FROM solicitud";
        return executeQuery(sql);
    }

    private List<Solicitud> executeQuery(String sql) {
        List<Solicitud> solicitudList = new ArrayList<>();
        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
        rows.forEach(row -> {
            Solicitud solicitud = new Solicitud();
            Long idSolicitud = ((Number) row.get("id_solicitud")).longValue();
            Long clienteId = ((Number) row.get("cliente_id")).longValue();
            Long planificacionId = ((Number) row.get("planificacion_id")).longValue();
            solicitud.setIdSolicitud(idSolicitud.intValue());
            solicitud.setClienteId(clienteId.intValue());
            solicitud.setPlanificacionId(planificacionId.intValue());
            solicitud.setEstado((String) row.get("estado"));
            solicitud.setOrigen((String) row.get("origen"));
            solicitud.setDestino((String) row.get("destino"));
            solicitud.setFechaSolicitud((Date) row.get("fecha_solicitud"));
            solicitud.setFechaEntrega((Date) row.get("fecha_entrega"));
            solicitudList.add(solicitud);
        });
        return solicitudList;
    }
}