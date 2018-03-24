package com.project.entities;

import com.project.Enums.Roles;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {
    private Long id;
    private String username;
    private String password;
    private String email;
    private Roles role;
   // private FacebookAccount fbAccount;

    public User() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "username", nullable = false)
    @Size(min = 3, max = 15)
    public String getUsername() {
        return this.username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "password", nullable = false)
    @Size(min = 4)
    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "email", nullable = false)
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "role")
    public Roles getRole() {
        return this.role;
    }
    public void setRole(Roles role) {
        this.role = role;
    }


//    public FacebookAccount getFbAccount() {
//        return this.fbAccount;
//    }
//    public void setFbAccount(FacebookAccount fbAccount) {
//        this.fbAccount = fbAccount;
//    }
}
