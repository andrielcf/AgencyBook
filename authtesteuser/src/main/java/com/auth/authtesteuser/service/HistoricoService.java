package com.auth.authtesteuser.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auth.authtesteuser.entity.Historico;
import com.auth.authtesteuser.repository.HistoricoRepository;

@Service
public class HistoricoService {
    

    @Autowired
    private HistoricoRepository historicoRepository;

    public List<Historico> verHistorico(){
        return historicoRepository.findAll();
    }
}
