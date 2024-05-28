package co.uniquindio.proyecto.modelTransaccion;


import co.uniquindio.proyecto.modelStrategy.StrategyMetodoPago;

public class TransaccionBuilder {

    private String id;
    private StrategyMetodoPago metodoPago;
    private double montoTransaccion;
    private String idPedido;
    private double precioPedido;

    public TransaccionBuilder() {
    }

    public TransaccionBuilder id(String id) {
        this.id = id;
        return this;
    }

    public TransaccionBuilder metodoPago(StrategyMetodoPago metodoPago) {
        this.metodoPago = metodoPago;
        return this;
    }

    public TransaccionBuilder montoTransaccion(double montoTransaccion) {
        this.montoTransaccion = montoTransaccion;
        return this;
    }

    public TransaccionBuilder idPedido(String idPedido) {
        this.idPedido = idPedido;
        return this;
    }

    public TransaccionBuilder precioPedido(double precioPedido) {
        this.precioPedido = precioPedido;
        return this;
    }

    public Transaccion build() {
        Transaccion transaccion = new Transaccion();
        transaccion.setId(id);
        transaccion.setMetodoPago(metodoPago);
        transaccion.setMontoTransaccion(montoTransaccion);
        transaccion.setIdPedido(idPedido);
        transaccion.setPrecioPedido(precioPedido);
        return transaccion;
    }
}
