package co.uniquindio.proyecto.modelStrategy;


public class PagoConEfectivo implements StrategyMetodoPago {

    @Override
    public boolean pagar(double montoPedido, double monto) {
        // Lógica específica para el pago en efectivo
        return monto >= montoPedido;
    }
}
