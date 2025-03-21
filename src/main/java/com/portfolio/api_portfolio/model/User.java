package com.portfolio.api_portfolio.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;


@Getter
@Setter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String surname1;
    private String surname2;
    private String personalDescription;
    private Integer phone;


    @OneToMany(mappedBy = "user")
    private Set<Project> projects;


}
