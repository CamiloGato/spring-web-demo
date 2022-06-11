package com.gaussito.springweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class IndexController {

    @GetMapping(path = {"/","/index","/home"})
    public ModelAndView index(ModelAndView model){
        model.addObject("title","Hola Spring Framework with Model And View");
        model.setViewName("index");
        return model;
    }

}
