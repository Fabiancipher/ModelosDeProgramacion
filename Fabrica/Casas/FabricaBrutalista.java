public class FabricaBrutalista implements FabricaAbstracta{

    @Override
    public CasaBrutalista generarCasa(String paredes, String techo, String puertas, String ventanas,int cantidadParedes, int cantidadPuertas,
                                      int cantidadVentanas){
        return CasaBrutalista(paredes, techo, puertas, ventanas);
    }

}