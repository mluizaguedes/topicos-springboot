package com.mluizaguedes.springboot.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mluizaguedes.springboot.entity.Revisao;

public interface RevisaoRepository extends JpaRepository<Revisao, Long>{

    public List<Revisao> findBySecaoTituloContainsAndDataHoraCriacaoLessThan(String tituloSecao, LocalDateTime dataHoraCriacao);
    
}