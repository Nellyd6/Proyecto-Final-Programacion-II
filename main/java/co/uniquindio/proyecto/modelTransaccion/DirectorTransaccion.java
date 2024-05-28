package co.uniquindio.proyecto.modelTransaccion;

import co.uniquindio.proyecto.modelStrategy.StrategyMetodoPago;

public class DirectorTransaccion {

    private TransaccionBuilder builder;

    public DirectorTransaccion(TransaccionBuilder builder) {
        this.builder = builder;
    }

    public Transaccion construirTransaccion(String id, StrategyMetodoPago metodoPago,
            double montoTransaccion, String idPedido, double precioPedido) {
        return builder
                .id(id)
                .metodoPago(metodoPago)
                .montoTransaccion(montoTransaccion)
                .precioPedido(precioPedido)
                .build();

    }
}
