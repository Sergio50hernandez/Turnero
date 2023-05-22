package com.mitechnologies.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitechnologies.model.Empleado;
import com.mitechnologies.repository.EmpleadoRepository;

@Service
public class EmpleadoServices {
	
		@Autowired
	    private EmpleadoRepository repo;
	     
	    public List<Empleado> listAll() {
	        return repo.findAll();
	    }


}
