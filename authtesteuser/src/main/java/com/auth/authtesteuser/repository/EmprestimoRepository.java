package com.auth.authtesteuser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.auth.authtesteuser.entity.Emprestimo;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {
    
    @Query("SELECT e FROM Emprestimo e WHERE e.livro.id = :livroId")
    Emprestimo findByLivroId(@Param("livroId") Long livroId);
}
