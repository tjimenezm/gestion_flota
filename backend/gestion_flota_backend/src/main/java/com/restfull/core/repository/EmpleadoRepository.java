package com.restfull.core.repository;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.restfull.core.entities.Empleado;

@Repository
public class EmpleadoRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;


	public List<Empleado> getAllEmpleados() {
		String sql = "select id_empleado\r\n"
				+ "from empleado;";
		List<Empleado> empleadoList = new ArrayList<Empleado>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Empleado empleado = new Empleado();
			Long empleado_id = ((Number)row.get("id_empleado")).longValue();
			empleado.setIdEmpleado((int)empleado_id.intValue());
			empleadoList.add(empleado);
		});
		return empleadoList;
	}

	public List<Empleado> getEmpleadoById(Long id) {
		String sql = "select id_empleado\r\n"
				+ "from empleado where id_empleado = "+id+" ;";
		List<Empleado> empleadoList = new ArrayList<Empleado>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Empleado empleado = new Empleado();
			Long empleado_id = ((Number)row.get("id_empleado")).longValue();
			empleado.setIdEmpleado((int)empleado_id.intValue());
			empleadoList.add(empleado);
		});
		return empleadoList;
	}


}
