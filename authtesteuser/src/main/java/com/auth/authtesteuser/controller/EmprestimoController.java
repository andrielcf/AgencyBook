package com.auth.authtesteuser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auth.authtesteuser.entity.Emprestimo;
import com.auth.authtesteuser.service.EmprestimoService;


@RestController
@RequestMapping("/emprestimo")
public class EmprestimoController {

    @Autowired
    private EmprestimoService emprestimoService;

    @PostMapping("/registrar")
    public ResponseEntity registrarEmprestimo(@RequestBody Emprestimo data){

        

        return emprestimoService.registrarEmprestimoUser(data);
    }
    
}
