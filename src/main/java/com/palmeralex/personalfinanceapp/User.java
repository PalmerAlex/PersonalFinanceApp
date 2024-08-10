package com.palmeralex.personalfinanceapp;

public class User {
   private String username;
   private String passcode;


   public User(String p_username, String p_passcode) {
    this.username = p_username;
    this.passcode = p_passcode;
   }

    public String getUsername() {
        return username;
    }


    public boolean authenticate(String p_passcode) {
        return this.passcode.equals((p_passcode));
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }
   }
