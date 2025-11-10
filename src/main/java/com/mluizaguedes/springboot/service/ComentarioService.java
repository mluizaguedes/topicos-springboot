package com.mluizaguedes.springboot.service;

import java.util.List;

import com.mluizaguedes.springboot.entity.Comentario;

public interface ComentarioService {

    public Comentario novo(Comentario comentario);

    public List<Comentario> todos();

    public List<Comentario> buscarPorTituloTrabalhoEUrgencia(String tituloTrabalho, Integer urgencia);

    public Comentario buscarPorId(Long id);
    
}