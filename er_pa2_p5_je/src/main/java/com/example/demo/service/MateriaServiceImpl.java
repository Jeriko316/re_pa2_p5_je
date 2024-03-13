package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.modelo.Materia;
import com.example.demo.repository2.IMateriaRepository;

import jakarta.transaction.Transactional;

@Service
public class MateriaServiceImpl implements IMateriaService {

	 @Autowired
	    private IMateriaRepository materiaRepository;

	
	@Override
	 @Transactional(Transactional.TxType.REQUIRES_NEW)
	public void guardar(Materia materia) {
		// TODO Auto-generated method stub
		this.materiaRepository.insertar(materia);}

	@Override
	  @Transactional(Transactional.TxType.REQUIRES_NEW)
	public List<Materia> buscarTodos() {
		// TODO Auto-generated method stub
		 return this.materiaRepository.encontrarTodos();}

	@Override
	 @Transactional(Transactional.TxType.REQUIRES_NEW)
	public List<Materia> buscarPorId(Integer id) {
		// TODO Auto-generated method stub
        return this.materiaRepository.encontrarPorId(id);}

	@Override
    @Transactional(Transactional.TxType.REQUIRES_NEW)
	public Materia buscarPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		return this.materiaRepository.encontrarPorCodigo(codigo);}
}
