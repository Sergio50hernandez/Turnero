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

import com.mitechnologies.helper.Excel;
import com.mitechnologies.model.Empleado;
import com.mitechnologies.service.EmpleadoServices;

@Controller
public class ExportExcel {
	@Autowired
	 private EmpleadoServices service;
	 
	@GetMapping("/excel")
	public void exportToExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("dd-MM-yy____HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
         
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=Reporte_General_______" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);
         
        List<Empleado> listEmpleados = service.listAll();
        Excel excelExporter = new Excel(listEmpleados);
         
        excelExporter.export(response);    
    }  


}
