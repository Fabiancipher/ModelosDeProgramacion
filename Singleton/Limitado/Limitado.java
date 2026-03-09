package Singleton.Limitado;
public class Limitado{
    public static Limitado[] instancias;
    private static int solicitudes = 0;

    private Limitado(){
        
    }

    public static Limitado obtenerInstancia(int inicial){

        if(solicitudes==0){
            instancias = new Limitado[inicial];
        }

        if(solicitudes>=instancias.length){
            System.err.println("Cantidad maxima alcanzada\n");
        }

        try {
            Limitado nuevaInstancia = new Limitado();
            instancias[solicitudes] = nuevaInstancia;
            solicitudes++;
        } catch (Exception e) {
            System.err.println("Error: Cantidad maxima alcanzada\n");
            return null;
        }

        return instancias[solicitudes-1];
    }

    public static boolean esPrimeraSolicitud(){
        return solicitudes==0;
    }

    @Override
    public String toString(){
        return "Cantidad total de solicitudes: "+solicitudes+"\n"+
               "Cantidad maxima: "+instancias.length;
    }
}