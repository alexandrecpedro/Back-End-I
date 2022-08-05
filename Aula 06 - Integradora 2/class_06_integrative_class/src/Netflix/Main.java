package Netflix;

import Netflix.exceptions.MovieNotAllowedException;
import Netflix.model.IP;
import Netflix.service.MovieList;
import Netflix.service.MovieListProxy;

public class Main {
    public static void main(String[] args) {
        MovieListProxy movieListProxy = new MovieListProxy(new MovieList());
        movieListProxy.setIp(new IP(99,23,15,18));

        try {
            System.out.println("Acesso liberado");
            System.out.println(movieListProxy.getMovie("Atomic Apocalypse").getPlayLink());
        } catch (MovieNotAllowedException e) {
            System.out.println(e);
        }

        try {
            System.out.println("Acesso liberado");
            System.out.println(movieListProxy.getMovie("Skateshop").getPlayLink());
        } catch (MovieNotAllowedException e) {
            System.out.println(e);
        }
    }
}
