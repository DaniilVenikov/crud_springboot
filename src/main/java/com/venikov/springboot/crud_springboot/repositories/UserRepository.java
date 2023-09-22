package com.venikov.springboot.crud_springboot.repositories;

import com.venikov.springboot.crud_springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
