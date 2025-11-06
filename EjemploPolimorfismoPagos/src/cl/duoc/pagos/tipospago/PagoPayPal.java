package cl.duoc.pagos.tipospago;

import cl.duoc.pagos.Pago;

public class PagoPayPal extends Pago {

    private String correoCuenta;

    public PagoPayPal(double monto, String correoCuenta) {
        super(monto);
        this.correoCuenta = correoCuenta;
    }

    /**
     * Metodo de procesamiento de pagos segun paypal
     */
    @Override
    public void procesarPago() {
        System.out.println("Procesando pago con paypal...");
        System.out.println("Monto: " + monto);
        System.out.println("Cuenta: " + correoCuenta);
        System.out.println("Transacción aprobada con paypal.");
    }
}
