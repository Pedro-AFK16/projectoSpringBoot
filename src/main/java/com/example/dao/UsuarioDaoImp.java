package com.example.dao;

import com.example.models.Usuario;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transacional
public class UsuarioDaoImp implements UsuarioDao{
    @Override
    public List<Usuario> getUsuario() {
        return List.of();
    }
}
