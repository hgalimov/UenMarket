package ru.uennar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.uennar.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}