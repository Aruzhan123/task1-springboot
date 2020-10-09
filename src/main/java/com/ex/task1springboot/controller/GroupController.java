package com.ex.task1springboot.controller;

import com.ex.task1springboot.Repos.GroupRepos;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GroupController {

    private final GroupRepos groupRepository;

    public GroupController(GroupRepos groupRepository) {
        this.groupRepository = groupRepository;
    }

    @GetMapping("/api/groups")
    public ResponseEntity<?> getGroups() {
        return ResponseEntity.ok(groupRepository.findAll());
    }

}

