package com.mitechnologies.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.lowagie.text.DocumentException;

import com.mitechnologies.helper.Pdf;
import com.mitechnologies.model.Empleado;
import com.mitechnologies.service.EmpleadoServices;

@Controller
public class ExportPdf {
	@Autowired
	 private EmpleadoServices service;
	
	@GetMapping("/pdf")
	public void generatePdfFile(HttpServletResponse response) throws DocumentException, IOException 
	{
	  response.setContentType("application/pdf");
	  DateFormat dateFormat = new SimpleDateFormat("dd-MM-yy____HH:mm:ss");
	  String currentDateTime = dateFormat.format(new Date());
	  String headerkey = "Content-Disposition";
	  String headervalue = "attachment; filename=student" + currentDateTime + ".pdf";
	  response.setHeader(headerkey, headervalue);
	  List < Empleado > listofEmployees = service.listAll();
	  Pdf generator = new Pdf();
	  generator.generate(listofEmployees, response);
	}
	
	
	
	 


}






