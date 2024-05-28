package co.uniquindio.proyecto.modelProxy;

import co.uniquindio.proyecto.modelPedido.Pedido;

public interface Pago {
    public boolean validar(Pedido pedido);
}
