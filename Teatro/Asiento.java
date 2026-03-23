package Teatro;

import EntradasSalidas.SalidaConsola;
/**
 * Esta clase representa una generalización de un asiento
 * <p>
 * Depende del Flyweight TipoAsiento
 * <p>
 * Este acercamiento permitiría la implementación de Composite
 */
public class Asiento{
    protected SalidaConsola salida = new SalidaConsola();
    public double numero;
    public TipoAsiento tipo;
    
    public Asiento(double numero, TipoAsiento tipo){
    	this.numero = numero;
    	this.tipo = tipo;
    }
    
    /**
     * Implementación general para añadir
     * @param numero: Numero de la Silla (Variable)
     * @param color : Color de la Silla (Intrinseco)
     * @param material: Material de la Silla (Intrinseco)
     */
    public void add(double numero, String color, String material) {
    	salida.enviar("No se puede añadir; es una hoja");
    }
    /**
     * Implementación general para remover
     * @param a
     */
    public void remover(Asiento a){
         salida.enviar("No se puede remover; es una hoja");
    }
}