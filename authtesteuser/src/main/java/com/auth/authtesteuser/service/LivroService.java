package com.auth.authtesteuser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.auth.authtesteuser.dto.LivroDTO;
import com.auth.authtesteuser.entity.Livro;
import com.auth.authtesteuser.repository.CatalogoRepository;
import com.auth.authtesteuser.repository.LivroRepository;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    @Autowired CatalogoRepository catalogoRepository;

    public ResponseEntity criarLivro(LivroDTO data){


        if (data != null) {

            if (catalogoRepository.findById(data.catalogo().getId()) != null) {
                Livro livro = new Livro(data.titulo(), data.autor(), data.descricao(), false, data.catalogo());

                livroRepository.save(livro);

                return ResponseEntity.ok().build();
            }else{
                return ResponseEntity.badRequest().build();
            }

        }else{
            return ResponseEntity.badRequest().build();
        }

    }

    public ResponseEntity pesquisarLivro(String titulo){

        Livro livro = livroRepository.findByTitulo(titulo);

        if(livro != null){
            
            return ResponseEntity.ok(livro);
        }else{
            return ResponseEntity.badRequest().build();
        }

    }
    
}
