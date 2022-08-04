package Spotify.service;

import Spotify.model.Music;
import Spotify.model.User;

public interface Access {
    void userAccess(User user, Music music);
}
