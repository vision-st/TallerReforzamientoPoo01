package cl.duoc.pagos.main;

import cl.duoc.pagos.Pago;
import cl.duoc.pagos.tipospago.PagoCredito;
import cl.duoc.pagos.tipospago.PagoDebito;
import cl.duoc.pagos.tipospago.PagoPayPal;

public class Main {

    public static void main(String[]args){

        Pago pago1 = new PagoCredito(10000, "456765678765456");
        Pago pago2 = new PagoDebito(10000, "BESHEI");
        Pago pago3 = new PagoPayPal(10000, "CORREO@CORREO.CL");

        pago1.procesarPago();
        pago2.procesarPago();
        pago3.procesarPago();

        System.out.println("=====PAGO MASIVO=====");
        Pago[] pagos = { pago1, pago2, pago3 };

        for (Pago p : pagos) {
            p.procesarPago();
        }
    }
}
