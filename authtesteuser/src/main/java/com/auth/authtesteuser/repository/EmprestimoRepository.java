package com.auth.authtesteuser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auth.authtesteuser.entity.Emprestimo;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {
    
}
