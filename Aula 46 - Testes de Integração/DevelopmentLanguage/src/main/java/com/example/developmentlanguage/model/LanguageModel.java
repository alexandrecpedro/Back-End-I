package com.example.developmentlanguage.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class LanguageModel {
    /** Attributes **/
    private String type;
    private Boolean ifObjectOriented;

    /** Method **/
    @Override
    public String toString() {
        return "LanguageModel{" +
                "type='" + type + '\'' +
                ", ifObjectOriented=" + ifObjectOriented +
                '}';
    }
}
