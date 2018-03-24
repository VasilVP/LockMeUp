package com.project.entities;


public class FacebookAccount {

    private Long id;
    private String facebookUser;
    private String facebookPassword;

    public FacebookAccount() {}


    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getFacebookUser() {
        return this.facebookUser;
    }
    public void setFacebookUser(String facebookUser) {
        this.facebookUser = facebookUser;
    }

    public String getFacebookPassword() {
        return this.facebookPassword;
    }
    public void setFacebookPassword(String facebookPassword) {
        this.facebookPassword = facebookPassword;
    }
}
