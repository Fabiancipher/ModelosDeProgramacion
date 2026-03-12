public class FabricaColonial implements FabricaAbstracta{

    @Override
    public CasaColonial generarCasa(Pared paredes, Techo techo, Puerta puertas, Ventana ventanas, int cantidadParedes, int cantidadPuertas
                                    int cantidadVentanas){
        return CasaColonial(paredes, techo, puertas, ventanas)
    }

}