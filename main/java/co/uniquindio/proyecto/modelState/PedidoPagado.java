package co.uniquindio.proyecto.modelState;

import co.uniquindio.proyecto.modelPedido.Pedido;

class PedidoPagado implements EstadoPedido {

    @Override
    public void manejar(Pedido pedido) {
        System.out.println("El pedido " + pedido.getId() + " ha sido pagado.");
        pedido.setEstado(new PedidoEnviado());
    }
}
