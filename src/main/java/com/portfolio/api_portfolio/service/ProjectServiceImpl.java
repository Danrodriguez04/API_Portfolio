package com.portfolio.api_portfolio.service;

import com.portfolio.api_portfolio.model.Project;
import com.portfolio.api_portfolio.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectServiceImpl (ProjectRepository projectRepository){
        this.projectRepository = projectRepository;
    }

    @Override
    public List<Project> findAll() {
        return this.projectRepository.findAll();
    }
}
