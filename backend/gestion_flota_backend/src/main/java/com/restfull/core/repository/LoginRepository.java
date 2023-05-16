package com.restfull.core.repository;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.restfull.core.entities.Login;

@Repository
public class LoginRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;


	public List<Login> getAllUsers() {
		List<Login> loginList = new ArrayList<Login>();
		String sql = "select id_login,l.usuario,p.nombre,p.primer_apellido , p2.nombre_perfil from login l, persona p, perfil p2 where l.persona_id = p.id_persona and l.perfil_id = p2.id_perfil;";
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Login login = new Login();
			login.setId_login((Long) row.get("id_login"));
			login.setUsuario((String) row.get("usuario"));
			loginList.add(login);
		});
		return loginList;
	}

}
