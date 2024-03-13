package com.example.demo.repository2;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.dto.DtoMatricula;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MatriculaRepositoryImpl implements IMatriculaRepository {

	@PersistenceContext
    private EntityManager entityManager;
	
	@Override
	 @Transactional(Transactional.TxType.MANDATORY)
	public void insertar(Matricula m) {
		// TODO Auto-generated method stub
		this.entityManager.persist(m);
	}

	@Override
	@Transactional(Transactional.TxType.NOT_SUPPORTED)
	public List<DtoMatricula> encontrarListaDto() {
		 String postDto = "SELECT new com.example.demo.repository.modelo.dto.DtoMatricula(m.estudiante.cedula , m.estudiante.apellido, m.materia.nombre, m.materia.codigo, m.fecha) FROM Matricula m";
	        TypedQuery<DtoMatricula> query = this.entityManager.createQuery(postDto, DtoMatricula.class);
	        return query.getResultList();
	}

}
