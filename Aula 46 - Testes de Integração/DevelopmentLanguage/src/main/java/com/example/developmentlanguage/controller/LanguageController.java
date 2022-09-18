package com.example.developmentlanguage.controller;

import com.example.developmentlanguage.model.LanguageModel;
import com.example.developmentlanguage.service.LanguageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/languages")
public class LanguageController {
    /** Attribute **/
    private LanguageService languageService;

    /** Constructor **/
    public LanguageController() {
        this.languageService = new LanguageService();
    }

    /** Methods **/
    @GetMapping("/{type}")
    public ResponseEntity<?> findByType(@PathVariable("type") String type) {
        LanguageModel languageModel = languageService.findByType(type);
        return (languageModel == null ?
                ResponseEntity.notFound().build()
                : ResponseEntity.ok(languageModel));
    }

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(languageService.findAll());
    }
}
