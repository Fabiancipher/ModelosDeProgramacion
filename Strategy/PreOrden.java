package Strategy;
public class PreOrden implements Estrategia {
	private final StringBuilder concat = new StringBuilder();
	@Override
	public String recorrer(Nodo r) {
		if(r!=null) {
			return recorrer(r, concat);
		}
		return "No existe tal nodo";
	}
	
	public String recorrer(Nodo r, StringBuilder sb) {
		if(r!=null) {
			sb.append(r.valor).append("->");
			recorrer(r.izquierdo, sb);
			recorrer(r.derecho, sb);
		}
		return sb.toString();
	}

}
