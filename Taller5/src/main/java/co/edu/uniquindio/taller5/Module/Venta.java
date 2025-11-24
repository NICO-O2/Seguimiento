package co.edu.uniquindio.taller5.Module;

import java.time.LocalDate;

public class Venta {
    private LocalDate fecha;
    private Cliente cliente;
    private Producto producto;
    private int cantidad;
    private double precioUnitario;
    private double total;

    public Venta(LocalDate fecha, Cliente cliente, Producto producto, int cantidad) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = producto.getPrecio();
        this.total = cantidad * precioUnitario;
    }

    public LocalDate getFecha() { return fecha; }
    public Cliente getCliente() { return cliente; }
    public Producto getProducto() { return producto; }
    public int getCantidad() { return cantidad; }
    public double getPrecioUnitario() { return precioUnitario; }
    public double getTotal() { return total; }
}
