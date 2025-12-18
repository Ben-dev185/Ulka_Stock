
package com.gestion.ulka_stock.dao;

import com.gestion.ulka_stock.model.Material;
import com.gestion.ulka_stock.util.DBConnection;

import java.sql.*;
import java.util.*;

public class MaterialDao {

    public List<Material> findAll() {
        List<Material> list = new ArrayList<>();

        String sql = "SELECT * FROM materials";

        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                list.add(new Material(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("category"),
                        rs.getInt("quantity")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}