package co.edu.uniquindio.taller5.ViewController;

import co.edu.uniquindio.taller5.Module.Producto;
import co.edu.uniquindio.taller5.Module.TiendaData;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ProductoController {

    @FXML private TextField txtProducto;
    @FXML private TextField txtCantidad;
    @FXML private TextField txtPrecio;

    @FXML private TableView<Producto> tablaProductos;
    @FXML private TableColumn<Producto, String> colProducto;
    @FXML private TableColumn<Producto, String> colCantidad;
    @FXML private TableColumn<Producto, String> colPrecio;

    @FXML
    public void initialize() {
        colProducto.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getProducto()));
        colCantidad.setCellValueFactory(c -> new SimpleStringProperty(String.valueOf(c.getValue().getCantidad())));
        colPrecio.setCellValueFactory(c -> new SimpleStringProperty(String.valueOf(c.getValue().getPrecio())));

        tablaProductos.setItems(TiendaData.getProductos());
    }

    @FXML
    protected void guardarProducto() {
        Producto p = new Producto(txtProducto.getText(),
                Integer.parseInt(txtCantidad.getText()),
                Double.parseDouble(txtPrecio.getText()));
        TiendaData.getProductos().add(p);
        limpiarCampos();
    }

    @FXML
    protected void eliminarProducto() {
        Producto seleccionado = tablaProductos.getSelectionModel().getSelectedItem();
        if (seleccionado != null) {
            TiendaData.getProductos().remove(seleccionado);
        }
    }

    @FXML
    protected void actualizarProducto() {
        Producto seleccionado = tablaProductos.getSelectionModel().getSelectedItem();
        if (seleccionado != null) {
            seleccionado.setCantidad(Integer.parseInt(txtCantidad.getText()));
            seleccionado.setPrecio(Double.parseDouble(txtPrecio.getText()));
            tablaProductos.refresh();
        }
    }

    private void limpiarCampos() {
        txtProducto.clear();
        txtCantidad.clear();
        txtPrecio.clear();
    }
}
