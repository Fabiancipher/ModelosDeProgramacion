package Teatro.Proxy;
/**
 * Abstraccion de una entidad capaz de entregar boletos
 */
public interface Boleteria{
    /**
     * Abstraccion de una entrega de una boleta
     * @param nombre : Nombre de la funcion
     * @param fecha : Fecha de la funcion
     * @return Un boleto
     */
    public Boleto entregarBoleta(String nombre, String fecha);
}