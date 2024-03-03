package com.tareas.service;

import java.util.List;

import com.tareas.modelo.Tarea;

public interface ITareasService {
	public List<Tarea>listar();

	public Tarea listTareasId(int id);

	public int agregar(Tarea t);

	public int editar(Tarea t);

	public void delete(int id);

	public Object finAll();
}
