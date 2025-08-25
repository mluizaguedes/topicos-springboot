package com.mluizaguedes.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mluizaguedes.springboot.entity.Usuario;

// interface é onde falo a estrutura, não tem codigo
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{ 
    //vai me permitir buscas pelo id
}
