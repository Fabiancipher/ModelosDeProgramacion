package Casa;
public class BuilderCasa{
    Casa casa;
    public BuilderCasa(){

    }

    public void construirCasa(String materialVentana, String formaVentana, String materialPuerta, float altoPuerta, float anchoPuerta, String materialTecho, float altoTecho, float anchoTecho, String colorPared, String materialPared){
        Ventana ventana = new Ventana(materialVentana, formaVentana);
        Puerta puerta = new Puerta(materialPuerta, altoPuerta, anchoPuerta);
        Techo techo = new Techo(materialTecho, altoTecho, anchoTecho);
        Pared pared = new Pared(colorPared, materialPared);
        casa = new Casa(ventana, puerta, techo, pared);
    }

    public Casa getCasa(){
        return casa;
    }
}