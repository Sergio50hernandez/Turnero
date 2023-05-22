package com.mitechnologies.controller;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mitechnologies.model.Empleado;
import com.mitechnologies.repository.BdMitech;

@Controller
public class Eliminar {
	ModelAndView mav= new ModelAndView();

	@Autowired
	BdMitech repo;
	
	
	


	@GetMapping("/eliminar")
	public ModelAndView Empleado()
	{
		
		List <Empleado> list= new ArrayList<Empleado>();

		list=repo.consulta();
		System.out.println("vista eliminar---------------");
		
		mav.addObject("empleados", list);
		mav.setViewName("eliminar");
		return mav;	
	}
	@PostMapping("eliminar")
	public ModelAndView Delete(@RequestParam String numero) throws IOException{

		    String numero2 = numero;
			int num =Integer.parseInt(numero2);
			repo.delete(num);
		return new ModelAndView("inicio");
}

	
	
}


