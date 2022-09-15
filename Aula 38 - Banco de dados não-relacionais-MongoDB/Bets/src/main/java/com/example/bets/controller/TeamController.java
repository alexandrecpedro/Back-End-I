package com.example.bets.controller;

import com.example.bets.model.TeamEntity;
import com.example.bets.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teams")
public class TeamController {
    /** Attribute **/
    @Autowired
    private TeamService teamService;

    /** Methods **/
    @PostMapping
    public TeamEntity save(@RequestBody TeamEntity team) {
        return teamService.save(team);
    }

    @GetMapping
    public List<TeamEntity> findAll() {
        return teamService.findAll();
    }

    @GetMapping("/{name}")
    public TeamEntity findByName(@PathVariable String name) {
        return teamService.findByName(name);
    }
}
