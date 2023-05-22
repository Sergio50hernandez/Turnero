package com.mitechnologies.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "ventiladores", schema = "proceso")
public class Empleado {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

	
	private String idempleado;
	

	private String nombre;
	

	private String numero;
	
	
	private String buenos;
	
	
	private String malos;
	
	
	private String total;
	
	

	public Empleado()
	{

	}

	public Empleado(String idempleado, String numero, String nombre,String buenos, String malos, String total) {
		super();
		this.idempleado = idempleado;

		this.nombre = nombre;
		this.numero= numero;
		this.buenos = buenos;
		this.malos = malos;
		this.total = total;
	}

	public String getIdempleado() {
		return idempleado;
	}

	public void setIdempleado(String idempleado) {
		this.idempleado = idempleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBuenos() {
		return buenos;
	}

	public void setBuenos(String buenos) {
		this.buenos = buenos;
	}

	public String getMalos() {
		return malos;
	}

	public void setMalos(String malos) {
		this.malos = malos;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	


}








