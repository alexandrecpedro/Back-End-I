package Series.model;

public class Serie {
//    Attributes
    private String title, country, link;

//    Constructor
    public Serie(String title, String country, String link) {
        this.title = title;
        this.country = country;
        this.link = link;
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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

//    toString
    @Override
    public String toString() {
        return "Serie" +
                "\ntitle = " + title +
                "\ncountry = " + country +
                "\nlink = " + link;
    }
}
