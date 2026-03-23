package Teatro.Proxy;
/**
 * Representa la taquilla física
 */
public class Taquilla implements Boleteria{

    protected Taquilla(){
        
    }
    /**
     * Retorna un boleto nuevo independientemente de si ya fué creado
     */
    @Override
    public Boleto entregarBoleta(String nombre, String fecha){
        return new Boleto(nombre, fecha);
    }
}