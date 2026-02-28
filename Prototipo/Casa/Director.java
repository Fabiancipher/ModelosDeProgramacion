package Casa;
public class Director{
    public BuilderCasa builder;

    public Director(BuilderCasa builder){
        this.builder = builder;
    }

    public void construirCasaMadera(){
        builder.construirCasa("Cristal", "Circular", "Madera", 1.0f, 1.0f, "Madera", 1.0f, 1.0f);
    }
}