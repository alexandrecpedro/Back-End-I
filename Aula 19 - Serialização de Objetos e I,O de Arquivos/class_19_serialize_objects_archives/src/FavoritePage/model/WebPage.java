package FavoritePage.model;

import java.io.Serializable;

public class WebPage implements Serializable {
    /** Attributes **/
    private String url, name;

    /** Constructor **/
    public WebPage(String url, String name) {
        this.url = url;
        this.name = name;
    }

    /** Getters/Setters **/
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /** Method **/
    @Override
    public String toString() {
        return "WebPage{" +
                "url='" + url + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
