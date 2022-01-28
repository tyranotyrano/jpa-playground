package com.tyranotyrano.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;

    private User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static User of(String name, int age) {
        return new User(name, age);
    }

    public Long getId() {
        return id;
    }
}
