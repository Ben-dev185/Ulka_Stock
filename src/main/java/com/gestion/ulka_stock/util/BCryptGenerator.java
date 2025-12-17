package com.gestion.ulka_stock.util;

import org.mindrot.jbcrypt.BCrypt;

public class BCryptGenerator {
    public static void main(String[] args) {

        System.out.println("ADMIN  : " + BCrypt.hashpw("admin123", BCrypt.gensalt()));
        System.out.println("USER1  : " + BCrypt.hashpw("user123", BCrypt.gensalt()));
        System.out.println("USER2  : " + BCrypt.hashpw("user123", BCrypt.gensalt()));
    }
}
