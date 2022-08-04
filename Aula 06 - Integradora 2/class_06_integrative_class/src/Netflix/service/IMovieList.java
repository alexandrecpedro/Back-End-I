package Netflix.service;

import Netflix.exceptions.MovieNotAllowedException;
import Netflix.model.Movie;

public interface IMovieList {
    Movie getMovie(String title) throws MovieNotAllowedException;
}
