package com.example.developmentlanguage.repository;

import com.example.developmentlanguage.model.LanguageModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LanguageRepository {
    /** Attribute **/
    List<LanguageModel> languageModels = new ArrayList<>();

    /** Constructor **/
    public LanguageRepository() {
        languageModels.add(new LanguageModel("Java", true));
        languageModels.add(new LanguageModel("Pascal", false));
    }

    /** Methods **/
    public LanguageModel findByType(String type) {
        for (LanguageModel languageModel: languageModels) {
            if (languageModel.getType().equals(type))
                return languageModel;
        }

        return null;
    }

    public List<LanguageModel> findAll() {
        return languageModels;
    }
}
