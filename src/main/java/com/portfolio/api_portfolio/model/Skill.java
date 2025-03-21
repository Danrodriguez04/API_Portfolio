package com.portfolio.api_portfolio.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    @ManyToMany(mappedBy = "skills")
    Set<Project> projects;

}
