package com.websocket.divertoland.repository;

import com.websocket.divertoland.domain.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Usuario,Long> {

    Optional<Usuario> findByEmailAndSenha(String email, String password);
}