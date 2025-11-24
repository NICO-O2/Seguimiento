package co.edu.uniquindio.taller5.ViewController;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class HellowViewController {

    @FXML
    private AnchorPane contenedorPrincipal;

    @FXML
    protected void mostrarClientes() {
        cargarVista("/co/edu/uniquindio/taller5/cliente-view.fxml");
    }

    @FXML
    protected void mostrarProductos() {
        cargarVista("/co/edu/uniquindio/taller5/producto-view.fxml");
    }

    @FXML
    protected void mostrarVentas() {
        cargarVista("/co/edu/uniquindio/taller5/ventas-view.fxml");
    }

    private void cargarVista(String rutaFXML) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(rutaFXML));
            Parent vista = loader.load();
            contenedorPrincipal.getChildren().clear();
            contenedorPrincipal.getChildren().add(vista);

            AnchorPane.setTopAnchor(vista, 0.0);
            AnchorPane.setBottomAnchor(vista, 0.0);
            AnchorPane.setLeftAnchor(vista, 0.0);
            AnchorPane.setRightAnchor(vista, 0.0);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
