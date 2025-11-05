package cl.duoc.figuras;

public class Main {

    public static void main(String[]args){
        Circulo circulo = new Circulo("Rojo", 23);
        Figura figura1 = new Circulo("verde",23);
        Figura figura2 = new Circulo("verde",23);
        circulo.mostrarInfo();
        double area = circulo.calcularArea();
        System.out.println(area);
    }
}
