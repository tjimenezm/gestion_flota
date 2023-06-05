package com.restfull.core.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import com.restfull.core.entities.Planificacion;

@Component
public class PlanificacionDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PlanificacionDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Planificacion> getAllPlanificacions() {
        String sql = "SELECT id_planificacion FROM planificacion";
        return executeQuery(sql);
    }

    public List<Planificacion> getPlanificacionById(Long id) {
        String sql = "SELECT id_planificacion FROM planificacion WHERE id_planificacion = " + id;
        return executeQuery(sql);
    }

    private List<Planificacion> executeQuery(String sql) {
        List<Planificacion> planificacionList = new ArrayList<>();
        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
        rows.forEach(row -> {
            Planificacion planificacion = new Planificacion();
            Long planificacionId = ((Number) row.get("id_planificacion")).longValue();
            planificacion.setIdPlanificacion((int) planificacionId.intValue());
            planificacionList.add(planificacion);
        });
        return planificacionList;
    }
}