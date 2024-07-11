package com.auth.authtesteuser.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auth.authtesteuser.entity.Livro;


public interface LivroRepository extends JpaRepository<Livro, Long> {
    

    Livro findByTitulo(String titulo);

    Optional<Livro> findById(Long id);

}
