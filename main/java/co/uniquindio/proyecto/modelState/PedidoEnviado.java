package co.uniquindio.proyecto.modelState;

import co.uniquindio.proyecto.modelPedido.Pedido;

class PedidoEnviado implements EstadoPedido {
    @Override
    public void manejar(Pedido pedido) {
        System.out.println("El pedido " + pedido.getId() + " ha sido enviado.");
        pedido.setEstado(new PedidoEntregado());
    }
}
