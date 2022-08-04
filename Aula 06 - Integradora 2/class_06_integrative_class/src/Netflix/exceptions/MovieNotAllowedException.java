package Netflix.exceptions;

public class MovieNotAllowedException extends Exception {
    public MovieNotAllowedException(String messageForUser){
        super(messageForUser);
    }
}
