package Teatro.Proxy;

import java.util.HashMap;
import java.util.Map;
/**
 * Representa una página que almacena boletos en cache
 * <p>
 * Se comunica con la taquillera real
 */
public class BoleteriaOnline implements Boleteria{
    private final Map<String, Boleto> boletos = new HashMap<>();
    private static final Taquilla taquilla = new Taquilla();

    public BoleteriaOnline(){

    }
    /**
     * Retorna un objeto almacenado en cache
     * <p>
     * Si no existe, lo añade a cache
     */
    @Override
    public Boleto entregarBoleta(String nombre, String fecha){
        Boleto buscado = boletos.get(nombre);
        if(buscado==null){
            buscado = taquilla.entregarBoleta(nombre, fecha);
            boletos.put(nombre, buscado);
        }
        return buscado;
    }
}