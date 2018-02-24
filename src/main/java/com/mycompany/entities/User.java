/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entities;

/**
 *
 * @author georg
 */
public class User {
    
    private String UserName;
    private String Password;

    public User() {}
    
    public User(String userName, String password)
    {
        this.UserName = userName;
        this.Password = password;
    }
    
    /**
     * @return the Login
     */
    public String getUserName() {
        return UserName;
    }

    /**
     * @param Login the Login to set
     */
    public void setUserName(String Login) {
        this.UserName = Login;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }
}
