package com.tareas.interfaz;

import java.util.List;

import com.tareas.modelo.Tarea;

public interface ITareas {
	public List<Tarea>listar();

	public Tarea listTareasId(int id);

	public int agregar(Tarea t);

	public int editar(Tarea t);

	public void delete(int id);

}
