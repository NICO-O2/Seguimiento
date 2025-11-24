package co.edu.uniquindio.taller5.ViewController;

import co.edu.uniquindio.taller5.Module.*;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;

public class VentaController {

    @FXML private Label lblFecha;
    @FXML private ChoiceBox<Cliente> choiceCliente;
    @FXML private ChoiceBox<Producto> choiceProducto;
    @FXML private TextField txtCantidadVenta;

    @FXML private TableView<Venta> tablaVentas;
    @FXML private TableColumn<Venta, String> colFecha;
    @FXML private TableColumn<Venta, String> colCliente;
    @FXML private TableColumn<Venta, String> colProducto;
    @FXML private TableColumn<Venta, String> colCantidad;
    @FXML private TableColumn<Venta, String> colPrecioUnitario;
    @FXML private TableColumn<Venta, String> colTotal;

    @FXML
    public void initialize() {
        lblFecha.setText(LocalDate.now().toString());

        choiceCliente.setItems(TiendaData.getClientes());
        choiceProducto.setItems(TiendaData.getProductos());

        colFecha.setCellValueFactory(v -> new SimpleStringProperty(v.getValue().getFecha().toString()));
        colCliente.setCellValueFactory(v -> new SimpleStringProperty(v.getValue().getCliente().getNombre()));
        colProducto.setCellValueFactory(v -> new SimpleStringProperty(v.getValue().getProducto().getProducto()));
        colCantidad.setCellValueFactory(v -> new SimpleStringProperty(String.valueOf(v.getValue().getCantidad())));
        colPrecioUnitario.setCellValueFactory(v -> new SimpleStringProperty(String.valueOf(v.getValue().getPrecioUnitario())));
        colTotal.setCellValueFactory(v -> new SimpleStringProperty(String.valueOf(v.getValue().getTotal())));

        tablaVentas.setItems(TiendaData.getVentas());
    }

    @FXML
    protected void guardarVenta() {
        Cliente cliente = choiceCliente.getValue();
        Producto producto = choiceProducto.getValue();
        int cantidad = Integer.parseInt(txtCantidadVenta.getText());

        if (cliente != null && producto != null && cantidad > 0) {
            Venta v = new Venta(LocalDate.now(), cliente, producto, cantidad);
            TiendaData.getVentas().add(v);
            txtCantidadVenta.clear();
        }
    }
}
