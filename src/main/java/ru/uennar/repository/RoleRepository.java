package ru.uennar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.uennar.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
