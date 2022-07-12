package com.gaussito.springweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/variables")
public class EjemploVariablesRutaController {


    @GetMapping("/")
    public ModelAndView index(ModelAndView model){
        model.setViewName("variables/index");
        model.addObject("title","Index de Variables usando @PathVariable");
        return model;
    }

    @GetMapping("/string/{texto}")
    public ModelAndView variables(@PathVariable String texto, ModelAndView model){
        model.addObject("title","Ejemplo obtener parámetro de la ruta (@PathVariable)");
        model.addObject("texto", "El texto es: " + texto);
        model.setViewName("variables/ver");
        return model;
    }

    @GetMapping("/string/{texto}/{numero}")
    public ModelAndView variables(@PathVariable String texto,@PathVariable Integer numero, ModelAndView model){
        model.addObject("title","Ejemplo obtener parámetro de la ruta (@PathVariable)");
        model.addObject("texto", "El texto es: " + texto + ", el número es: " + numero);
        model.setViewName("variables/ver");
        return model;
    }

}
