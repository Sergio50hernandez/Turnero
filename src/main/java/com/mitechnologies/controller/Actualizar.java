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
public class Actualizar {

	ModelAndView mav= new ModelAndView();

	@Autowired
	BdMitech repo;
	
	
	


	@GetMapping("/actualizar")
	public ModelAndView Empleado()
	{
		
		
		List <Empleado> list= new ArrayList<Empleado>();

		list=repo.consulta();
		/*for(Empleado e:list)
		{
			System.out.println(e.getNombre()+e.getBuenos());
		}*/
		
		System.out.println("vista actualizar ---------------");
		System.out.println("vista actualizar ---------------");
		mav.addObject("empleados", list);
		
		mav.setViewName("actualizar");
		return mav;	
	}
	
	@PostMapping("actualizar")
	public ModelAndView Upload(@RequestParam String numero,
			@RequestParam String nombre,@RequestParam String buenos, 
			@RequestParam String malos) throws IOException{

		    String numero2 = numero;
			String nombre2 = nombre;
			String buenos2 = buenos;
			String malos2 = malos;
			

			int suma= Integer.parseInt(buenos2)+Integer.parseInt(malos2);
			String total2 = String.valueOf(suma);
			
			int num =Integer.parseInt(numero2);
			
		
			System.out.println(" Numero empleado: "+numero +" Nombre: "+ nombre +" V.Buenos "+ buenos +" V.Malos"+ malos+ "");	
			
			repo.update(num,nombre2,buenos2,malos2,total2);
			

		return new ModelAndView("inicio");
}
	
	
}
