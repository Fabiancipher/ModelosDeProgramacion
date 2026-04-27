package Strategy;
public class PostOrden implements Estrategia {
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
			recorrer(r.izquierdo, sb);
			recorrer(r.derecho, sb);
			sb.append(r.valor).append("->");
		}
		return sb.toString();
	}

}
