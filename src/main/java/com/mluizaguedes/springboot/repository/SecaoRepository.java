package com.mluizaguedes.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mluizaguedes.springboot.entity.Secao;

public interface SecaoRepository extends JpaRepository<Secao, Long>{

    public List<Secao> findByTituloContainsAndTrabalhoTituloContains(String tituloSecao, String tituloTrabalho);
    
}