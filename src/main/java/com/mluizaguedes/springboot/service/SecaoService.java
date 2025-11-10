package com.mluizaguedes.springboot.service;

import java.util.List;

import com.mluizaguedes.springboot.entity.Secao;

public interface SecaoService {

    public Secao nova(Secao secao);

    public List<Secao> todas();

    public List<Secao> buscarPorTituloSecaoETituloTrabalho(String tituloSecao, String tituloTrabalho);

    public Secao buscarPorId(Long id);
    
}
