package Netflix.service;

import Netflix.model.Movie;

public class MovieList implements IMovieList {
//    Method
    @Override
    public Movie getMovie(String title) {
        Movie movie = null;
        switch (title) {
            case "Skateshop":
                movie = new Movie("Skateshop", "Brazil", "https://www.youtube.com/watch?v=7tDgqutDzGY");
                break;
            case "Monsters of War":
                movie = new Movie("Monsters of War", "Colombia", "https://www.youtube.com/watch?v=2B3GvZKg2CY");
                break;
            case "Atomic Apocalypse":
                movie = new Movie("Atomic Apocalypse", "Argentina", "https://www.youtube.com/watch?v=JH96jY7SaQU");
                break;
            case "Dracula: The Original Living Vampire":
                movie = new Movie("Dracula: The Original Living Vampire", "Brazil", "https://www.youtube.com/watch?v=ibml9EstOIQ");
                break;
            case "Interception City":
                movie = new Movie("Interception City", "Argentina", "https://www.goodreads.com/book/show/18954666-interception-city");
                break;
        }
        return movie;
    }
}
