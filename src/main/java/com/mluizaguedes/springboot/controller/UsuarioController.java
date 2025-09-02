package com.mluizaguedes.springboot.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mluizaguedes.springboot.entity.Usuario;
import com.mluizaguedes.springboot.service.UsuarioService;

@RestController
@CrossOrigin
@RequestMapping(value = "/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping
    public ResponseEntity<List<Usuario>> buscarTodos() { //json é o padrão spring, gera automaticamente
        return ResponseEntity.ok().body(service.buscarTodos());
    }

    @PostMapping
    public ResponseEntity<Usuario> cadastrarNovo(@RequestBody Usuario usuario){
        usuario = service.novo(usuario);
        return ResponseEntity.created(URI.create("/usuario/buscarPorId" + usuario.getId()))
        .body(usuario);
    }

    @GetMapping(value = "/buscarPorId/{idUsuario}") // para diferenciar os get's -> para cair nesse get é preciso chamar /usuario/buscarPorId
    public ResponseEntity<Usuario> buscarPorId(@PathVariable("idUsuario") Long id) {
        return ResponseEntity.ok().body(service.buscarPeloId(id));
    }

    }