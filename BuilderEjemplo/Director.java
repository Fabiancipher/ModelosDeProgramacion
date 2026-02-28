package BuilderEjemplo;
public class Director{
    public Director(){

    }

    public void construirBuffered(Builder builder){
        builder.construirEscritor("Buffered.txt");
        builder.construirLector("Buffered.txt");
    }
}