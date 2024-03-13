package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository2.IEstudianteRepository;

import jakarta.transaction.Transactional;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

	 @Autowired
	    private IEstudianteRepository estudianteRepository;

	
	@Override
    @Transactional(Transactional.TxType.REQUIRES_NEW)
	public void guardar(Estudiante e) {
		// TODO Auto-generated method stub
		this.estudianteRepository.insertar(e);
	}

	@Override
    @Transactional(Transactional.TxType.REQUIRES_NEW)
	public Estudiante buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.encontrarPorCedula(cedula);
	}

}
