package co.edu.uniquindio.preparcial;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;
import javafx.scene.Node;

import java.io.IOException;

public class MostrarController {

    @FXML private TableView<Moto> tablaMotos;
    @FXML private TableColumn<Moto, String> colPlaca;
    @FXML private TableColumn<Moto, String> colModelo;
    @FXML private TableColumn<Moto, String> colMarca;

    @FXML
    public void initialize() {
        colPlaca.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getPlaca()));
        colModelo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getModelo()));
        colMarca.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMarca()));
    }

    public void setMotos(ObservableList<Moto> motos) {
        tablaMotos.setItems(motos);
    }

    @FXML
    protected void volver(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
