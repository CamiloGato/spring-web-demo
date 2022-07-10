package com.gaussito.springweb.controllers;

import com.gaussito.springweb.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Controller
@RequestMapping("/app")
public class IndexController {

    @GetMapping(path = {"","/","/index","/home"})
    public ModelAndView index(ModelAndView model){
        model.addObject("title","Hola Spring Framework with Model And View");
        model.setViewName("index");
        return model;
    }

    @RequestMapping(path = "/perfil", method = RequestMethod.GET)
    public ModelAndView perfil(ModelAndView model){
        Usuario usuario = new Usuario();
        usuario.setNombre("Juan");
        usuario.setApellido("Perez");
        model.addObject("usuario", usuario);
        model.addObject("title","Perfil de usuario: " + usuario.getNombre());
        model.setViewName("perfil");
        return model;
    }

    @RequestMapping(path = "/usuarios", method = RequestMethod.GET)
    public ModelAndView usuarios(ModelAndView model){
        model.addObject("title","Listado de usuarios");
        model.setViewName("usuarios");
        return model;
    }

    @ModelAttribute("usuarios")
    public List<Usuario> getUsuarios() {
        List<Usuario> usuarios = Arrays.asList(
                new Usuario("Juan", "Perez", "test@test.com"),
                new Usuario("Pedro", "Perez"),
                new Usuario("Maria", "Perez")
        );
        return usuarios;
    }
}
