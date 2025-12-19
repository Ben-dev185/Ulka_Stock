package com.gestion.ulka_stock.auth;

import com.gestion.ulka_stock.model.User;

public final class UserSession {

    private static User currentUser;

    private UserSession() {
        // empêche l'instanciation
    }

    public static void setUser(User user) {
        currentUser = user;
    }

    public static User getUser() {
        return currentUser;
    }

    public static void clear() {
        currentUser = null;
    }
}
