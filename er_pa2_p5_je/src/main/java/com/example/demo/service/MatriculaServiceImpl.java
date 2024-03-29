package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.Materia;
import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.dto.DtoMatricula;
import com.example.demo.repository2.IEstudianteRepository;
import com.example.demo.repository2.IMateriaRepository;
import com.example.demo.repository2.IMatriculaRepository;

import jakarta.transaction.Transactional;


@Service
public class MatriculaServiceImpl implements IMatriculaService{

	@Autowired
    private IMatriculaRepository matriculaRepository;
    
	@Autowired
    private IMateriaRepository materiaRepository;
    
	@Autowired
    private IEstudianteRepository estudianteRepository;
	
	@Override
	  @Transactional(Transactional.TxType.REQUIRES_NEW)
	public void guardar(String cedula, String codigoMateria) {
		// TODO Auto-generated method stub
		Estudiante estudianteAux = this.estudianteRepository.encontrarPorCedula(cedula);
        Materia materiaAux = this.materiaRepository.encontrarPorCodigo(codigoMateria);
        String fecha = LocalDate.now().toString();
        materiaAux.setnEstudiantes(materiaAux.getnEstudiantes()+1);
        Matricula matricula = new Matricula();
        matricula.setEstudiante(estudianteAux);
        matricula.setMateria(materiaAux);
        matricula.setFecha(fecha);
            
        this.materiaRepository.actualizar(materiaAux);
        this.matriculaRepository.insertar(matricula);
	}

	@Override
    @Transactional(Transactional.TxType.REQUIRES_NEW)
	public List<DtoMatricula> buscarListaDto() {
		// TODO Auto-generated method stub
		 return this.matriculaRepository.encontrarListaDto();
	}

	
}
