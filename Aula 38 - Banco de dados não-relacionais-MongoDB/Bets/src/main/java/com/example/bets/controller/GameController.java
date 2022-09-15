package com.example.bets.controller;

import com.example.bets.model.GameEntity;
import com.example.bets.model.dto.GameDTO;
import com.example.bets.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {
    /** Attributes **/
    @Autowired
    private GameService gameService;

    /** Methods **/
    @PostMapping
    public GameEntity save(@RequestBody GameEntity game) {
        return gameService.save(game);
    }

    @PostMapping("/gamedto")
    public GameEntity saveDTO(@RequestBody GameDTO gameDTO) {
        return gameService.saveDTO(gameDTO);
    }

    @GetMapping
    public List<GameEntity> findAll() {
        return gameService.findAll();
    }
}
