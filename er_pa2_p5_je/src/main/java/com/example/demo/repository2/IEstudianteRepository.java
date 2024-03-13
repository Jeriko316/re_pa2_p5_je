package com.example.demo.repository2;

import com.example.demo.repository.modelo.Estudiante;

public interface IEstudianteRepository {

	public void insertar(Estudiante estudiante);
    public Estudiante encontrarPorCedula(String cedula);
	
}
