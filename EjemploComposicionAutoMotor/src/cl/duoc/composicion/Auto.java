package cl.duoc.composicion;

public class Auto {

    private Motor motor;

    public Auto(){
        motor = new Motor();
    }

    public void activarBotonEncendidoMotor(){
        motor.encender();
    }

}
