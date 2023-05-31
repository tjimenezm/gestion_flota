package com.restfull.core.repository;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.Date;
import com.restfull.core.entities.Vehiculo;

@Repository
public class VehiculoRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;


	public List<Vehiculo> getAllVehiculos() {
		String sql = "select id_vehiculo,patente,numero_motor,fecha_revision_tecnica"
				+ ",marca,anio,modelo,consecionario,aseguradora,poliza,fecha_poliza,fecha_ingreso"
				+ ",fecha_baja,tipo,estado\r\n"
				+ "from vehiculo;";
		List<Vehiculo> vehiculoList = new ArrayList<Vehiculo>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Vehiculo vehiculo = new Vehiculo();
			Long vehiculo_id = ((Number)row.get("id_vehiculo")).longValue();
			Long anio = ((Number)row.get("id_vehiculo")).longValue();
			vehiculo.setIdVehiculo((int)vehiculo_id.intValue());
			vehiculo.setPatente((String)row.get("patente"));
			vehiculo.setNumeroMotor((String)row.get("numero_motor"));
			vehiculo.setFechaRevisionTecnica((Date)row.get("fecha_revision_tecnica"));
			vehiculo.setMarca((String)row.get("marca"));
			vehiculo.setAnio((int)anio.intValue());
			vehiculo.setModelo((String)row.get("modelo"));
			vehiculo.setConsecionario((String)row.get("consecionario"));
			vehiculo.setAseguradora((String)row.get("aseguradora"));
			vehiculo.setPoliza((String)row.get("poliza"));
			vehiculo.setFechaPoliza((Date)row.get("fecha_poliza"));
			vehiculo.setFechaIngreso((Date)row.get("fecha_ingreso"));
			vehiculo.setFechaBaja((Date)row.get("fecha_baja"));
			vehiculo.setTipo((String)row.get("tipo"));
			vehiculo.setEstado((String)row.get("estado"));
			vehiculoList.add(vehiculo);
		});
		return vehiculoList;
	}

	public List<Vehiculo> getVehiculoById(Long id) {
		String sql = "select id_vehiculo,patente,numero_motor,fecha_revision_tecnica"
				+ ",marca,anio,modelo,consecionario,aseguradora,poliza,fecha_poliza,fecha_ingreso"
				+ ",fecha_baja,tipo,estado\r\n"
				+ "from vehiculo where id_vehiculo = "+id+" ;";
		List<Vehiculo> vehiculoList = new ArrayList<Vehiculo>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Vehiculo vehiculo = new Vehiculo();
			Long vehiculo_id = ((Number)row.get("id_vehiculo")).longValue();
			Long anio = ((Number)row.get("id_vehiculo")).longValue();
			vehiculo.setIdVehiculo(vehiculo_id.intValue());
			vehiculo.setPatente((String)row.get("patente"));
			vehiculo.setNumeroMotor((String)row.get("numero_motor"));
			vehiculo.setFechaRevisionTecnica((Date)row.get("fecha_revision_tecnica"));
			vehiculo.setMarca((String)row.get("marca"));
			vehiculo.setAnio((int)anio.intValue());
			vehiculo.setModelo((String)row.get("modelo"));
			vehiculo.setConsecionario((String)row.get("consecionario"));
			vehiculo.setAseguradora((String)row.get("aseguradora"));
			vehiculo.setPoliza((String)row.get("poliza"));
			vehiculo.setFechaPoliza((Date)row.get("fecha_poliza"));
			vehiculo.setFechaIngreso((Date)row.get("fecha_ingreso"));
			vehiculo.setFechaBaja((Date)row.get("fecha_baja"));
			vehiculo.setTipo((String)row.get("tipo"));
			vehiculo.setEstado((String)row.get("estado"));
			vehiculoList.add(vehiculo);
		});
		return vehiculoList;
	}


}
