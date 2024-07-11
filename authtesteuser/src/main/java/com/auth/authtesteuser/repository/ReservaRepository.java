package com.auth.authtesteuser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.auth.authtesteuser.entity.Livro;
import com.auth.authtesteuser.entity.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long>{
    
    @Query("SELECT r.livro FROM Reserva r WHERE r.livro.id = :livroId")
    Livro findByLivroId(@Param("livroId") Long livroId);
}
