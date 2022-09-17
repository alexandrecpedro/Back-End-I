package com.example.hellouser.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class AuthenticationResponse {
    /** Attribute **/
    private final String jwt;
}
