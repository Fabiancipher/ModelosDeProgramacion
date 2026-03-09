package Singleton;
public class Empleado{
    String cargo;
    
    public Empleado(String c){
        cargo = c;
    }

    public boolean tieneAcceso(){
        return !(!cargo.toUpperCase().equals("TECNICO")&&!cargo.toUpperCase().equals("ADMIN"));
    }

}