package com.kruger.intro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuarioController {
    
    //Generar un listado
    @GetMapping("/user")
    public String user(Model model){
        model.addAttribute("titulo", "spring boot");
        model.addAttribute("message", "saludos con todos");
        return "user";
    }

    //Generar un ingreso de datos

    //Ver un dato de usuario en la lista
}
