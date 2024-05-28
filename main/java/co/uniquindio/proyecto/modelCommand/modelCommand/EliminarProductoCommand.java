package co.uniquindio.proyecto.modelCommand.modelCommand;

import co.uniquindio.proyecto.modelPedido.Pedido;
import co.uniquindio.proyecto.modelProducto.Producto;

/**
 * Clase EliminarProductoCommand que implementa la interfaz Command.
 * Esta clase representa un comando para eliminar un producto de un pedido.
 */
public class EliminarProductoCommand implements Command {

    private Pedido pedido;
    private Producto producto;

    /**
     * Constructor para crear una nueva instancia de EliminarProductoCommand.
     *
     * @param pedido   El pedido del que se eliminará el producto.
     * @param producto El producto que se eliminará del pedido.
     */
    public EliminarProductoCommand(Pedido pedido, Producto producto) {
        this.pedido = pedido;
        this.producto = producto;
    }

    /**
     * Método que ejecuta el comando, eliminando el producto del pedido.
     */
    @Override
    public void execute() {
        pedido.eliminarProducto(producto);
    }
}
