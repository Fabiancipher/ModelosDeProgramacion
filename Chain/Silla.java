package Chain;
public class Silla{
    private final int precio;
    private final String tipo;
    private Silla next;

    public Silla(int p, String t){
        precio = p;
        tipo = t;
    }

    public void setNext(Silla next){
        this.next = next;
    }

    public String handle(int p){
        if(p==precio){
            return "Tipo: "+tipo+"\n"+"Precio: "+precio;
        }
        if(next!=null){
            return next.handle(p);
        }
        return "No hallado";
    }
    
    public String handle(String t) {
    	if(t.equalsIgnoreCase(tipo)) {
    		return "Tipo: "+tipo+"\n"+"Precio: "+precio;
    	}
    	if(next!=null) {
    		return next.handle(t);
    	}
    	return "No hallado";
    }
}