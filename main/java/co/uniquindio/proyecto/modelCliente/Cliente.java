package co.uniquindio.proyecto.modelCliente;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;

import co.uniquindio.proyecto.modelPedido.Pedido;
import co.uniquindio.proyecto.util.AssertionUtil;

public class Cliente { 
    private String nombre;
    private String telefono;
    private String id;
    private String correo;
    private String direccion;
    private ArrayList<Pedido> pedidos;

    public Cliente() {
        pedidos = new ArrayList<>();
    }


    public void agregarPedido(Pedido pedido){
        validarPedidoExiste(pedido);
        eliminarP(pedido);
    }

    public void eliminarPedido(Pedido pedido){
        validarPedidoClienteExist(pedido);
        pedidos.remove(pedido);
    }

 // busca un pedido en la lista por su código
    public Optional<Pedido> buscarPedidoCli(Pedido pedido) {
        Predicate<Pedido> codigoIgual = j -> j.getId().equals(pedido.getId());
        return pedidos.stream().filter(codigoIgual).findAny();
    }

    /**
     * Valida que no exista ya un pedido registrado con el mismo código, en caso de
     * haberlo genera un AssertionError.
     */
    private void validarPedidoExiste(Pedido pedido) {
        boolean existePedido = buscarPedidoCli(pedido).isPresent();
        AssertionUtil.assertion(!existePedido, "El pedido ya está registrado");
    }





     // métodos que validan que
    /*
     * Se puede eliminar un objeto sólo si no está relacionado en alguna
     * transacción.
     * Se debe poder obtener el el objeto que se desea eliminar y antes de ser
     * eliminado se debe
     * mostrar un mensaje de confirmación.
     */




    // Valida que producto esté relacionado con una transacción
    private void validarPedidoClienteExist(Pedido pedido) {
        boolean existePedido = pedido.getIdCliente().equals(id);
        AssertionUtil.assertion(!existePedido, "El pedido del cliente está registrado con una transacción");
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
        boolean existePedido = buscarPedidoCli(pedido).isPresent();
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



    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
