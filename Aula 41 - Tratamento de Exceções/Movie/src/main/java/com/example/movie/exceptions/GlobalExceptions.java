package com.example.movie.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// This class manages all the exceptions
@ControllerAdvice
public class GlobalExceptions {
    /** Methods **/
    // When a method throws an error, Spring will try to find the methods with annotation
    // @ExceptionHandler
    @ExceptionHandler
    public ResponseEntity<String> processErrorNotFound(ResourceNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage() + " Global");
    }
}
