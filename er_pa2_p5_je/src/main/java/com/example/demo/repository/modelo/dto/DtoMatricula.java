package com.example.demo.repository.modelo.dto;

public class DtoMatricula {

	  private String cedula;
	    private String apellido;
	    private String nombre; 
	    private String codigo; 
	    private String fecha; 
	    
		

		public String getCedula() {
			return cedula;
		}

		public void setCedula(String cedula) {
			this.cedula = cedula;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
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

		public String getFecha() {
			return fecha;
		}

		public void setFecha(String fecha) {
			this.fecha = fecha;
		}
	    
	    
		public DtoMatricula(String cedula, String apellido, String nombre, String codigo, String fecha) {
			super();
			this.cedula = cedula;
			this.apellido = apellido;
			this.fecha = fecha;
			this.nombre = nombre;
			this.codigo = codigo;
		}
	
}
