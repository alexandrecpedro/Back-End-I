package Netflix.model;

public class Movie {
//    Attributes
    private String title, country, playLink;

//    Constructor
    public Movie(String title, String country, String playLink) {
        this.title = title;
        this.country = country;
        this.playLink = playLink;
    }

//    Getters/Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPlayLink() {
        return playLink;
    }

    public void setPlayLink(String playLink) {
        this.playLink = playLink;
    }

//    toString
    @Override
    public String toString() {
        return "Movie" +
                "\ntitle = " + title +
                "\ncountry = " + country +
                "\nplayLink = " + playLink;
    }
}
