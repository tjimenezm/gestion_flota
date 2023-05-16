package com.restfull.core.controllers;
	

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restfull.core.entities.Login;
import com.restfull.core.repository.LoginRepository;
	

	@RestController
	public class LoginController {
	

		@Autowired
		LoginRepository loginRepository;
	

		@GetMapping("/user_login")
		public List<Login> query() {
			return loginRepository.getAllUsers();
		}

	}
