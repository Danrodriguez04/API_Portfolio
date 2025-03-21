package com.portfolio.api_portfolio.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String location;
    private String imageLocation;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;


    @ManyToMany
    @JoinTable(
            name = "skills_project",
            joinColumns = @JoinColumn(name = "project_id"),
            inverseJoinColumns = @JoinColumn(name = "skill_id"))
    Set<Skill> skills;

}
