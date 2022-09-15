package com.example.bets.model.dto;

import com.example.bets.model.Status;

public class GameDTO {
    /** Attributes **/
    private String result;
    
    private Status status;

    private String localTeam;
    
    private String visitTeam;
    
    /** Getters/Setters **/
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getLocalTeam() {
        return localTeam;
    }

    public void setLocalTeam(String localTeam) {
        this.localTeam = localTeam;
    }

    public String getVisitTeam() {
        return visitTeam;
    }

    public void setVisitTeam(String visitTeam) {
        this.visitTeam = visitTeam;
    }
}
