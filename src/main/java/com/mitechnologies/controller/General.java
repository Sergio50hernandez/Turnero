package com.mitechnologies.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mitechnologies.helper.Excel;
import com.mitechnologies.model.Empleado;
import com.mitechnologies.repository.BdMitech;
import com.mitechnologies.service.EmpleadoServices;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

@Controller
public class General {

	ModelAndView mav= new ModelAndView();
	@Autowired
	BdMitech repo;
	 
	@GetMapping("/general")
	public ModelAndView Empleado()
	{
		List <Empleado> list= new ArrayList<Empleado>();

		list=repo.consulta();
		/*for(Empleado e:list)
		{
			System.out.println(e.getNombre());
		}*/
		System.out.println("vista general ---------------");
		mav.addObject("empleados", list);
		mav.setViewName("general");
		return mav;
	}

	
}










