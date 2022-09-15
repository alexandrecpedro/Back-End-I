package com.example.bets.repository;

import com.example.bets.model.TeamEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ITeamRepository extends MongoRepository<TeamEntity, String> {
    /** Methods **/
    TeamEntity findByName(String name);

    // MongoDB Query
    @Query("{name: ?0}")
    TeamEntity getByName(String name);
}
