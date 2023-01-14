package com.foodle.foodleserver.domain.menu;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @Column
    private float spicy;

    @Column
    private float sweet;

    @Column
    private float bitter;

    @Column
    private float sour;

    @Column
    private float salty;

    @Column
    private boolean soup;

    @Column
    private String separatedElement;
}
