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
    private String separatedElement;
}
