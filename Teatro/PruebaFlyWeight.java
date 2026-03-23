package Teatro;
import EntradasSalidas.SalidaConsola;

public class PruebaFlyWeight {
	static SalidaConsola salida = new SalidaConsola();
	static int TIPOS = 2;
	static long ASIENTOS = 8000000;
	public static void main(String[] args) {
		Asiento filaHumanos = new Fila(1);
		Asiento filaAliens = new Fila(2);
		for(int i=0; i< Math.floor(ASIENTOS/TIPOS);i++) {
			filaHumanos.add(i+1, "Rojo", "Colchon");
			filaAliens.add(i+(ASIENTOS/TIPOS)+1, "Negro", "Polvo cosmico");
		}
		
		salida.enviar(FabricaTipos.info());
		salida.enviar(filaHumanos);
		salida.enviar(filaAliens);
	}
}
