package Strategy;
public class Nodo{
    public int valor;
    public Nodo izquierdo;
    public Nodo derecho;

    public Nodo(int v){
        valor = v;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Valor: ").append(valor).append("\n");

        if(izquierdo!=null){
            sb.append("Datos del hijo izquierdo de \"").append(valor).append("\": \n").
            append("\t").append(izquierdo.toString());
        }
        if(derecho!=null){
            sb.append("Datos del hijo derecho de \"").append(valor).append("\": \n").
            append("\t").append(derecho.toString());
        }
        
        return sb.toString();
    }
}