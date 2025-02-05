package com.restfull.core.repository;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.restfull.core.entities.Comuna;

@Repository
public class ComunaRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;


	public List<Comuna> getAllComunas() {
		String sql = "select id_comuna\r\n"
				+ "from comuna;";
		List<Comuna> comunaList = new ArrayList<Comuna>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Comuna comuna = new Comuna();
			Long comuna_id = ((Number)row.get("id_comuna")).longValue();
			comuna.setIdComuna((int)comuna_id.intValue());
			comunaList.add(comuna);
		});
		return comunaList;
	}

	public List<Comuna> getComunaById(Long id) {
		String sql = "select id_comuna\r\n"
				+ "from comuna where id_comuna = "+id+" ;";
		List<Comuna> comunaList = new ArrayList<Comuna>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Comuna comuna = new Comuna();
			Long comuna_id = ((Number)row.get("id_comuna")).longValue();
			comuna.setIdComuna((int)comuna_id.intValue());
			comunaList.add(comuna);
		});
		return comunaList;
	}


}
