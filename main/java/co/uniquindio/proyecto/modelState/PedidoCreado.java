package co.uniquindio.proyecto.modelState;

import co.uniquindio.proyecto.modelPedido.Pedido;

public class PedidoCreado implements EstadoPedido {
    @Override
    public void manejar(Pedido pedido) {
        pedido.setEstado(new PedidoPagado());    }
}
