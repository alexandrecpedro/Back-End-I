package com.example.bets.service;

import com.example.bets.model.GameEntity;
import com.example.bets.model.TeamEntity;
import com.example.bets.model.dto.GameDTO;
import com.example.bets.repository.IGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    /** Attributes **/
    @Autowired
    private IGameRepository gameRepository;

    @Autowired
    private TeamService teamService;

    /** Methods **/
    public GameEntity save(GameEntity game) {
        TeamEntity team = teamService.findByName(game.getLocalTeam().getName());
        game.setLocalTeam(team);

        team = teamService.findByName(game.getVisitTeam().getName());
        game.setVisitTeam(team);

        return gameRepository.save(game);
    }

    public GameEntity saveDTO(GameDTO gameDTO) {
        GameEntity gameEntity = new GameEntity();
        gameEntity.setResult(gameDTO.getResult());

        TeamEntity team = teamService.findByName(gameDTO.getLocalTeam());
        gameEntity.setLocalTeam(team);

        team = teamService.findByName(gameDTO.getVisitTeam());
        gameEntity.setVisitTeam(team);

        gameEntity.setStatus(gameDTO.getStatus().getDescription());

        return gameRepository.save(gameEntity);
    }

    public List<GameEntity> findAll() {
        return gameRepository.findAll();
    }
}
