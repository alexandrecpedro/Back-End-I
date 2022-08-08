package Netflix.service;

import Netflix.exceptions.MovieNotAllowedException;
import Netflix.model.IP;
import Netflix.model.Movie;

public class MovieListProxy implements IMovieList {
//    Attributes
    private MovieList movieList;
    private IP ip;

//    Constructor
    public MovieListProxy(MovieList movieList) {
        this.movieList = movieList;
    }

//    Getters/Setters
    public void setMovieList(MovieList movieList) {
        this.movieList = movieList;
    }

    public IP getIp() {
        return ip;
    }

    public void setIp(IP ip) {
        this.ip = ip;
    }

//    Method
    @Override
    public Movie getMovie(String title) throws MovieNotAllowedException {
        Movie movie = movieList.getMovie(title);
        if (!(getIp().getCountry().equalsIgnoreCase(movie.getCountry()))) {
            throw new MovieNotAllowedException(title+" is not available at "+getIp().getCountry());
        }
        return movie;
    }
}
