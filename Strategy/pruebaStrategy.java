package Strategy;
import EntradasSalidas.SalidaConsola;
public class pruebaStrategy{
    private static final SalidaConsola salida = new SalidaConsola();
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        arbol.add(5);
        arbol.add(6);
        arbol.add(3);
        arbol.add(7);
        arbol.add(2);
        arbol.add(1);
        salida.enviar(arbol.raiz);
        
        try {
        	salida.enviar("Recorrido PreOrden: \n");
        	arbol.setEstrategia(new PreOrden());
        	salida.enviar(arbol.recorrer());
        }catch(Exception e) {
        	salida.enviar(e);
        }
        
        try {
        	salida.enviar("Recorrido PostOrden: \n");
        	arbol.setEstrategia(new PostOrden());
        	salida.enviar(arbol.recorrer());
        }catch(Exception e) {
        	salida.enviar(e);
        }
        
    }
}