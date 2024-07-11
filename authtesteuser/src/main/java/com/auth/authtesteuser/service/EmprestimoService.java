package com.auth.authtesteuser.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Service;


import com.auth.authtesteuser.entity.Emprestimo;
import com.auth.authtesteuser.entity.Historico;
import com.auth.authtesteuser.repository.EmprestimoRepository;
import com.auth.authtesteuser.repository.HistoricoRepository;

@Service
public class EmprestimoService {
    


    @Autowired
    private EmprestimoRepository emprestimoRepository;

    @Autowired
    private HistoricoRepository historicoRepository;


    public ResponseEntity registrarEmprestimoUser(Emprestimo data){

        emprestimoRepository.save(data);

        Historico historico = new Historico(data, data.getUser());

        historicoRepository.save(historico);

        return ResponseEntity.ok().build();


    }
    
}
