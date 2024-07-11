package com.auth.authtesteuser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auth.authtesteuser.entity.Reserva;
import com.auth.authtesteuser.service.ReservaService;

@RestController
@RequestMapping("/reserva")
public class ReservaController {
    
    
    @Autowired
    private ReservaService reservaService;
    
    @PostMapping("/registrar")
    public ResponseEntity reservarLivro(@RequestBody Reserva data){

        return reservaService.reservarLivro(data);
    }
}
