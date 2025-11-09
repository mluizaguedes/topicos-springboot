package com.mluizaguedes.springboot.service;

import java.util.List;

import com.mluizaguedes.springboot.entity.Usuario;

public interface UsuarioService {

    public Usuario novo(Usuario usuario);

    public List<Usuario> buscarTodos();

    public Usuario buscarPeloId(Long id);

    public Usuario buscarPorNomeESenha(String nome, String senha);
    
}