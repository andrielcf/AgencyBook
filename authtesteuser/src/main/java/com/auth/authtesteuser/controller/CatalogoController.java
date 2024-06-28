package com.auth.authtesteuser.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.CatalogoRepository;


@RestController
@RequestMapping("/catalogo")
public class CatalogoController {

    @Autowired 
    private CatalogoRepository catalogoRepository;

    @PostMapping("/{id}")
    public List<Livro> AdicionarLivros(@PathVariable Long id ){

    }

    @PostMapping("/{id}")
    public Livro AdicionarLivro(@PathVariable Long id ){
        
    }

    @GetMapping()
    public Catalogo VerLivros(){
      
    }

    @PutMapping("/{id}")
    public Catalogo EditarLivro(@PathVariable Long id){

    }

    @DeleteMapping("/{id}")
    public Catalogo ExcluirLivro(@PathVariable Long id)



    
}
