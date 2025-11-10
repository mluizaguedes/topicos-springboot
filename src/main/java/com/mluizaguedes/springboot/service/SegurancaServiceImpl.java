package com.mluizaguedes.springboot.service;

import java.util.stream.Collectors;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mluizaguedes.springboot.entity.Autorizacao;
import com.mluizaguedes.springboot.entity.Usuario;
import com.mluizaguedes.springboot.repository.UsuarioRepository;

@Service
public class SegurancaServiceImpl implements UserDetailsService {

    private UsuarioRepository usuarioRepo;

    public SegurancaServiceImpl(UsuarioRepository usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        Usuario usuario = usuarioRepo.findByNome(username).orElseThrow(() -> {
            throw new UsernameNotFoundException("Usuário não encontrado!");
        });
        return User.builder().username(username).password(usuario.getSenha())
                .authorities(usuario.getAutorizacoes().stream()
                        .map(Autorizacao::getNome).collect(Collectors.toList())
                        .toArray(new String[usuario.getAutorizacoes().size()]))
                .build();
    }

}
