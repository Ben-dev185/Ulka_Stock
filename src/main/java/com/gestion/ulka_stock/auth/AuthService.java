package com.gestion.ulka_stock.auth;

import com.gestion.ulka_stock.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AuthService {

    public boolean authenticate(String username, String password) {

        String sql = "SELECT * FROM users WHERE username = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();

            if (!rs.next()) {
                return false;
            }

            String dbPassword = rs.getString("password_hash");

            // 🔴 TEMPORAIRE : comparaison simple
            return password.equals(dbPassword);

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
