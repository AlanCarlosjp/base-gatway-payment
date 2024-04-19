package com.zieltech.gatwayms.application.repositories;

import com.zieltech.gatwayms.domain.User;

import java.util.Collection;
import java.util.Optional;

public interface UserRepository {

    User save(User user);

    Optional<User> userOfId(String userId);

    Optional<User> userOfEmail(String email);

    Collection<User> allUsers();
}
