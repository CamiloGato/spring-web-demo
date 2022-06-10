package com.gaussito.springweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {

    @GetMapping(path = {"/","/index","/home"})
    public String index(Model model){
        model.addAttribute("Titulo","Hola Spring Framework");
        return "index";
    }

}
