package Spotify.service;

import Spotify.model.Music;
import Spotify.model.User;

public class ProxyDownloadService implements Access {
    @Override
    public void userAccess(User user, Music music) {
        if(user.getType().equalsIgnoreCase("Premium")){
            System.out.println("Premium User - Download Allowed");
            DownloadService downloadService = new DownloadService();
            downloadService.userAccess(user, music);
        } else {
            System.out.println("User "+user.getName()+",\nYou are not allowed to download music. Become Premium for further services");
        }
    }
}
