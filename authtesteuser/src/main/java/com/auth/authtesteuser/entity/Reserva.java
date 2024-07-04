package com.auth.authtesteuser.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date dataReserva;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private User user;


    @ManyToOne
    @JoinColumn(name = "livro_id")
    private Livro livro;


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public Date getDataReserva() {
        return dataReserva;
    }


    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }


    public User getUser() {
        return user;
    }


    public void setUser(User user) {
        this.user = user;
    }


    public Livro getLivro() {
        return livro;
    }


    public void setLivro(Livro livro) {
        this.livro = livro;
    }


    
    
}
