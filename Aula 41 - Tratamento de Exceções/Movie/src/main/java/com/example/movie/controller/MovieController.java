package com.example.movie.controller;

import com.example.movie.exceptions.ResourceNotFoundException;
import com.example.movie.model.MovieModel;
import com.example.movie.service.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {
    /** Attribute **/
    private final MovieService movieService;

    /** Constructor **/
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    /** Methods **/
    @PostMapping
    public ResponseEntity<MovieModel> save(@RequestBody MovieModel movieModel) {
        return ResponseEntity.ok(movieService.save(movieModel));
    }

    @GetMapping
    public List<MovieModel> findAll() {
        return movieService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MovieModel> findMovie(@PathVariable Integer id) throws ResourceNotFoundException {
        try {
            return ResponseEntity.ok(movieService.findById(id));
        } catch (Exception e) {
            throw new ResourceNotFoundException("Movie with id " + id + " was not found at database");
        }

    }

    @PutMapping
    public ResponseEntity<MovieModel> updateMovie(@RequestBody MovieModel movieModel) {
        return ResponseEntity.ok(movieService.update(movieModel));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id) throws ResourceNotFoundException {
        try {
            movieService.delete(id);
            return ResponseEntity.ok("Deleted");
        } catch (Exception e) {
            throw new ResourceNotFoundException("Movie with id " + id + " that would be deleted was not found");
        }
    }
}
