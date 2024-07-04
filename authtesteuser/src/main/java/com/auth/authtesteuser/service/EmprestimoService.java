package com.auth.authtesteuser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auth.authtesteuser.repository.EmprestimoRepository;

@Service
public class EmprestimoService {
    


    @Autowired
    private EmprestimoRepository emprestimoRepository;
}
