package br.edu.ifrs.canoas.tcc.sisbov.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CalendarioController {
	
	@RequestMapping("/calendario")
	public String calendario() {
		return "calendario";
	}

}
