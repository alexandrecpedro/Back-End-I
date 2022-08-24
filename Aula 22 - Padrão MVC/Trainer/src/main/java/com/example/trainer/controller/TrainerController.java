package com.example.trainer.controller;

import com.example.trainer.domain.Trainer;
import com.example.trainer.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/trainer")
public class TrainerController {
    /** Attribute **/
    private final TrainerService trainerService;

    /** Constructor **/
    @Autowired
    public TrainerController(TrainerService trainerService) {
        this.trainerService = trainerService;
    }

    /** Method **/
    @GetMapping
    public List<Trainer> getTrainer() {
        return trainerService.listTrainer();
    }
}
