package com.example.domaumaru.googlemap_demo_comp.Class;

import com.google.gson.annotations.Expose;

/**
 * Created by Diep on 30/09/2016.
 */

public class cs_Account {
    private int ID;
    @Expose
    private String Email;
    @Expose
    private String Username;
    @Expose
    private String Password;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
    @Override
    public String toString()
    {
        return ID+"  "+Email+"  "+Password+"  "+Username;
    }
}
