package BuilderEjemplo;

public class BuilderBuffered implements Builder{
    private Escritor escritor;
    private Lector lector;
    public BuilderBuffered(){

    }

    @Override
    public void construirEscritor(String nombre){
        escritor = new Escritor(nombre);
    }

    @Override
    public void construirLector(String nombre){
        lector = new Lector(nombre);
    }

    public Escritor getEscritor(){
        return escritor;
    }

    public Lector getLector(){
        return lector;
    }
}