package com.restfull.core.repository;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.restfull.core.entities.Cliente;

@Repository
public class ClienteRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;


	public List<Cliente> getAllClientes() {
		String sql = "select id_cliente,persona_id,razon_social,direccion_id\r\n"
				+ "from cliente c2 ;";
		List<Cliente> clienteList = new ArrayList<Cliente>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Cliente cliente = new Cliente();
			Long persona_id = ((Number)row.get("persona_id")).longValue();
			cliente.setPersonaId((int)persona_id.intValue());
			cliente.setDireccionId(((Number)row.get("direccion_id")).longValue());
			cliente.setIdCliente((Long)row.get("id_cliente"));
			cliente.setRazonSocial((String)row.get("razon_social"));
			clienteList.add(cliente);
		});
		return clienteList;

	}

	public List<Cliente> getClienteById(Long id) {
		String sql = "select id_cliente,persona_id,razon_social,direccion_id\r\n"
				+ "from cliente c2 where id_cliente = "+id+";";
		List<Cliente> clienteList = new ArrayList<Cliente>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Cliente cliente = new Cliente();
			Long persona_id = ((Number)row.get("persona_id")).longValue();
			cliente.setPersonaId((int)persona_id.intValue());
			cliente.setDireccionId(((Number)row.get("direccion_id")).longValue());
			cliente.setIdCliente((Long)row.get("id_cliente"));
			cliente.setRazonSocial((String)row.get("razon_social"));
			clienteList.add(cliente);
		});
		return clienteList;

	}
}
