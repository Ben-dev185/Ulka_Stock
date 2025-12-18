package com.gestion.ulka_stock.util;

public class PasswordHashGenerator {

    public static void main(String[] args) {

        System.out.println("admin123 -> "
                + PasswordHasher.hash("admin123"));

        System.out.println("user123  -> "
                + PasswordHasher.hash("user123"));
    }
}

