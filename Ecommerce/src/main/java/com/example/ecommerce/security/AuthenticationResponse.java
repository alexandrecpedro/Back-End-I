package com.example.ecommerce.security;

public class AuthenticationResponse {
    /** Attribute **/
    private final String jwt;

    /** Constructor **/
    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    /** Getter **/
    public String getJwt() {
        return jwt;
    }
}
