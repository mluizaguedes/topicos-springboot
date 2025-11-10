package com.mluizaguedes.springboot.service;

import java.util.List;

import com.mluizaguedes.springboot.entity.Anotacao;

public interface AnotacaoService {

    public Anotacao nova(Anotacao anotacao);

    public List<Anotacao> todas();

    public Anotacao buscarPorId(Long id);

    public List<Anotacao> buscarPorNomeUsuarioETexto(String nomeUsuario, String texto);
    
}