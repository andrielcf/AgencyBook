package com.auth.authtesteuser.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.auth.authtesteuser.dto.CatalogoDTO;
import com.auth.authtesteuser.entity.Catalogo;
import com.auth.authtesteuser.repository.CatalogoRepository;

@Service
public class CatalogoService {
    

    @Autowired
    private CatalogoRepository catalogoRepository;

    public ResponseEntity criarCatalogo(CatalogoDTO data){



        if (catalogoRepository.findByTipo(data.tipo().toLowerCase()) == null) {
            Catalogo catalogo = new Catalogo(data.tipo().toLowerCase());
            catalogoRepository.save(catalogo);
            return ResponseEntity.ok().build();
        }else{
            return ResponseEntity.badRequest().build();
        }


    }

    public List<Catalogo> verCatalogos(){
        return catalogoRepository.findAll();
    }

}
