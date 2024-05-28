package co.uniquindio.proyecto.modelStrategy;


public class PagoConPSE implements StrategyMetodoPago {

    private String email;

    public PagoConPSE(String email) {
        this.email = email;
    }

    @Override
    public boolean pagar(double montoPedido, double monto) {
        // Lógica específica para el pago con PSE
        return monto >= montoPedido;
    }

    public String getEmail() {
        return email;
    }

    
}

