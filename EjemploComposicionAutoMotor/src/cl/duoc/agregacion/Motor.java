package cl.duoc.agregacion;

public class Motor {

    //encapsulamiento
    private String id;
    private boolean encendido;

    public Motor(String id) {
        this.id = id;
    }

    public void encender(){
        if(!encendido){
            encendido = true;
            System.out.println("Motor " + id + " esta encendiendo run run");
        }else{
            System.out.println("Motor " + id + " ya esta encendido");
        }
    }

    public void apagar(){
        if(encendido){
            encendido = false;
            System.out.println("Motor " + id + " se apago");
        }else{
            System.out.println("Motor " + id + " ya esta apagado");
        }
    }

    public String getId(String usuario) {
        String idAutorizado;
        //consumimos un repositorio de base de dato
        if(usuario == "usuario-admin-001"){
            idAutorizado = id;
        }else{
            return "0";
        }
        return idAutorizado;
    }

    public boolean isEncendido() {
        return encendido;
    }
}
