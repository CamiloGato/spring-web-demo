package com.gaussito.springweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;


@Controller
public class IndexController {

    @GetMapping(path = {"/","/index","/home"})
    public ModelAndView index(ModelAndView model){
        model.addObject("title","Hola Spring Framework");
        model.setViewName("index");
        return model;
    }

}
