package com.gestion.ulka_stock.model;

public class User {

    private int id;
    private String username;
    private String role;

    // Constructeur vide (obligatoire pour JavaFX / JDBC)
    public User() {
    }

    // Constructeur principal
    public User(int id, String username, String role) {
        this.id = id;
        this.username = username;
        this.role = role;
    }

    public User(int id, String username, String passwordHash, String role) {
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // Utile pour le debug
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}


