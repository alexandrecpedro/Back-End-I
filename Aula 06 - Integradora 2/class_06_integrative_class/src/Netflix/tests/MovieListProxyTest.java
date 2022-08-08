package Netflix.tests;

import Netflix.exceptions.MovieNotAllowedException;
import Netflix.model.IP;
import Netflix.model.Movie;
import Netflix.service.MovieList;
import Netflix.service.MovieListProxy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieListProxyTest {
    MovieListProxy proxy = new MovieListProxy(new MovieList());

    @Test
    void testGetMovieArgentina() throws MovieNotAllowedException {
        proxy.setIp(new IP(40, 23, 23, 25));
        Movie movie = proxy.getMovie("Atomic Apocalypse");

        assertEquals("Atomic Apocalypse", movie.getTitle());
        assertEquals("Argentina", movie.getCountry());
        assertEquals("https://www.youtube.com/watch?v=JH96jY7SaQU", movie.getPlayLink());
    }

    @Test
    void testGetMovieBrazil() throws MovieNotAllowedException {
        proxy.setIp(new IP(93, 23, 23, 25));
        Movie movie = proxy.getMovie("Dracula: The Original Living Vampire");

        assertEquals("Dracula: The Original Living Vampire", movie.getTitle());
        assertEquals("Brazil", movie.getCountry());
        assertEquals("https://www.youtube.com/watch?v=ibml9EstOIQ", movie.getPlayLink());
    }

    @Test
    void testGetMovieColombia() throws MovieNotAllowedException {
        proxy.setIp(new IP(118, 23, 23, 25));
        Movie movie = proxy.getMovie("Monsters of War");

        assertEquals("Monsters of War", movie.getTitle());
        assertEquals("Colombia", movie.getCountry());
        assertEquals("https://www.youtube.com/watch?v=2B3GvZKg2CY", movie.getPlayLink());
    }

    @Test
    void testGetMovieError() {
        proxy.setIp(new IP(2, 23, 23, 25));

        MovieNotAllowedException thrown = assertThrows(
                MovieNotAllowedException.class,
                () -> proxy.getMovie("Monsters of War")
        );

        assertTrue(thrown.getMessage().contains("Monsters of War is not available at Argentina"));
    }

}