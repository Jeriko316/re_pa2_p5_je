package com.example.demo.repository2;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Materia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MateriaRepositoryImpl implements IMateriaRepository {

	@PersistenceContext
    private EntityManager entityManager;
	
	@Override
	@Transactional(Transactional.TxType.MANDATORY)
	public void insertar(Materia materia) {
		// TODO Auto-generated method stub
        this.entityManager.persist(materia);
	}

	@Override
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
	public List<Materia> encontrarTodos() {
	        TypedQuery<Materia> query = 
	        this.entityManager.createQuery("SELECT m FROM Materia m", Materia.class);
	        return query.getResultList();
	}

	@Override
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
	public List<Materia> encontrarPorId(Integer id) {
		// TODO Auto-generated method stub
	        TypedQuery<Materia> query = this.entityManager.createQuery("SELECT m FROM Materia m WHERE m.id = :dato", Materia.class);
	        query.setParameter("dato", id);
	        return query.getResultList();
	}

	@Override
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
	public Materia encontrarPorCodigo(String codigo) {
	        TypedQuery<Materia> query = this.entityManager.createQuery("SELECT m FROM Materia m WHERE m.codigo = :datoCo", Materia.class);
	        query.setParameter("datoCo", codigo);
	        return query.getSingleResult();
	}

	@Override
	 @Transactional(Transactional.TxType.MANDATORY)
	public void actualizar(Materia materia) {
		// TODO Auto-generated method stub
        this.entityManager.merge(materia);
	}

}
