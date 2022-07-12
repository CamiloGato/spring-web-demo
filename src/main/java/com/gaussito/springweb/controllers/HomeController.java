package com.gaussito.springweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @GetMapping("/")
    public ModelAndView home(ModelAndView model){
        model.setViewName("forward:/app/index");
        return model;
    }
}
