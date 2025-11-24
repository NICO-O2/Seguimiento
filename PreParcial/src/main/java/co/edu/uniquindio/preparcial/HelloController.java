package co.edu.uniquindio.preparcial;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.event.ActionEvent;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.IOException;

public class HelloController {

    private ObservableList<Moto> motos = FXCollections.observableArrayList();

    @FXML private TextField txtPlaca;
    @FXML private TextField txtModelo;
    @FXML private TextField txtMarca;

    @FXML
    protected void btnGuardarMoto(ActionEvent event) {
        String placa = txtPlaca.getText();
        String modelo = txtModelo.getText();
        String marca = txtMarca.getText();

        if (!placa.isEmpty() && !modelo.isEmpty() && !marca.isEmpty()) {
            Moto nuevaMoto = new Moto(placa, modelo, marca);
            motos.add(nuevaMoto);

            txtPlaca.clear();
            txtModelo.clear();
            txtMarca.clear();
        }
    }

    @FXML
    protected void btnMostrarMotos(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("tablaMotos.fxml"));
            Parent root = loader.load();

            MostrarController mostrarController = loader.getController();
            mostrarController.setMotos(motos);

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
