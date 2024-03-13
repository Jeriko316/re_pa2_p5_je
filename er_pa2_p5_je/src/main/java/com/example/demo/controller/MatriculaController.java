package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.dto.DtoMatricula;
import com.example.demo.service.IMatriculaService;

@Controller
@RequestMapping("/matriculas")
public class MatriculaController {

	@Autowired
    private IMatriculaService matriculaService;

	
	 @GetMapping("/nuevaMatricula")
	    private String nuevaMatricula(Matricula matricula){
	        return "vistaNuevaMatricula";
	    }
	 
	 @PostMapping("/ingresarMatricula")
	    private String ingresarMatricula(Matricula matricula){
	        String cedula = matricula.getEstudiante().getCedula();
	        String codigo = matricula.getMateria().getCodigo();

	        this.matriculaService.guardar(cedula, codigo);
	        return "redirect:/matriculas/listaMatriculas";
	    }
	 
	 @GetMapping("/listaMatriculas")
	    private String listaMatriculas(Model model){
	        List<DtoMatricula> lista = this.matriculaService.buscarListaDto();
	        model.addAttribute("lista", lista);
	        return "vistaListaMatriculas";
	    }
	
}
