package com.auth.authtesteuser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auth.authtesteuser.entity.Historico;

public interface HistoricoRepository extends JpaRepository<Historico, Long> {
    
}
