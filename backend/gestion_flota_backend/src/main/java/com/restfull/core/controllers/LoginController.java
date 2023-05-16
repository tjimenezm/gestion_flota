package com.restfull.core.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.restfull.core.repository.LoginRepository;
import org.springframework.web.bind.annotation.*;
import com.restfull.core.entities.Login;


@RestController
public class LoginController {


	@Autowired
	private LoginRepository loginRepository;


	public List<Login> getAllLogins(){

		return loginRepository.getAllLogins();
	}


	@GetMapping("/users")
	public List<Login> query() {
		return getAllLogins();
	}
	@GetMapping("/users/{usuario}")
	public List<Login> getUserByLogin(@PathVariable String usuario) {
		return loginRepository.getUserByLogin(usuario);
	}
}
