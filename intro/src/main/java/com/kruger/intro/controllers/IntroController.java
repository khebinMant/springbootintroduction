package com.kruger.intro.controllers;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IntroController {


    @Value("${texto.properties.index.titulo}")
    private String textoIndex;
    // private String texto;
    //localhost:8080/index
    //vista o simplemente enviar un mensaje
	
    @GetMapping("/index")
    public String index(Model model){
        System.out.println(textoIndex);
        model.addAttribute("message", "este es un mensaje MVC");
        model.addAttribute("textoIndex", textoIndex);
        return "index";
    }

}
