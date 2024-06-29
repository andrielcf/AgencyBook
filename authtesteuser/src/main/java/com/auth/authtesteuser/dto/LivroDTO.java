package com.auth.authtesteuser.dto;

import com.auth.authtesteuser.entity.Catalogo;

public record LivroDTO(String titulo, String autor, String descricao, Catalogo catalogo) {
    
}
