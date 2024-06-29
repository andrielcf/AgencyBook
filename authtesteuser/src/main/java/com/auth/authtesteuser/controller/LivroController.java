package com.auth.authtesteuser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auth.authtesteuser.service.LivroService;

@RestController
@RequestMapping("/livro")
public class LivroController {
    

    @Autowired
    private LivroService livroService;

    public ResponseEntity criarLivro(){
        return ResponseEntity.ok().build();
    }
}
