package cl.duoc.figuras;

public class Circulo extends Figura {

    public double radio;

    public Circulo(String color, double radio){
        super(color);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return 120;
    }

    public void imprimirDetalles(){
        mostrarInfo();
        System.out.println("Radio " + radio);
    }
}
