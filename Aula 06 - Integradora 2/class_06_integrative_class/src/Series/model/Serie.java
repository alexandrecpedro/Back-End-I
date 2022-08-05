package Series.model;

public class Serie {
//    Attributes
    private String title, link;

//    Constructor
    public Serie(String title, String link) {
        this.title = title;
        this.link = link;
    }

//    Getters/Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
                "\nlink = " + link;
    }
}
