package Teatro.Proxy;
/**
 * Representa un boleto
 */
public class Boleto{
    private final String funcion;
    private final String fecha;
    /**
     * 
     * @param f : Nombre de la funcion
     * @param d : Fecha de la funcion
     */
    public Boleto(String f, String d){
        funcion = f;
        fecha = d;
    }

    public String getFuncion(){
        return funcion;
    }

    public String getFecha(){
        return fecha;
    }

    @Override
    public String toString(){
        return "Nombre: "+funcion+"\n"+"Fecha: "+fecha+"\n";
    }

    /**
     * Crea un clon de la boleta objetivo
     * @return Un clon profundo del boleto
     */
    public Boleto clonar(){
        return new Boleto(this.funcion, this.fecha);
    }

}