package co.uniquindio.proyecto.modelSingleton;

import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Predicate;

import co.uniquindio.proyecto.modelCliente.Cliente;
import co.uniquindio.proyecto.modelEmpleado.Empleado;
import co.uniquindio.proyecto.modelPedido.Pedido;
import co.uniquindio.proyecto.modelProducto.Producto;
import co.uniquindio.proyecto.modelTransaccion.Transaccion;
import co.uniquindio.proyecto.util.AssertionUtil;
import java.util.Scanner;


public class Pasteleria {
    // Instancia única de la clase
    private static Pasteleria instancia;

    // Listas para almacenar productos, pedidos, transacciones, clientes y empleados
    private ArrayList<Producto> productos;
    private ArrayList<Pedido> pedidos;
    private ArrayList<Transaccion> transacciones;
    private ArrayList<Cliente> clientes;
    private ArrayList<Empleado> empleados;

    // Constructor privado
    private Pasteleria() {
        productos = new ArrayList<>();
        pedidos = new ArrayList<>();
        transacciones = new ArrayList<>();
        clientes = new ArrayList<>();
        empleados = new ArrayList<>();
    }

    // Método para obtener la instancia única
    public static Pasteleria getInstancia() {
        if (instancia == null) {
            synchronized (Pasteleria.class) {
                if (instancia == null) {
                    instancia = new Pasteleria();
                }
            }
        }
        return instancia;
    }

    // Métodos para manejar productos
    public void agregarProducto(Producto producto) {
        validarProductoExiste(producto);
        productos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        validarProductoClienteExiste(producto);
        eliminarProd(producto);
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    // Métodos para manejar pedidos
    public void agregarPedido(Pedido pedido) {
        validarPedidoExiste(pedido);
        pedidos.add(pedido);
    }

    public void eliminarPedido(Pedido pedido) {
        validarPedidoClienteExiste(pedido);
        eliminarP(pedido);
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    // Métodos para manejar transacciones
    public void agregarTransaccion(Transaccion transaccion) {
        validarTransaccionExiste(transaccion);
        transacciones.add(transaccion);
    }

    public void eliminarTransaccion(Transaccion transaccion) {
        validarTransaccionPedidoExiste(transaccion);
        eliminarT(transaccion);
    }

    public ArrayList<Transaccion> getTransacciones() {
        return transacciones;
    }

    // Métodos para manejar clientes
    public void agregarCliente(Cliente cliente) {
        validarClienteExiste(cliente);
        clientes.add(cliente);
    }

    public void eliminarCliente(Cliente cliente) {
        validarClientePedidoExiste(cliente);
        eliminarC(cliente);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    // Métodos para manejar empleados
    public void agregarEmpleado(Empleado empleado) {
        validarEmpleadoExiste(empleado);
        empleados.add(empleado);
    }

    public void eliminarEmpleado(Empleado empleado) {
        empleados.remove(empleado);
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    // métodos para validar que los objetos tengan un mismo identificador único

    // busca un cliente en la lista por su código
    public Optional<Cliente> buscarCliente(Cliente cliente) {
        Predicate<Cliente> codigoIgual = j -> j.getId().equals(cliente.getId());
        return clientes.stream().filter(codigoIgual).findAny();
    }

    /**
     * Valida que no exista ya un cliente registrado con el mismo nombre, en caso de
     * haberlo genera un AssertionError.
     */
    private void validarClienteExiste(Cliente cliente) {
        boolean existeCliente = buscarCliente(cliente).isPresent();
        AssertionUtil.assertion(!existeCliente, "El cliente ya está registrado");
    }

    // busca un pedido en la lista por su código
    public Optional<Pedido> buscarPedido(Pedido pedido) {
        Predicate<Pedido> codigoIgual = j -> j.getId().equals(pedido.getId());
        return pedidos.stream().filter(codigoIgual).findAny();
    }

    /**
     * Valida que no exista ya un pedido registrado con el mismo código, en caso de
     * haberlo genera un AssertionError.
     */
    private void validarPedidoExiste(Pedido pedido) {
        boolean existePedido = buscarPedido(pedido).isPresent();
        AssertionUtil.assertion(!existePedido, "El pedido ya está registrado");
    }

    // busca un producto en la lista por su código
    public Optional<Producto> buscarProducto(Producto producto) {
        Predicate<Producto> codigoIgual = j -> j.getiD().equals(producto.getiD());
        return productos.stream().filter(codigoIgual).findAny();
    }

    /**
     * Valida que no exista ya un producto registrado con el mismo código, en caso
     * de haberlo genera un AssertionError.
     */
    private void validarProductoExiste(Producto producto) {
        boolean existeProducto = buscarProducto(producto).isPresent();
        AssertionUtil.assertion(!existeProducto, "El producto ya está registrado");
    }

    // busca un transaccion en la lista por su código
    public Optional<Transaccion> buscarTransaccion(Transaccion transaccion) {
        Predicate<Transaccion> codigoIgual = j -> j.getId().equals(transaccion.getId());
        return transacciones.stream().filter(codigoIgual).findAny();
    }

    /**
     * Valida que no exista ya una transaccion registrado con el mismo código, en
     * caso de haberlo genera un AssertionError.
     */
    private void validarTransaccionExiste(Transaccion transaccion) {
        boolean existeTransaccion = buscarTransaccion(transaccion).isPresent();
        AssertionUtil.assertion(!existeTransaccion, "la transaccion ya está registrada");
    }

    // busca un empleado en la lista por su código
    public Optional<Empleado> buscarEmpleado(Empleado empleado) {
        Predicate<Empleado> codigoIgual = j -> j.getId().equals(empleado.getId());
        return empleados.stream().filter(codigoIgual).findAny();
    }

    /**
     * Valida que no exista ya un empleado registrado con el mismo código, en caso
     * de haberlo genera un AssertionError.
     */
    private void validarEmpleadoExiste(Empleado empleado) {
        boolean existeEmpleado = buscarEmpleado(empleado).isPresent();
        AssertionUtil.assertion(!existeEmpleado, "El empleado ya está registrado");
    }

    // métodos que validan que
    /*
     * Se puede eliminar un objeto sólo si no está relacionado en alguna
     * transacción.
     * Se debe poder obtener el el objeto que se desea eliminar y antes de ser
     * eliminado se debe
     * mostrar un mensaje de confirmación.
     */

    // busca un pedido dentro de la lista de clientes
    public Optional<Cliente> buscarPedidoListaCliente(Pedido pedido) {
        Predicate<Cliente> pedidoIgual = j -> j.getId().equals(pedido.getIdCliente());
        return clientes.stream().filter(pedidoIgual).findAny();
    }

    // Valida que el cliente del pedido exista en la lista de clientes
    private void validarPedidoClienteExiste(Pedido pedido) {
        boolean existePedido = buscarPedidoListaCliente(pedido).isPresent();
        AssertionUtil.assertion(!existePedido, "El pedido del cliente ya está registrado");
    }

    // Busca un producto dentro de la lista de clientes por su nombre
    public Optional<Pedido> buscarProductoListaPedidos(Producto producto) {
        Predicate<Pedido> pedidoConProducto = pedido -> pedido.getProductos().stream()
                .anyMatch(p -> p.getiD().equals(producto.getiD()));

        return pedidos.stream().filter(pedidoConProducto).findAny();
    }

    // Valida que el producto exista en la lista de productos del cliente
    private void validarProductoClienteExiste(Producto producto) {
        boolean existeProducto = buscarProductoListaPedidos(producto).isPresent();
        AssertionUtil.assertion(!existeProducto, "El producto está registrado para algún cliente");
    }

    // busca un cliente dentro de la lista de pedidos
    public Optional<Pedido> buscarClienteListaPedidos(Cliente cliente) {
        Predicate<Pedido> idIgual = j -> j.getIdCliente().equals(cliente.getId());
        return pedidos.stream().filter(idIgual).findAny();
    }

    // Valida que el pedido del cliente exista en la lista 
    private void validarClientePedidoExiste(Cliente cliente) {
        boolean existeClientee = buscarClienteListaPedidos(cliente).isPresent();
        AssertionUtil.assertion(!existeClientee, "El cliente del pedido ya está registrado");
    }


    // Busca una transaccion dentro de la lista de pedidos por su id
    public Optional<Pedido> buscarTrasaccionListaPedidos(Transaccion transaccion) {
        Predicate<Pedido> pedidoConTransaccion = pedido -> pedido.getIdTransaccion().equals
            (transaccion.getId());
        return pedidos.stream().filter(pedidoConTransaccion).findAny();
    }

    // Valida que la transaccion exista en el pedido
    private void validarTransaccionPedidoExiste(Transaccion transaccion) {
        boolean existeTransaccionn = buscarTrasaccionListaPedidos(transaccion).isPresent();
        AssertionUtil.assertion(!existeTransaccionn, "El producto está registrado para algún cliente");
    }


    public boolean confirmarEliminacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Está seguro de que desea eliminar este objeto? (s/n): ");
        String respuesta = scanner.nextLine();
        return respuesta.equalsIgnoreCase("s");
}



    // metodos que validan que se pueda elimiinar un pedido
    private boolean eliminarPedidoCliente(Pedido pedido){
        boolean validar=false;
        boolean existePedido = buscarPedidoListaCliente(pedido).isPresent();
        if (existePedido==false){
            validar= true;
        }
        return validar;
    }

    public Pedido obtenerPedidoPorId(String idPedido) {
        return pedidos.stream()
                       .filter(pedido -> pedido.getId().equals(idPedido))
                       .findAny()
                       .orElse(null);
    }

    public void eliminarP(Pedido pedido){
        boolean confirmacion = confirmarEliminacion();
        if(eliminarPedidoCliente(pedido)==true){
            System.out.println("¿Está seguro de que desea eliminar este pedido?");
            if(confirmacion){
                pedidos.remove(pedido);
                System.out.println("pedido eliminado exitosamente.");
            }
            } else {
                System.out.println("Eliminación cancelada.");
            }
        }





    // metodos que validan que se pueda elimiinar un Producto
    private boolean eliminarProductoCliente(Producto producto){
        boolean validar=false;
        boolean existeProducto = buscarProductoListaPedidos(producto).isPresent();
        if (existeProducto==false){
            validar= true;
        }
        return validar;
    }

    public Producto obtenerProductoPorId(String idProducto) {
        return productos.stream()
                       .filter(producto -> producto.getiD().equals(idProducto))
                       .findAny()
                       .orElse(null);
    }

    public void eliminarProd(Producto producto){
        boolean confirmacion = confirmarEliminacion();
        if(eliminarProductoCliente(producto)==true){
            System.out.println("¿Está seguro de que desea eliminar este producto?");
            if(confirmacion){
                productos.remove(producto);
                System.out.println("producto eliminado exitosamente.");
            }
            } else {
                System.out.println("Eliminación cancelada.");
            }
        }


        // metodos que validan que se pueda eliminar un cliente
    private boolean eliminarClienteLis(Cliente cliente){
        boolean validar=false;
        boolean existePedido = buscarClienteListaPedidos(cliente).isPresent();
        if (existePedido==false){
            validar= true;
        }
        return validar;
    }

    public Cliente obtenerClientePorId(String idCliente) {
        return clientes.stream()
                       .filter(cliente -> cliente.getId().equals(idCliente))
                       .findAny()
                       .orElse(null);
    }

    public void eliminarC(Cliente cliente){
        boolean confirmacion = confirmarEliminacion();
        if(eliminarClienteLis(cliente)==true){
            System.out.println("¿Está seguro de que desea eliminar este cliente?");
            if(confirmacion){
                clientes.remove(cliente);
                System.out.println("cliente eliminado exitosamente.");
            }
            } else {
                System.out.println("Eliminación cancelada.");
            }
        }



        // metodos que validan que se pueda eliminar una transaccion
    private boolean eliminarTransaccionn(Transaccion transaccion){
        boolean validar=false;
        boolean existeTransaccion = buscarTrasaccionListaPedidos(transaccion).isPresent();
        if (existeTransaccion==false){
            validar= true;
        }
        return validar;
    }

    public Transaccion obtenerTransaccionPorId(String idTransaccion) {
        return transacciones.stream()
                       .filter(transaccion -> transaccion.getId().equals(idTransaccion))
                       .findAny()
                       .orElse(null);
    }

    public void eliminarT(Transaccion transaccion){
        boolean confirmacion = confirmarEliminacion();
        if(eliminarTransaccionn(transaccion)==true){
            System.out.println("¿Está seguro de que desea eliminar esta transaccion?");
            if(confirmacion){
                transacciones.remove(transaccion);
                System.out.println("transaccion eliminada exitosamente.");
            }
            } else {
                System.out.println("Eliminación cancelada.");
            }
        }



}
  


