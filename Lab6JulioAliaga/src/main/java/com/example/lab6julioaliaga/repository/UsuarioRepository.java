package com.example.lab6julioaliaga.repository;

import com.example.lab6julioaliaga.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    public Usuario findByEmail(String email);

}


