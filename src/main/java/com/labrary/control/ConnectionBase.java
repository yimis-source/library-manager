/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.labrary.control;

import com.labrary.model.User;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ConnectionBase {
    private String filePath;

    public ConnectionBase(String filePath) {
        this.filePath = filePath;
    }

    public void addUser(User user) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(user.getNombre() + "," + user.getPassword());
            writer.newLine();
        }
    }

    public User getUser(String nombre) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equals(nombre)) {
                    return new User(parts[0], parts[1]);
                }
            }
        }
        return null;
    }

    public Map<String, User> getAllUsers() throws IOException {
        Map<String, User> users = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    users.put(parts[0], new User(parts[0], parts[1]));
                }
            }
        }
        return users;
    }

    public boolean validateLogin(String nombre, String password) throws IOException {
        User user = getUser(nombre);
        return user != null && user.getPassword().equals(password);
    }
}
