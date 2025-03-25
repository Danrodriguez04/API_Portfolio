package com.portfolio.api_portfolio.controller;

import com.portfolio.api_portfolio.model.Project;
import com.portfolio.api_portfolio.service.ProjectService;
import com.portfolio.api_portfolio.service.ProjectServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/portfolio/projects")
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectServiceImpl projectService){
        this.projectService = projectService;
    }


    @GetMapping("/")
    public ResponseEntity<List<Project>> findAll(){
        List<Project> projects = (List<Project>) this.projectService.findAll();

        return new ResponseEntity<>(projects, HttpStatus.OK);

    }


}
