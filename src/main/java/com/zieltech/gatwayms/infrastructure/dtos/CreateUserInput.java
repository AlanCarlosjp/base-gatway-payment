package com.zieltech.gatwayms.infrastructure.dtos;


import com.zieltech.gatwayms.domain.PasswordType;

public record CreateUserInput(String email, PasswordType passwordType, String password) {
}
