package com.mitechnologies.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;
import com.mitechnologies.repository.BdMitech;




@Controller
public class Inicio {
	@Autowired
	BdMitech bd;
	ModelAndView mav= new ModelAndView();

	@GetMapping("/inicio")
	public ModelAndView inicioView()
	{
		System.out.println("vista inicio ---------------");
		return new ModelAndView("inicio");
	}

	@PostMapping("general")
	public ModelAndView Upload(@RequestParam String numero,
			@RequestParam String nombre,@RequestParam String  buenos, 
			@RequestParam String malos) throws IOException{
		{
			
			String numero2 = numero;
			String nombre2 = nombre;
			String buenos2 = buenos;
			String malos2 = malos;

			int suma= Integer.parseInt(buenos2)+Integer.parseInt(malos2);
			String total2 = String.valueOf(suma);
			
			

			bd.insert(numero2,nombre2,buenos2,malos2,total2);
		}
		return new ModelAndView("inicio");
	}
}



