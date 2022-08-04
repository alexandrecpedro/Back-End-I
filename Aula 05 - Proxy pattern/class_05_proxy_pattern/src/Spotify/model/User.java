package Spotify.model;

public class User {
//    Attributes
    String name, type;

//    Constructor
    public User(String name, String type) {
        this.name = name;
        this.type = type;
    }

//    Getters/Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
