package com.mluizaguedes.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mluizaguedes.springboot.entity.Anotacao;

public interface AnotacaoRepository extends JpaRepository<Anotacao, Long>{
    
}
