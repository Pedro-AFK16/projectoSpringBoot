package com.example.demo.controllers;

import com.example.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {
    @RequestMapping("/users/{id}")
    public Usuario getUsuario(@PathVariable int id){
        Usuario user = new Usuario(0,"Tissera","Pedro","pepe@gmail.com",1234,"pep1004");
        return user;
    };

}
