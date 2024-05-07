package com.example.projectpaisa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    String userid;
    String username;
    String email;
    String password;
    Long phonenumber;
    String adress;
    Float balance;

    public String getUserid() {

        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
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

    public Long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(Long phonenumber) {

        this.phonenumber = phonenumber;
    }

    public String getAdress() {

        return adress;
    }

    public void setAdress(String adress) {

        this.adress = adress;
    }

    public Float getBalance() {

        return balance;
    }

    public void setBalance(Float balance) {

        this.balance = balance;
    }

    public User(String userid, String username, String email, String password, Long phonenumber, String adress,
                Float balance) {
        this.userid = userid;
        this.username = username;
        this.email = email;
        this.password = password;
        this.phonenumber = phonenumber;
        this.adress = adress;
        this.balance = balance;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User [userid=" + userid + ", username=" + username + ", email=" + email + ", password=" + password
                + ", phonenumber=" + phonenumber + ", adress=" + adress + ", balance=" + balance + "]";
    }


}
