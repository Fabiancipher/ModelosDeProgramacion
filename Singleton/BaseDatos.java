package Singleton;
public class BaseDatos{
    public static BaseDatos instancia;
    public int tablas;

    private BaseDatos(int t){
        tablas = t;
    }

    public static BaseDatos obtenerInstancia(int inicial){
        if(instancia==null){
            instancia = new BaseDatos(inicial);
            return instancia;
        }
        return instancia;
    }

    @Override
    public String toString(){
        return "Cantidad de tablas: "+tablas;
    }
}