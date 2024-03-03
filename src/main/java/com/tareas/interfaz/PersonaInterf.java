package com.tareas.interfaz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tareas.modelo.Tarea;

@Repository
public class PersonaInterf implements ITareas{
	
	@Autowired
	private JdbcTemplate template;

	@Override
	public List<Tarea> listar() {
		String sql="select * from tareas";
		List<Tarea>tarea = template.query(sql, new BeanPropertyRowMapper<Tarea>(Tarea.class));
		return tarea;
	}

	@Override
	public Tarea listTareasId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int agregar(Tarea t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int editar(Tarea t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
