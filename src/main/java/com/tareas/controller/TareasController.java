package com.tareas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tareas.modelo.Tarea;
import com.tareas.service.ITareasService;

@Controller
public class TareasController {
	
	@Autowired
	ITareasService repositorio;
	
	@GetMapping
	public String index(Model modelo, Tarea tareas){
		modelo.addAttribute("tarea", new Tarea());
		modelo.addAttribute("tareas", repositorio.finAll());
		return "index";
	}
	
}
