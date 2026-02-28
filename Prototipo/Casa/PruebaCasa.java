package Casa;
public class PruebaCasa{
    public static void main(String[] args) {
        BuilderCasa constructor = new BuilderCasa();
        Director director = new Director(constructor);
        director.construirCasaMadera();
        Casa casaMadera = constructor.getCasa();
        Casa clon = casaMadera.clonar();
        System.out.println("Casa original: \n"+casaMadera);
        System.out.println("Clon: \n"+clon);
    }
}