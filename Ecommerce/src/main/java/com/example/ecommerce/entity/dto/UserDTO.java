package com.example.ecommerce.entity.dto;

import com.example.ecommerce.enums.UserRoles;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDTO {
    /** Attributes **/
    @NotNull
    private String name;

    @NotNull
    private String username;

    @NotNull
    private String email;

    @NotNull
    @Size(min = 8, max = 18)
    private String password;

    @NotNull
    private UserRoles userRoles;

    /** Constructor **/
    public UserDTO() {
    }

    /** Getters/Setters **/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRoles getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(UserRoles userRoles) {
        this.userRoles = userRoles;
    }
}
