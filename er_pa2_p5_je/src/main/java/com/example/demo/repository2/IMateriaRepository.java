package com.example.demo.repository2;

import java.util.List;

import com.example.demo.repository.modelo.Materia;

public interface IMateriaRepository {

	 public void insertar(Materia materia);
	    public List<Materia> encontrarTodos();
	    public List<Materia> encontrarPorId(Integer id);
	    public Materia encontrarPorCodigo(String codigo);
	    public void actualizar(Materia materia);
	
}
