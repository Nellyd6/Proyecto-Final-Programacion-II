package co.uniquindio.proyecto.modelPedido;

import java.time.LocalDate;

import co.uniquindio.proyecto.modelState.EstadoPedido;

public interface PedidoBuilder {

    void nombreCliente(String nombreCliente);
    void id(String id);
    void idCliente(String idCliente);
    void fechaEntrega(LocalDate fechaEntrega);
    void estado(EstadoPedido estado);
    void idTransaccion(String idTransaccion);

    Pedido build();
}
