package co.uniquindio.proyecto.modelCommand.modelCommand;

import co.uniquindio.proyecto.modelPedido.Pedido;
import co.uniquindio.proyecto.modelProducto.Producto;

public class ActualizarPedidoCommand implements Command {
    
    /** El pedido que se va a actualizar. */
    private Pedido pedido;

    /** El nuevo producto que se va a agregar al pedido. */
    private Producto producto;

    /** El índice en el pedido donde se actualizará el producto. */
    private int indice;

    /**
     * Constructor para crear una instancia de ActualizarPedidoCommand.
     *
     * @param pedido   El pedido que se va a actualizar.
     * @param producto El nuevo producto que se va a agregar al pedido.
     */
    public ActualizarPedidoCommand(Pedido pedido, Producto producto) {
        this.pedido = pedido;
        this.producto = producto;
    }

    /**
     * Ejecuta el comando de actualización del pedido.
     * Actualiza el pedido con el nuevo producto en el índice especificado.
     */
    @Override
    public void execute() {
        pedido.actualizarPedido(indice, producto);
    }
}
