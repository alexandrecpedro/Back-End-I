package com.example.ecommerce.service.impl;

import com.example.ecommerce.entity.UserEntity;
import com.example.ecommerce.entity.dto.UserDTO;
import com.example.ecommerce.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserDetailsService {
    /** Attributes **/
    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    /** Methods **/
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username).orElseThrow(() ->
                new UsernameNotFoundException("User not found!"));
    }

    // Create user
    public Boolean create(UserDTO userDTO) {
        UserEntity userEntity = new UserEntity(userDTO);
        // Security: password is not stored. Only store encrypted password
        String password = passwordEncoder.encode(userEntity.getPassword());
        userEntity.setPassword(password);

        try {
            userRepository.save(userEntity);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
}
