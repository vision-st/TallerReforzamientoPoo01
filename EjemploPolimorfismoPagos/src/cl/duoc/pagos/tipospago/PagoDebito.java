package cl.duoc.pagos.tipospago;

import cl.duoc.pagos.Pago;

public class PagoDebito extends Pago {

    private String bancoAsociado;

    public PagoDebito(double monto, String bancoAsociado) {
        super(monto);
        this.bancoAsociado = bancoAsociado;
    }

    /**
     * Metodo de procesamiento de pagos segun la tarjeta de debito
     */
    @Override
    public void procesarPago() {
        System.out.println("Procesando pago con tarjeta de debito...");
        System.out.println("Monto: " + monto);
        System.out.println("Banco: " + bancoAsociado);
        System.out.println("Transacción aprobada con debito.");
    }
}
