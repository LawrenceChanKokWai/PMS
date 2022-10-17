package com.kokwai.controller;

import com.kokwai.dto.ProjectDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/projects")
public class ProjectController {

    @GetMapping
    public ResponseEntity<List<ProjectDto>> getProject(){
        ProjectDto projectOne = ProjectDto.builder()
                    .name("Hamiliton Scotts")
                    .build();

        ProjectDto projectTwo = ProjectDto.builder()
                .name("Patterson Collection")
                .build();

        List<ProjectDto> projects = new ArrayList<>();
        projects.add(projectOne);
        projects.add(projectTwo);
        return ResponseEntity.ok(projects);
    }

}
