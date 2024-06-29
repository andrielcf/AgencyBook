package com.auth.authtesteuser.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auth.authtesteuser.entity.Catalogo;

public interface CatalogoRepository extends JpaRepository<Catalogo, Long> {
    
    Catalogo findByTipo(String tipo);

}
