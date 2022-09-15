package com.example.bets.service;

import com.example.bets.model.TeamEntity;
import com.example.bets.repository.ITeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {
    /** Attribute **/
    @Autowired
    private ITeamRepository teamRepository;

    /** Methods **/
    public TeamEntity save(TeamEntity time) {
        return teamRepository.save(time);
    }

    public List<TeamEntity> findAll() {
        return teamRepository.findAll();
    }

    public TeamEntity findByName(String name) {
        return teamRepository.findByName(name);
    }
}
