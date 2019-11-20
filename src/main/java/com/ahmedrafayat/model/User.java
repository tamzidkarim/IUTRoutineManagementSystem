package com.ahmedrafayat.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "User", schema = "iutroutine", catalog = "")
public class User implements Serializable {

    @Id
    @Column(name="user_name",unique = true,nullable = false,length = 45)
    private String username;

    @Basic
    @Column(name="user_password",nullable = false,length = 20)
    private String password;

    @Basic
    @Column(name="date_created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;

    @Basic
    @Column(name="user_type")
    private String userType;

    public User(String username,String password,Date dateCreated, String userType) {
        this.username = username;
        this.password = password;
        this.dateCreated = dateCreated;
        this.userType = userType;
    }

    public User(){

    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", dateCreated=" + dateCreated +
                ", userType='" + userType + '\'' +
                '}';
    }
}
