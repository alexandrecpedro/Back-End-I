package com.example.ecommerce.exception;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDateTime;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseException {
    /** Attributes **/
    private int status;
    private String message;
    private LocalDateTime timestamp;
    private List<String> variableList;

    /** Constructor **/
    public ResponseException() {
    }

    public ResponseException(int status, String message, LocalDateTime timestamp) {
        this.status = status;
        this.message = message;
        this.timestamp = timestamp;
    }

    public ResponseException(int status, String message, LocalDateTime timestamp, List<String> variableList) {
        this.status = status;
        this.message = message;
        this.timestamp = timestamp;
        this.variableList = variableList;
    }

    /** Getters **/
    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public List<String> getVariableList() {
        return variableList;
    }

}
