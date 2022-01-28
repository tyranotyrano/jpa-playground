package com.tyranotyrano.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tyranotyrano.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

    //Optional<User> findByAge(int age);
    //Optional<User> findByWeight(int weight);
}
