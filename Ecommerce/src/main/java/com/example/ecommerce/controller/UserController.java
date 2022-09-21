package com.example.ecommerce.controller;

import com.example.ecommerce.entity.dto.UserDTO;
import com.example.ecommerce.security.AuthenticationResponse;
import com.example.ecommerce.security.util.JwtUtil;
import com.example.ecommerce.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    /** Attributes **/
    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtUtil;

    /** Methods **/
    @PostMapping
    public ResponseEntity<String> create(@RequestBody UserDTO userDTO) {
        Boolean create = userService.create(userDTO);

        return (create ?
                new ResponseEntity<>("Successfully created user!", HttpStatus.CREATED)
                : new ResponseEntity<>("User cannot be created!", HttpStatus.CONFLICT));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> createAuthenticationToken(@RequestBody UserDTO userDTO) throws Exception {
        try {
            // Check the existence of username and password
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                    userDTO.getUsername(), userDTO.getPassword()));
        } catch (BadCredentialsException e) {
            throw new Exception("Incorrect", e);
        }

        final UserDetails userDetails = userService.loadUserByUsername(userDTO.getUsername());
        final String jwt = jwtUtil.generateToken(userDetails);

        return ResponseEntity.ok(new AuthenticationResponse(jwt));
    }
}
