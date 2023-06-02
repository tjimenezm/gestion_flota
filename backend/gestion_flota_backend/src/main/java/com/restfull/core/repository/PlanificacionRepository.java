package com.restfull.core.repository;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.restfull.core.entities.Planificacion;

@Repository
public class PlanificacionRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;


	public List<Planificacion> getAllPlanificacions() {
		String sql = "select id_planificacion\r\n"
				+ "from planificacion;";
		List<Planificacion> planificacionList = new ArrayList<Planificacion>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Planificacion planificacion = new Planificacion();
			Long planificacion_id = ((Number)row.get("id_planificacion")).longValue();
			planificacion.setIdPlanificacion((int)planificacion_id.intValue());
			planificacionList.add(planificacion);
		});
		return planificacionList;
	}

	public List<Planificacion> getPlanificacionById(Long id) {
		String sql = "select id_planificacion\r\n"
				+ "from planificacion where id_planificacion = "+id+" ;";
		List<Planificacion> planificacionList = new ArrayList<Planificacion>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Planificacion planificacion = new Planificacion();
			Long planificacion_id = ((Number)row.get("id_planificacion")).longValue();
			planificacion.setIdPlanificacion((int)planificacion_id.intValue());
			planificacionList.add(planificacion);
		});
		return planificacionList;
	}


}
