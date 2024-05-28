package co.uniquindio.proyecto.modelTransaccion;

import co.uniquindio.proyecto.modelPedido.Pedido;
import co.uniquindio.proyecto.modelProxy.Pago;
import co.uniquindio.proyecto.modelStrategy.StrategyMetodoPago;

public class Transaccion implements Pago {

    private String id;
    private StrategyMetodoPago metodoPago;
    private double montoTransaccion;
    private String idPedido;
    private double precioPedido;

    public double darDevuelta() {
        if (pagoCorrecto()) {
            return montoTransaccion - precioPedido;
        }
        return 0;
    }

    public boolean pagoCorrecto() {
        return metodoPago.pagar(precioPedido, montoTransaccion);
    }

    @Override
    public boolean validar(Pedido pedido) {
        return pagoCorrecto();
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StrategyMetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(StrategyMetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public double getMontoTransaccion() {
        return montoTransaccion;
    }

    public void setMontoTransaccion(double montoTransaccion) {
        this.montoTransaccion = montoTransaccion;
    }

    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public void setPrecioPedido(double precioPedido) {
        this.precioPedido = precioPedido;
    }

    public double getPrecioPedido() {
        return precioPedido;
    }

}
