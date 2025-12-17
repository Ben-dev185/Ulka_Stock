module com.gestion.ulka_stock {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.gestion.ulka_stock to javafx.fxml;
    exports com.gestion.ulka_stock;
}