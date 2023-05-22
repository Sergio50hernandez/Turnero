package com.mitechnologies.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mitechnologies.model.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {

}
