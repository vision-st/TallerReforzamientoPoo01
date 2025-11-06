package cl.duoc.pagos.tipospago;

import cl.duoc.pagos.Pago;

public class PagoCredito extends Pago {

    private String numeroTarjeta;

    public PagoCredito(double monto, String numeroTarjeta) {
        super(monto);
        this.numeroTarjeta = numeroTarjeta;
    }

    //sobrecarga - mismo nombre de metodo con distintos parametros
    public PagoCredito(double monto, String numeroTarjeta, int hora) {
        super(monto);
        this.numeroTarjeta = numeroTarjeta;
    }

    /**
     * Metodo de procesamiento de pagos segun la tarjeta de credito
     */
    @Override
    public void procesarPago() {
        System.out.println("Procesando pago con tarjeta de credito...");
        System.out.println("Monto: " + monto);
        System.out.println("Tarjeta: " + numeroTarjeta.substring(0,4) + "*******");
        System.out.println("Transacción aprobada.");
    }

}
