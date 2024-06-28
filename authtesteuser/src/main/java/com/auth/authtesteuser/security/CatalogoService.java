package com.auth.authtesteuser.security;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auth.authtesteuser.dto.CatalogoDTO;
import com.auth.authtesteuser.entity.Catalogo;
import com.auth.authtesteuser.repository.CatalogoRepository;

@Service
public class CatalogoService {
    

    @Autowired
    private CatalogoRepository catalogoRepository;

    public void criarCatalogo(CatalogoDTO data){
        
        Catalogo catalogo = new Catalogo(data.tipo());

        catalogo.setTipo(data.tipo());

        catalogoRepository.save(catalogo);

    }

    public List<Catalogo> verCatalogos(){
        return catalogoRepository.findAll();
    }

}
