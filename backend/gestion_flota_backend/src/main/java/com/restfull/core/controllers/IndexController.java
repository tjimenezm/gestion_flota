package com.restfull.core.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class IndexController {
	
	@GetMapping("/")
	@ResponseBody
    public String helloWorld() {
        return "BackEnd Gestion de Flota";
    }
}
