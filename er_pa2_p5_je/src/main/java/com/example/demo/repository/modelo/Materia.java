package com.example.demo.repository.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "materia")
public class Materia {
	
	@Id
    @SequenceGenerator(name = "seq_materia", sequenceName = "seq_materia", allocationSize = 1)
    @GeneratedValue(generator = "seq_materia", strategy = GenerationType.SEQUENCE)
    @Column(name = "mate_id")
    private Integer id;
	
    @Column(name = "mate_nombre")
    private String nombre;
    
    @Column(name = "mate_codigo")
    private String codigo;
    
    @Column(name = "mate_creditos")
    private String creditos;
    
    @Column(name = "mate_descripcion")
    private String descripcion;
    
    @Column(name = "mate_numero_estudiantes")
    private Integer nEstudiantes;

   
    @OneToMany(mappedBy = "materia")
    private List<Matricula> matriculas;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCreditos() {
		return creditos;
	}

	public void setCreditos(String creditos) {
		this.creditos = creditos;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getnEstudiantes() {
		return nEstudiantes;
	}

	public void setnEstudiantes(Integer nEstudiantes) {
		this.nEstudiantes = nEstudiantes;
	}

	public List<Matricula> getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(List<Matricula> matriculas) {
		this.matriculas = matriculas;
	}

    
    
}
