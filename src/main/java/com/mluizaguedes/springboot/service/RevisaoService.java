package com.mluizaguedes.springboot.service;

import java.time.LocalDateTime;
import java.util.List;

import com.mluizaguedes.springboot.entity.Revisao;

public interface RevisaoService {

    public Revisao nova(Revisao revisao);

    public List<Revisao> todas();

    public List<Revisao> buscarPorTituloSecaoEDataHoraCriacao(String tituloSecao, LocalDateTime dataHoraCriacao);

    public Revisao buscarPorId(Long id);
    
}