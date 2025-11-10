package com.mluizaguedes.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mluizaguedes.springboot.entity.Comentario;

public interface ComentarioRepository extends JpaRepository<Comentario, Long>{

    public List<Comentario> findByTrabalhoTituloContainsAndUrgenciaLessThan(String tituloTrabalho, Integer urgencia);
    
}