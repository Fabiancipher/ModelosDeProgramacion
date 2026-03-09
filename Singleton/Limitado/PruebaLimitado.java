package Singleton.Limitado;
public class PruebaLimitado{
    public static void main(String[] args) {

        Limitado primera = Limitado.obtenerInstancia(4);
        System.out.println(primera.toString());

        Limitado segunda = Limitado.obtenerInstancia(9000);
        System.out.println(segunda.toString());

        Limitado tercera = Limitado.obtenerInstancia(8);
        System.out.println(tercera.toString());

        Limitado cuarta = Limitado.obtenerInstancia(9765);
        System.out.println(cuarta);

        Limitado quinta = Limitado.obtenerInstancia(32565);
        System.out.println(quinta);


    }

}