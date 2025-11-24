package co.edu.uniquindio.taller5.ViewController;

import co.edu.uniquindio.taller5.Module.Cliente;
import co.edu.uniquindio.taller5.Module.TiendaData;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ClienteController {

    @FXML private TextField txtDocumento;
    @FXML private TextField txtNombre;
    @FXML private TextField txtTelefono;
    @FXML private TextField txtEmail;

    @FXML private TableView<Cliente> tablaClientes;
    @FXML private TableColumn<Cliente, String> colDocumento;
    @FXML private TableColumn<Cliente, String> colNombre;
    @FXML private TableColumn<Cliente, String> colTelefono;
    @FXML private TableColumn<Cliente, String> colEmail;

    @FXML
    public void initialize() {
        colDocumento.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getDocumento()));
        colNombre.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getNombre()));
        colTelefono.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getTelefono()));
        colEmail.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getEmail()));

        tablaClientes.setItems(TiendaData.getClientes());
    }

    @FXML
    protected void guardarCliente() {
        Cliente c = new Cliente(txtDocumento.getText(), txtNombre.getText(), txtTelefono.getText(), txtEmail.getText());
        TiendaData.getClientes().add(c);
        limpiarCampos();
    }

    @FXML
    protected void eliminarCliente() {
        Cliente seleccionado = tablaClientes.getSelectionModel().getSelectedItem();
        if (seleccionado != null) {
            TiendaData.getClientes().remove(seleccionado);
        }
    }

    @FXML
    protected void actualizarCliente() {
        Cliente seleccionado = tablaClientes.getSelectionModel().getSelectedItem();
        if (seleccionado != null) {
            seleccionado.setNombre(txtNombre.getText());
            seleccionado.setTelefono(txtTelefono.getText());
            seleccionado.setEmail(txtEmail.getText());
            tablaClientes.refresh();
        }
    }

    private void limpiarCampos() {
        txtDocumento.clear();
        txtNombre.clear();
        txtTelefono.clear();
        txtEmail.clear();
    }
}
