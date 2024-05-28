package co.uniquindio.proyecto.modelState;

import co.uniquindio.proyecto.modelPedido.Pedido;

class PedidoEntregado implements EstadoPedido {
    @Override
    public void manejar(Pedido pedido) {
        System.out.println("El pedido " + pedido.getId() + " ha sido entregado.");
    }
}
