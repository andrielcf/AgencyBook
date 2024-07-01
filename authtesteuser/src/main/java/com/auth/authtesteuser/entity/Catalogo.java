package com.auth.authtesteuser.entity;

import java.util.List;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Catalogo")
public class Catalogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private List<Livro> livro;

    public Catalogo(){

    }

    public Catalogo(Long id, Livro livro) {
        this.id = id;
        this.livro = (List<Livro>) livro;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
    public List<Livro> getLivros() {
        return livro;
    }

    public void setLivros(List<Livro> livros) {
        this.livro = livros;
    }



    
}