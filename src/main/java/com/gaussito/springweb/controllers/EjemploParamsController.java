package com.gaussito.springweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/params")
public class EjemploParamsController {

    @GetMapping("/")
    public ModelAndView index(ModelAndView model) {
        model.addObject("title", "Ejemplo enviar parámetros del Request HTTP GET");
        model.setViewName("params/index");
        return model;
    }

    @GetMapping("/string")
    public ModelAndView param(@RequestParam(name = "texto", required = false, defaultValue = "Nada") String texto, ModelAndView model) {
        model.addObject("title", "Ejemplo obtener parámetro del Request HTTP GET");
        model.addObject("texto", "El texto enviado es : " + texto);
        model.setViewName("params/string");
        return model;
    }

    @GetMapping("/mix-params")
    public ModelAndView param(@RequestParam String saludo, @RequestParam Integer numero, ModelAndView model) {
        model.addObject("title", "Ejemplo obtener parámetro del Request HTTP GET");
        model.addObject("texto", "El saludo enviado es : " + saludo + " y el número es : " + numero);
        model.setViewName("params/string");
        return model;
    }

    @GetMapping("/mix-params-request")
    public ModelAndView param(HttpServletRequest request, ModelAndView model) {
        String saludo = request.getParameter("saludo");
        int numero;
        try {
            numero = Integer.parseInt(request.getParameter("numero"));
        } catch (NumberFormatException error){
            numero = 0;
        }
        model.addObject("title", "Ejemplo obtener parámetro del Request HTTP GET");
        model.addObject("texto", "El saludo enviado es : " + saludo + " y el número es : " + numero);
        model.setViewName("params/string");
        return model;
    }
}
