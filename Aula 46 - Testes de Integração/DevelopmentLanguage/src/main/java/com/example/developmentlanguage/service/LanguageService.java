package com.example.developmentlanguage.service;

import com.example.developmentlanguage.model.LanguageModel;
import com.example.developmentlanguage.repository.LanguageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageService {
    /** Attribute **/
    private LanguageRepository languageRepository;

    /** Constructor **/
    public LanguageService() {
        this.languageRepository = new LanguageRepository();
    }

    /** Methods **/
    public LanguageModel findByType(String type) {
        return languageRepository.findByType(type);
    }

    public List<LanguageModel> findAll() {
        return languageRepository.findAll();
    }
}
