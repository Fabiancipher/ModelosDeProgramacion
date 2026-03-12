package CarrosEjemplos;
import EntradasSalidas.SalidaConsola;
public class PruebaCarros{
    static SalidaConsola salida = new SalidaConsola();
    public static void main(String[] args){
        Builder builder = new BuilderDiesel();
        Director director = new Director(builder);

        director.construirCamioneta();
        Carro camioneta = builder.getCarro();
        salida.mostrar(camioneta.toString());
        director.construirDeportivo();
        Carro deportivo = builder.getCarro();
        salida.mostrar(deportivo.toString());
    }
}