public class PruebaFabricaCasas{
    public static void Main(String[] args){
        FabricaAbstracta fabrica = new FabricaBrutalista();

        Casa brutalista = crearCasa(fabrica);
        System.out.println(brutalista);

        fabrica = new FabricaColonial();

        Casa colonial = crearCasa(fabrica);
        System.out.println(colonial);

    }

    public static Casa crearCasa(FabricaAbstracta fabrica){
        Casa casa = fabrica.generarCasa("Marmol", "Marmol", "Cristal", "Cuadrada", 16, 4, 1);
        return casa;
    }
}