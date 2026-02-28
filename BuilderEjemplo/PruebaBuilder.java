package BuilderEjemplo;
public class PruebaBuilder{
    public static void main(String[] args) {
        Director director = new Director();
        BuilderBuffered constructorBuffered = new BuilderBuffered();
        
        director.construirBuffered(constructorBuffered);

        Escritor escritor = constructorBuffered.getEscritor();
        escritor.escribir("Hola, esto es una prueba");

        Lector lector = constructorBuffered.getLector();
        System.out.println(lector.leer());
    }
}