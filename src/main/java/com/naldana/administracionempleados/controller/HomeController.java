package com.naldana.administracionempleados.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String greeting(Model model) {
		model.addAttribute("id", 1);
		model.addAttribute("name", "Néstor");
		model.addAttribute("lastName", "Aldana");
		model.addAttribute("email", "naldana@uca.edu.sv");
		return "index";
	}
}
