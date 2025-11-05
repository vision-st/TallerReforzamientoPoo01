package cl.duoc.agregacion;

public class MainCompo {

    public static void main(String[]args){
        Motor m1 = new Motor("M1-TURBO");
        Motor m2 = new Motor("M2-POTENCIA");

        Auto auto1 = new Auto(m1);
        Auto auto2 = new Auto(m2);

        auto2.avanzar();

        auto1.avanzar();

    }

}
