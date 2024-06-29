package com.auth.authtesteuser.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Livro {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String autor;

    private String descricao;

    private Boolean status;

    @ManyToOne
    @JoinColumn(name = "catalogo_id")
    private Catalogo catalogo;

    

    public Livro() {
        
    }



    public Livro(String titulo, String autor, String descricao, Boolean status) {
        this.titulo = titulo;
        this.autor = autor;
        this.descricao = descricao;
        this.status = status;
    }

    

    public Livro(String titulo, String autor, String descricao, Boolean status, Catalogo catalogo) {
        this.titulo = titulo;
        this.autor = autor;
        this.descricao = descricao;
        this.status = status;
        this.catalogo = catalogo;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    

}
