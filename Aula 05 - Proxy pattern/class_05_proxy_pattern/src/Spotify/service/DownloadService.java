package Spotify.service;

import Spotify.model.Music;
import Spotify.model.User;

public class DownloadService implements Access {

    @Override
    public void userAccess(User user, Music music) {
        System.out.println("Song "+music.getTitle()+" from "+music.getArtist()+
                        " successfully downloaded from user "+user.getName());
    }
}
