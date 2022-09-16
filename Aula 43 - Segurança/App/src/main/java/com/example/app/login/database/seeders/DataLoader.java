package com.example.app.login.database.seeders;

import com.example.app.login.entity.AppUser;
import com.example.app.login.entity.AppUserRoles;
import com.example.app.login.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    /** Attribute **/
    private IUserRepository userRepository;

    /** Constructor **/
    @Autowired
    public DataLoader(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /** Method **/
    // Seeding the table (populating)
    @Override
    public void run(ApplicationArguments args) throws Exception {
        // Cryptography
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String password = passwordEncoder.encode("password");
        String password2 = passwordEncoder.encode("password2");

        userRepository.save(new AppUser("Charly", "charly", "charly@dh.com", password, AppUserRoles.ROLE_ADMIN));
        userRepository.save(new AppUser("Charly2", "charly2", "charly2@dh.com", password2, AppUserRoles.ROLE_USER));
    }
}
