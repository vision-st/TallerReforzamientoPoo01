package cl.duoc.figuras;

public abstract class Figura {

    public String color;

    public Figura(String color){
        this.color = color;
    }

    // los hijos estan obligados a implementar
    public abstract double calcularArea();

    //Los hijos si quieren implementan el metodo
    public void mostrarInfo(){
        System.out.println("Color " + color);
    }
}
