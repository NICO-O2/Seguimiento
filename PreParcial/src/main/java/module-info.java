module co.edu.uniquindio.preparcial {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens co.edu.uniquindio.preparcial to javafx.fxml;
    exports co.edu.uniquindio.preparcial;
}