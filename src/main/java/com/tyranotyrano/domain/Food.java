package com.tyranotyrano.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "food")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int coast;
}
