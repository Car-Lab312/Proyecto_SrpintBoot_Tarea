package com.tareas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tareas.interfaz.ITareas;
import com.tareas.modelo.Tarea;

@Service
public class TareasService implements ITareasService{
	
	@Autowired
	private ITareas Interf;
	
	@Override
	public List<Tarea> listar() {
		return Interf.listar();
	}

	@Override
	public Tarea listTareasId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int agregar(Tarea a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int editar(Tarea e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object finAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
