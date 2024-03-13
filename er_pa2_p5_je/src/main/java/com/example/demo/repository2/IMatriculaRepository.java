package com.example.demo.repository2;

import java.util.List;

import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.dto.DtoMatricula;

public interface IMatriculaRepository {
	public void insertar(Matricula m);
    public List<DtoMatricula> encontrarListaDto();
}
