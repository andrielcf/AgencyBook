package com.auth.authtesteuser.dto;

import com.auth.authtesteuser.entity.UserRole;

public record RegisterDTO(String email, String password, UserRole role) {
    
}
