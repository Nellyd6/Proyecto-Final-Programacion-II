package co.uniquindio.proyecto.modelFachada;

import co.uniquindio.proyecto.modelSingleton.Pasteleria;
import co.uniquindio.proyecto.modelCliente.Cliente;
import co.uniquindio.proyecto.modelEmpleado.Empleado;
import co.uniquindio.proyecto.modelPedido.Pedido;
import co.uniquindio.proyecto.modelProducto.Producto;
import co.uniquindio.proyecto.modelTransaccion.Transaccion;

import java.util.ArrayList;
import java.util.Optional;

/**
 * La clase FachadaPasteleria proporciona una interfaz simplificada para interactuar con el subsistema de Pasteleria.
 * Utiliza el patrón de diseño Fachada para agrupar varias operaciones comunes y ofrecer una única interfaz para el cliente.
 */
public class FachadaPasteleria {
    private Pasteleria pasteleria;

    /**
     * Constructor de la clase FachadaPasteleria.
     * Inicializa la instancia única de Pasteleria utilizando el patrón Singleton.
     */
    public FachadaPasteleria() {
        this.pasteleria = Pasteleria.getInstancia();
    }

    // Métodos para manejar productos

    /**
     * Agrega un producto a la pastelería.
     * 
     * @param producto El producto a agregar.
     */
    public void agregarProducto(Producto producto) {
        pasteleria.agregarProducto(producto);
    }

    /**
     * Elimina un producto de la pastelería.
     * 
     * @param producto El producto a eliminar.
     */
    public void eliminarProducto(Producto producto) {
        pasteleria.eliminarProducto(producto);
    }

    /**
     * Obtiene la lista de productos de la pastelería.
     * 
     * @return Una lista de productos.
     */
    public ArrayList<Producto> obtenerProductos() {
        return pasteleria.getProductos();
    }

    // Métodos para manejar pedidos

    /**
     * Agrega un pedido a la pastelería.
     * 
     * @param pedido El pedido a agregar.
     */
    public void agregarPedido(Pedido pedido) {
        pasteleria.agregarPedido(pedido);
    }

    /**
     * Elimina un pedido de la pastelería.
     * 
     * @param pedido El pedido a eliminar.
     */
    public void eliminarPedido(Pedido pedido) {
        pasteleria.eliminarPedido(pedido);
    }

    /**
     * Obtiene la lista de pedidos de la pastelería.
     * 
     * @return Una lista de pedidos.
     */
    public ArrayList<Pedido> obtenerPedidos() {
        return pasteleria.getPedidos();
    }

    // Métodos para manejar transacciones

    /**
     * Agrega una transacción a la pastelería.
     * 
     * @param transaccion La transacción a agregar.
     */
    public void agregarTransaccion(Transaccion transaccion) {
        pasteleria.agregarTransaccion(transaccion);
    }

    /**
     * Elimina una transacción de la pastelería.
     * 
     * @param transaccion La transacción a eliminar.
     */
    public void eliminarTransaccion(Transaccion transaccion) {
        pasteleria.eliminarTransaccion(transaccion);
    }

    /**
     * Obtiene la lista de transacciones de la pastelería.
     * 
     * @return Una lista de transacciones.
     */
    public ArrayList<Transaccion> obtenerTransacciones() {
        return pasteleria.getTransacciones();
    }

    // Métodos para manejar clientes

    /**
     * Agrega un cliente a la pastelería.
     * 
     * @param cliente El cliente a agregar.
     */
    public void agregarCliente(Cliente cliente) {
        pasteleria.agregarCliente(cliente);
    }

    /**
     * Elimina un cliente de la pastelería.
     * 
     * @param cliente El cliente a eliminar.
     */
    public void eliminarCliente(Cliente cliente) {
        pasteleria.eliminarCliente(cliente);
    }

    /**
     * Obtiene la lista de clientes de la pastelería.
     * 
     * @return Una lista de clientes.
     */
    public ArrayList<Cliente> obtenerClientes() {
        return pasteleria.getClientes();
    }

    // Métodos para manejar empleados

    /**
     * Agrega un empleado a la pastelería.
     * 
     * @param empleado El empleado a agregar.
     */
    public void agregarEmpleado(Empleado empleado) {
        pasteleria.agregarEmpleado(empleado);
    }

    /**
     * Elimina un empleado de la pastelería.
     * 
     * @param empleado El empleado a eliminar.
     */
    public void eliminarEmpleado(Empleado empleado) {
        pasteleria.eliminarEmpleado(empleado);
    }

    /**
     * Obtiene la lista de empleados de la pastelería.
     * 
     * @return Una lista de empleados.
     */
    public ArrayList<Empleado> obtenerEmpleados() {
        return pasteleria.getEmpleados();
    }

    // Métodos de búsqueda

    /**
     * Busca un cliente en la pastelería.
     * 
     * @param cliente El cliente a buscar.
     * @return Un Optional que contiene el cliente si se encuentra, o vacío si no se encuentra.
     */
    public Optional<Cliente> buscarCliente(Cliente cliente) {
        return pasteleria.buscarCliente(cliente);
    }

    /**
     * Busca un pedido en la pastelería.
     * 
     * @param pedido El pedido a buscar.
     * @return Un Optional que contiene el pedido si se encuentra, o vacío si no se encuentra.
     */
    public Optional<Pedido> buscarPedido(Pedido pedido) {
        return pasteleria.buscarPedido(pedido);
    }

    /**
     * Busca un producto en la pastelería.
     * 
     * @param producto El producto a buscar.
     * @return Un Optional que contiene el producto si se encuentra, o vacío si no se encuentra.
     */
    public Optional<Producto> buscarProducto(Producto producto) {
        return pasteleria.buscarProducto(producto);
    }

    /**
     * Busca una transacción en la pastelería.
     * 
     * @param transaccion La transacción a buscar.
     * @return Un Optional que contiene la transacción si se encuentra, o vacío si no se encuentra.
     */
    public Optional<Transaccion> buscarTransaccion(Transaccion transaccion) {
        return pasteleria.buscarTransaccion(transaccion);
    }

    /**
     * Busca un empleado en la pastelería.
     * 
     * @param empleado El empleado a buscar.
     * @return Un Optional que contiene el empleado si se encuentra, o vacío si no se encuentra.
     */
    public Optional<Empleado> buscarEmpleado(Empleado empleado) {
        return pasteleria.buscarEmpleado(empleado);
    }
}
