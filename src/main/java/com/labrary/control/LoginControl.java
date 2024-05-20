/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.labrary.control;

import javax.swing.JOptionPane;
public class LoginControl {
    
    String[][] users = {
            {"admin1", "123"},
            {"admin2", "123"},
            {"admin3", "123"}
        };
    
    public boolean loginAuthenticate(String name, String password) {
    boolean isAuthenticated = false;
    
    for (int i = 0; i < users.length; i++) {
        if (name.equals(users[i][0]) && password.equals(users[i][1])) {
            isAuthenticated = true;
             JOptionPane.showMessageDialog(null,"User logged in");
            
            break; 
        }
    }
    
    if (!isAuthenticated) {
  
        JOptionPane.showMessageDialog(null, "Invalid username or password");

    }
    
    return isAuthenticated;
    }

}






