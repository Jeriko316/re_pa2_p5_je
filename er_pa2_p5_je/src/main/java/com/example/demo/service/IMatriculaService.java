package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.dto.DtoMatricula;

public interface IMatriculaService {

	 public void guardar(String cedula, String codigoMateria);
	    public List<DtoMatricula> buscarListaDto();
	
}