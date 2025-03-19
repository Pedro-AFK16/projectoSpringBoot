package com.example.demo.controllers;

import com.example.models.Usuario;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {
    @RequestMapping("/user")
    public Usuario getUsuario(){
        Usuario user = new Usuario("Tissera","Pedro","pepe@gmail.com",1234,"pep1004");
        return user;
    };

}
