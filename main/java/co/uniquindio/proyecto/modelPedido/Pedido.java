package co.uniquindio.proyecto.modelPedido;
import java.util.ArrayList;

import co.uniquindio.proyecto.modelProducto.Producto;
import co.uniquindio.proyecto.modelState.EstadoPedido;
import co.uniquindio.proyecto.modelState.PedidoCreado;

public class Pedido {

    private ArrayList<Producto> productos;
    private String nombreCliente;
    private String id;
    private String idCliente;
    private EstadoPedido estado;
    private String idTransaccion;
    private double total = 0;

    public Pedido() {
        productos = new ArrayList<>();
        this.estado = new PedidoCreado();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    public void actualizarPedido(int indiceProducto, Producto productoActualizado) {
        if (indiceProducto >= 0 && indiceProducto < productos.size()) {
            productos.set(indiceProducto, productoActualizado);
        } else {
            System.out.println("Índice de pedido inválido");
        }
    }

    public double calcularValorTotal(ArrayList<Producto> productos) {
        total = 0; // Reset total before calculation
        for (Producto x : productos) {
            total += x.getPrecio();
        }
        return total;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public EstadoPedido getEstadoPedido() {
        return estado;
    }

    
    public String getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(String idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public void manejar() {
        estado.manejar(this);
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    
}
