package Teatro;

import java.util.HashMap;
import java.util.Map;

/**
 * Esta clase almacena los tipos de asientos que se le indican para su posterior uso
 */
public class FabricaTipos{
    private final static Map<String, TipoAsiento> tipo = new HashMap<>();
   
    /**
     * Busca el tipo de asiento especificado en base al material
     * <p>
     * Si no lo encuentra, lo añade al cache
     * @param material : Clave
     * @param color : Valor
     * @return Un tipo de asiento
     */
    public static TipoAsiento getTipo(String material, String color){
        TipoAsiento buscado = tipo.get(material); //Busca al tipo
        if(buscado==null){ //Si no existe...
            buscado = new TipoAsiento(color, material);
            tipo.put(material,buscado ); //Lo crea y añade
        }
        return buscado; //Siempre retorna un tipo
    }
    
    /**
     * Representa a los tipos de asientos registrados 
     * @return La información almacenada en cache de la clase
     */
    public static String info() {
    	StringBuilder sb = new StringBuilder();
    	sb.append("TIPOS REGISTRADOS: ").append("\n");
    	for(TipoAsiento registro: tipo.values()) {
    		sb.append(registro.getMaterial()).append("\n");
    	}
    	return sb.toString();
    }
}