/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.labrary.model;

/**
 *
 * @author yimis
 */
public class User {

    String nombre;
    String password;

    public User(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
    }

    public User() {

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    public void reserve() {

    }

    public void returnBook() {

    }

}

