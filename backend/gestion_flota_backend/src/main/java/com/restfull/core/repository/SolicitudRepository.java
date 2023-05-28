package com.restfull.core.repository;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.restfull.core.entities.Solicitud;

@Repository
public class SolicitudRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;


	public List<Solicitud> getAllSolicitud() {
		String sql = "select idSolicitud, estado\r\n"
				+ "from solicitud c2 ;";
		List<Solicitud> solicitudList = new ArrayList<Solicitud>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Solicitud solicitud = new Solicitud();
			solicitud.setEstado((String)row.get("estado"));
			solicitudList.add(solicitud);
		});
		return solicitudList;

	}
	
	

}
