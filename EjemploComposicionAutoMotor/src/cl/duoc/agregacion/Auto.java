package cl.duoc.agregacion;

import cl.duoc.agregacion.Motor;
//agregacion
public class Auto {

    private Motor motor;

    public Auto(Motor motor){
        this.motor = motor;
    }

    public void avanzar(){
        if(motor == null){
            System.out.println("No puede avanzar, no hay motor");
        }

        if(!motor.isEncendido()){
            motor.encender();
        }

        System.out.println("El auto avanza usando el motor : " + motor.getId());
    }


}
