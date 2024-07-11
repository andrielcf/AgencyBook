package com.auth.authtesteuser.dto;

import java.util.Date;

public record EmprestimoDTO(Date dataEmprestimo, Date dataDevolucao, Long idLivro) {
    
}
