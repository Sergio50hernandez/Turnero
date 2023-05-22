package com.mitechnologies.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mitechnologies.model.Empleado;


@Repository
public class BdMitech {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/* MÉTODO QUE INSERTA NUEVOS EMPLEADOS */	
	public void insert(String numero,String nombre,String buenos,String malos,String total)
	{
		String sql="INSERT INTO VENTILADORES(numero,nombre,buenos,malos,total) VALUES(?,?,?,?,?);";
		jdbcTemplate.update(sql,numero,nombre,buenos,malos,total);
		System.out.println("Se ejecuto el metodo insertar");
	}
	/* MÉTODO QUE ACTUALIZA INFORMACION */
	public void update(int numero,String nombre,String buenos,String malos,String total)
	{
		String sql="UPDATE VENTILADORES SET nombre=?,buenos=?,malos=?,total=?" +" WHERE numero=?";
		jdbcTemplate.update(sql,nombre,buenos,malos,total,numero);
		System.out.println();
		System.out.println("Se ejecuto el metodo actualizar");
	}
	/* MÉTODO QUE ELIMINA INFORMACION */
	public void delete(int numero)
	{
		String sql="DELETE FROM VENTILADORES WHERE numero=?";
		jdbcTemplate.update(sql,numero);
		System.out.println();
		System.out.println("Se ejecuto el metodo eliminar");
	}

	/* MÉTODO QUE MUESTRA TODOS LOS REGISTROS  */
	public List<Empleado> consulta()
	{
		String sql="SELECT * FROM VENTILADORES";
		List<Empleado> list=null;
		list=jdbcTemplate.query(sql, new BeanPropertyRowMapper<Empleado>(Empleado.class));
		return list;
	}

}
