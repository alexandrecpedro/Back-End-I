package com.example.bets.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "games")
public class GameEntity {
    /** Attributes **/
    @Id
    private String id;
    private String result;
    private String status;

    @Field(name = "local_team")
    private TeamEntity localTeam;

    @Field(name = "visiting_team")
    private TeamEntity visitTeam;

    /** Getters/Setters **/
    public String getId() {
        return id;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public TeamEntity getLocalTeam() {
        return localTeam;
    }

    public void setLocalTeam(TeamEntity localTeam) {
        this.localTeam = localTeam;
    }

    public TeamEntity getVisitTeam() {
        return visitTeam;
    }

    public void setVisitTeam(TeamEntity visitTeam) {
        this.visitTeam = visitTeam;
    }
}
