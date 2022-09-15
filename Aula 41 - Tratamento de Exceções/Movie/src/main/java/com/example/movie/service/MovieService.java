package com.example.movie.service;

import com.example.movie.model.MovieModel;
import com.example.movie.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    /** Attribute **/
    private final MovieRepository movieRepository;

    /** Constructor **/
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    /** Methods **/
    public MovieModel save(MovieModel movieModel) {
        return movieRepository.save(movieModel);
    }

    public List<MovieModel> findAll() {
        return movieRepository.findAll();
    }

    public MovieModel findById(Integer id) {
        return movieRepository.findById(id).get();
    }

    public MovieModel update(MovieModel movieModel) {
        return movieRepository.saveAndFlush(movieModel);
    }

    public void delete(Integer id) {
        movieRepository.deleteById(id);
    }
}
