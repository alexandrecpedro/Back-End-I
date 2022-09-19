package com.example.ecommerce.exception;

import java.util.List;

public class NullVariableException extends Exception {
    /** Attribute **/
    private List<String> variableList;

    /** Constructor **/
    public NullVariableException(String message, List<String> variableList) {
        super(message);
        this.variableList = variableList;
    }

    /** Getter **/
    public List<String> getVariableList() {
        return variableList;
    }
}
