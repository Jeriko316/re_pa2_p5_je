package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/menu")
public class MenuController {

	//http://localhost:8082/universidad/menu/general
    @GetMapping("/general")
    private String menuGeneral(){
        return "vistaGeneral";
    }
	
}
