package Strategy;
public class Arbol{
    public Nodo raiz;
    public Estrategia ordenRecorrido;
    public Arbol(){

    }
    public Arbol(Nodo r){
        raiz = r;
    }
    public void setEstrategia(Estrategia strat) {
    	ordenRecorrido = strat;
    }
    public void add(Nodo desde, int valor){
        if(raiz==null){raiz=new Nodo(valor); return;}

        if(valor>desde.valor){
            if(desde.derecho==null){desde.derecho = new Nodo(valor); return;} //Si no hay nodo derecho, entonces lo coloca
            add(desde.derecho, valor); //Si sí, sigue buscando 
        }

        else if(valor<desde.valor){
            if(desde.izquierdo==null){desde.izquierdo = new Nodo(valor); return;}
            add(desde.izquierdo, valor);
        }
    }
    public void add(int valor){
        add(raiz, valor);
    }
    public String recorrer() {
    	return ordenRecorrido.recorrer(raiz);
    }
}