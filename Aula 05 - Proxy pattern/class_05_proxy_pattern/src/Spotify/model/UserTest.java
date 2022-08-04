package Spotify.model;

import Spotify.service.ProxyDownloadService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest {
//    Attributes
    User user1, user2, user3;
    Music song1, song2, song3;
    ProxyDownloadService service;

    @BeforeEach
    void doBefore(){
        user1 = new User("Sean Penn", "Free");
        user2 = new User("Carla Diaz", "Free");
        user3 = new User("Marilyn Monroe", "Premium");

        song1 = new Music("Hey Jude", "The Beatles", "1");
        song2 = new Music("Theme from 'New York, New York'", "Ray Conniff", "The Essential Ray Conniff");
        song3 = new Music("Get Lucky", "Daft Punk", "Random Access Memories");

        service = new ProxyDownloadService();
    }

    @Test
    void downloadMusic(){
        service.userAccess(user1, song1);
        service.userAccess(user2, song2);
        service.userAccess(user3, song3);
    }
}