package com.auth.authtesteuser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auth.authtesteuser.entity.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long>{
    
}
