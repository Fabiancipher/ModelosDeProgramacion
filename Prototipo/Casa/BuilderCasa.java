package Casa;
public class BuilderCasa{
    Casa casa;
    public BuilderCasa(){

    }

    public void construirCasa(String materialVentana, String formaVentana, String materialPuerta, float altoPuerta, float anchoPuerta, String materialTecho, float altoTecho, float anchoTecho){
        Ventana ventana = new Ventana(materialVentana, formaVentana);
        Puerta puerta = new Puerta(materialPuerta, altoPuerta, anchoPuerta);
        Techo techo = new Techo(materialTecho, altoTecho, anchoTecho);
        casa = new Casa(ventana, puerta, techo);
    }

    public Casa getCasa(){
        return casa;
    }
}