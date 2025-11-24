package co.edu.uniquindio.taller2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.beans.property.SimpleStringProperty;

public class HelloController {

    private ObservableList<Persona> personas = FXCollections.observableArrayList();

    @FXML private TextField txtNombre;
    @FXML private TextField txtSexo;
    @FXML private TextField txtCiudad;
    @FXML private TableView<Persona> tablaPersonas;
    @FXML private TableColumn<Persona, String> colNombre;
    @FXML private TableColumn<Persona, String> colSexo;
    @FXML private TableColumn<Persona, String> colCiudad;

    @FXML
    public void initialize() {

        colNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        colSexo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getSexo()));
        colCiudad.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCiudad()));

        tablaPersonas.setItems(personas);
    }

    @FXML
    protected void guardarPersona() {
        String nombre = txtNombre.getText();
        String sexo = txtSexo.getText();
        String ciudad = txtCiudad.getText();

        if (!nombre.isEmpty() && !sexo.isEmpty() && !ciudad.isEmpty()) {
            Persona nueva = new Persona(nombre, sexo, ciudad);
            personas.add(nueva);
            txtNombre.clear();
            txtSexo.clear();
            txtCiudad.clear();
        }
    }

    @FXML
    protected void verDatos() {
        tablaPersonas.refresh();
    }
}
