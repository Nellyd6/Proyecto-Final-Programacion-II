package co.uniquindio.proyecto.modelCommand.modelCommand;

import co.uniquindio.proyecto.modelPedido.Pedido;
import co.uniquindio.proyecto.modelProducto.Producto;

/**
 * Clase AgregarProductoCommand que implementa la interfaz Command.
 * Esta clase representa un comando para agregar un producto a un pedido.
 */
public class AgregarProductoCommand implements Command {

    private Pedido pedido;
    private Producto producto;

    /**
     * Constructor para crear una nueva instancia de AgregarProductoCommand.
     *
     * @param pedido   El pedido al que se le agregará el producto.
     * @param producto El producto que se agregará al pedido.
     */
    public AgregarProductoCommand(Pedido pedido, Producto producto) {
        this.pedido = pedido;
        this.producto = producto;
    }

    /**
     * Método que ejecuta el comando, agregando el producto al pedido.
     */
    @Override
    public void execute() {
        pedido.agregarProducto(producto);
    }
}
