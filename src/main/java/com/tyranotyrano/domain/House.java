package com.tyranotyrano.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "house")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;
}
