module com.gestion.ulka_stock {

    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires jbcrypt;

    // Controllers FXML
    opens com.gestion.ulka_stock.auth to javafx.fxml;

    // Accès général
    exports com.gestion.ulka_stock.app;
}
