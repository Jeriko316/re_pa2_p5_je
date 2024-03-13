package com.example.demo.repository2;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EstudianteRepositoryImpl implements IEstudianteRepository {

	@PersistenceContext
    private EntityManager entityManager;

	
	@Override
	@Transactional(Transactional.TxType.MANDATORY)
	public void insertar(Estudiante estudiante) {
		  this.entityManager.persist(estudiante);
	}

	@Override
	@Transactional(Transactional.TxType.NOT_SUPPORTED)
	public Estudiante encontrarPorCedula(String cedula) {
	        TypedQuery<Estudiante> query = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.cedula = :cedula", Estudiante.class);
	        query.setParameter("cedula", cedula);
	        return query.getSingleResult();
		 
	}

}
