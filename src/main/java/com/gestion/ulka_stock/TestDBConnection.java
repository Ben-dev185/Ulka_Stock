package com.gestion.ulka_stock;

import com.gestion.ulka_stock.util.DBConnection;

import java.sql.Connection;

public class TestDBConnection {

    public static void main(String[] args) {
        try (Connection conn = DBConnection.getConnection()) {
            System.out.println("✅ CONNEXION MYSQL RÉUSSIE !");
        } catch (Exception e) {
            System.out.println("❌ CONNEXION MYSQL ÉCHOUÉE");
            e.printStackTrace();
        }
    }
}

