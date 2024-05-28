package co.uniquindio.proyecto.modelProxy;

import co.uniquindio.proyecto.modelPedido.Pedido;
import co.uniquindio.proyecto.modelTransaccion.Transaccion;

public class ProxyTransaccion implements Pago{
    
    private Transaccion transaccion;
    private Pedido pedido;

    public ProxyTransaccion(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public boolean validar(Pedido pedido) {
        if (transaccion == null) {
            transaccion = new Transaccion();
        }
        return transaccion.validar(pedido);
    }

}
