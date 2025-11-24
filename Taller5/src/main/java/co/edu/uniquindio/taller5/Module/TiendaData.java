package co.edu.uniquindio.taller5.Module;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class TiendaData {
    private static final ObservableList<Cliente> clientes = FXCollections.observableArrayList();
    private static final ObservableList<Producto> productos = FXCollections.observableArrayList();
    private static final ObservableList<Venta> ventas = FXCollections.observableArrayList();

    public static ObservableList<Cliente> getClientes() {
        return clientes;
    }

    public static ObservableList<Producto> getProductos() {
        return productos;
    }

    public static ObservableList<Venta> getVentas() {
        return ventas;
    }
}
