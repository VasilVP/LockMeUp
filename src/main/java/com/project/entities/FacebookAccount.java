package com.project.entities;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "facebook_account")
public class FacebookAccount {

    private Long id;
    private String facebookUser;
    private String facebookPassword;
    private Date deadLine;
    private String newPassword;

    public FacebookAccount() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "facebook_user", nullable = false)
    public String getFacebookUser() {
        return this.facebookUser;
    }
    public void setFacebookUser(String facebookUser) {
        this.facebookUser = facebookUser;
    }

    @Column(name = "facebook_password", nullable = false)
    public String getFacebookPassword() {
        return this.facebookPassword;
    }
    public void setFacebookPassword(String facebookPassword) {
        this.facebookPassword = facebookPassword;
    }

    @Column(name = "dead_line", nullable = false)
    public Date getDeadLine() {
        return this.deadLine;
    }
    public void setDeadLine(Date deadLine) {
        this.deadLine = deadLine;
    }

    public String getNewPassword() {
        return this.newPassword;
    }
    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }


}
