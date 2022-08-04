package Spotify.model;

public class Music {
//    Attributes
    private String title;
    private String artist;
    private String album;

//    Constructor
    public Music(String title, String artist, String album) {
        this.title = title;
        this.artist = artist;
        this.album = album;
    }

//    Getters/Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

//    toString
    @Override
    public String toString() {
        return "Music" +
                "\ntitle = " + title +
                "\nartist = " + artist +
                "\nalbum='" + album;
    }
}
