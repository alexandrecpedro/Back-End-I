package com.example.bets.repository;

import com.example.bets.model.GameEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGameRepository extends MongoRepository<GameEntity, String> {
}
