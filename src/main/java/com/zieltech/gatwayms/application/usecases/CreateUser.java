package com.zieltech.gatwayms.application.usecases;


import com.zieltech.gatwayms.application.repositories.UserRepository;
import com.zieltech.gatwayms.domain.PasswordType;
import com.zieltech.gatwayms.domain.User;

import java.util.Objects;

public class CreateUser {

    private final UserRepository userRepository;

    public CreateUser(final UserRepository userRepository) {
        this.userRepository = Objects.requireNonNull(userRepository);
    }

    public Output execute(final Input input) {
        final var aUser = this.userRepository.save(User.create(input.email,
                input.passwordType, input.password));
        return new Output(aUser.id());
    }

    public record Input(String email, PasswordType passwordType, String password) {
    }

    public record Output(String userId) {
    }
}
