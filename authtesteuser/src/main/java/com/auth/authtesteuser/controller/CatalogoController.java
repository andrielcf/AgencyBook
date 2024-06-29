package com.auth.authtesteuser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auth.authtesteuser.dto.CatalogoDTO;
import com.auth.authtesteuser.service.CatalogoService;

@RestController
@RequestMapping("/catalogo")
public class CatalogoController {
    

    @Autowired
    private CatalogoService catalogoService;

    @PostMapping("/criar")
    public ResponseEntity criandoCatalogo(@RequestBody CatalogoDTO catalogoDTO){

        return catalogoService.criarCatalogo(catalogoDTO);
    }

    @GetMapping("/ver")
    public ResponseEntity verCatalogos(){
        return ResponseEntity.ok(catalogoService.verCatalogos());
    }
    
}
