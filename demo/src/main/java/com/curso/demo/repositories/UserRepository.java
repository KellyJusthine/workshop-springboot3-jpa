package com.curso.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
