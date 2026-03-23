
package Teatro;

import java.util.ArrayList;

/**
 * Esta clase representa las hileras de asientos del teatro
 * <p>
 * Está compuesta por asientos
 */
public class Fila extends Asiento{
    ArrayList<Asiento> asientos = new ArrayList<>();

    public Fila(double n){
        super(n, new TipoAsiento("", ""));
    }
    
    /**
     * Añade un asiento 
     * <p>
     * Para el tipo de dato, se comunica con la fabrica
     * @see FabricaTipos
     */
    @Override
    public void add(double numero, String color, String material) {
    	if(asientos.isEmpty()) {
    		tipo = new TipoAsiento(color, material);
    	}
    	TipoAsiento tipoCrear = FabricaTipos.getTipo(material, color);
    	asientos.add(new Asiento(numero, tipoCrear));
    }

    @Override
    public void remover(Asiento a){
        try {
            asientos.remove(a);
        } catch (Exception e) {
            salida.enviar("No se puede eliminar");
        }
    }
    @Override
    public String toString() {
    	StringBuilder sb = new StringBuilder();
        sb.append("NUMERO DE FILA: ").append(numero).append("\n");
    	sb.append("TIPO DE FILA: ").append(tipo.getMaterial()).append("\n");
    	sb.append("COLOR DE LA FILA: ").append(tipo.getColor()).append("\n");
    	sb.append("DESDE: ").append(asientos.get(0).numero).append("\n");
    	sb.append("HASTA: ").append(asientos.get(asientos.size()-1).numero).append("\n");
    	return sb.toString();
    }

    /**
     * Retorna el asiento especificado
     * <p>
     * Se obtiene con el número del asiento -1
     * @param id : El indice
     * @return
     */
    public Asiento getAsiento(int id){
        return asientos.get(id);
    }
}