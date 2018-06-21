package org.example.simpleSpringMvcApp.dao;

import org.example.simpleSpringMvcApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
