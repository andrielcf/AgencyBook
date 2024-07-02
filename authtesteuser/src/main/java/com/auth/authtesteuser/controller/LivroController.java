package com.auth.authtesteuser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auth.authtesteuser.dto.LivroDTO;
import com.auth.authtesteuser.service.LivroService;

@RestController
@RequestMapping("/livro")
public class LivroController {
    

    @Autowired
    private LivroService livroService;

    @PostMapping("/criar")
    public ResponseEntity criarLivro(@RequestBody LivroDTO data){
        return livroService.criarLivro(data);
    }

    @GetMapping("/pesquisar/{titulo}")
    public ResponseEntity pesquisarLivro(@PathVariable String titulo){

        return livroService.pesquisarLivro(titulo);

    }
}
