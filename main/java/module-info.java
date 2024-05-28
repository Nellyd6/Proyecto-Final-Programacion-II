module co.uniquindio.proyecto {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens co.uniquindio.proyecto to javafx.fxml;

    exports co.uniquindio.proyecto;

    opens co.uniquindio.proyecto.controler;

    exports co.uniquindio.proyecto.controler;
    
}
