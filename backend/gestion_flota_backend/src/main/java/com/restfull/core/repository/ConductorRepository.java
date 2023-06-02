package com.restfull.core.repository;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.restfull.core.entities.Conductor;

@Repository
public class ConductorRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;


	public List<Conductor> getAllConductors() {
		String sql = "select id_conductor\r\n"
				+ "from conductor;";
		List<Conductor> conductorList = new ArrayList<Conductor>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Conductor conductor = new Conductor();
			Long conductor_id = ((Number)row.get("id_conductor")).longValue();
			conductor.setIdConductor((int)conductor_id.intValue());
			conductorList.add(conductor);
		});
		return conductorList;
	}

	public List<Conductor> getConductorById(Long id) {
		String sql = "select id_conductor\r\n"
				+ "from conductor where id_conductor = "+id+" ;";
		List<Conductor> conductorList = new ArrayList<Conductor>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Conductor conductor = new Conductor();
			Long conductor_id = ((Number)row.get("id_conductor")).longValue();
			conductor.setIdConductor((int)conductor_id.intValue());
			conductorList.add(conductor);
		});
		return conductorList;
	}


}
