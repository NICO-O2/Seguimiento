module co.edu.uniquindio.taller5 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    opens co.edu.uniquindio.taller5 to javafx.fxml;
    opens co.edu.uniquindio.taller5.Module to javafx.fxml;
    opens co.edu.uniquindio.taller5.ViewController to javafx.fxml;
    exports co.edu.uniquindio.taller5;
    exports co.edu.uniquindio.taller5.Module;
    exports co.edu.uniquindio.taller5.ViewController;
}
