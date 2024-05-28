package co.uniquindio.proyecto.modelStrategy;

public class PagoConTarjeta implements StrategyMetodoPago {

    private String numeroTarjeta;

    public PagoConTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public boolean pagar(double montoPedido, double monto) {
        // Lógica específica para el pago con tarjeta
        return monto >= montoPedido;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

}

