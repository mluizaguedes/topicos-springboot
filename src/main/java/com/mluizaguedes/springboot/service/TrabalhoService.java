package com.mluizaguedes.springboot.service;

import java.util.List;

import com.mluizaguedes.springboot.entity.Trabalho;

public interface TrabalhoService {

    public List<Trabalho> buscarTodos();

    public Trabalho novoTrabalho(Trabalho trabalho);

    public List<Trabalho> buscarPorTituloENomeUsuario(String titulo, String nomeUsuario);
    
}