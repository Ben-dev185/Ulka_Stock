package com.gestion.ulka_stock.util;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class PasswordHasher {

    // Sel fixe (acceptable pour projet académique)
    private static final String SALT = "ULKA_STOCK_2025";

    public static String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            String saltedPassword = SALT + password;

            byte[] hash = digest.digest(
                    saltedPassword.getBytes(StandardCharsets.UTF_8)
            );

            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                hexString.append(String.format("%02x", b));
            }

            return hexString.toString();

        } catch (Exception e) {
            throw new RuntimeException("Erreur de hachage du mot de passe", e);
        }
    }
}

