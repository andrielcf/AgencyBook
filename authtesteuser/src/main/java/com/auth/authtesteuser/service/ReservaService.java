package com.auth.authtesteuser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.auth.authtesteuser.entity.Emprestimo;
import com.auth.authtesteuser.entity.Livro;
import com.auth.authtesteuser.entity.Reserva;
import com.auth.authtesteuser.repository.EmprestimoRepository;
import com.auth.authtesteuser.repository.LivroRepository;
import com.auth.authtesteuser.repository.ReservaRepository;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    @Autowired
    private EmprestimoRepository emprestimoRepository;

    
    public ResponseEntity reservarLivro(Reserva data){


        Emprestimo emprestimo = emprestimoRepository.findByLivroId(data.getLivro().getId());

        if (data.getDataReserva().compareTo(emprestimo.getDataDevolucao()) > 0) {

            Livro livro = reservaRepository.findByLivroId(data.getLivro().getId());

            if (livro == null) {
                
                reservaRepository.save(data);
                return ResponseEntity.ok().build();
            }else{
                return ResponseEntity.badRequest().build();
            }

        }else{
            return ResponseEntity.badRequest().build();
        }

    }

}
