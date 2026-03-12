package CarrosEjemplos;
public class Motor{
    int cilindraje;
    private final boolean esElectrico;

    public Motor(int cc, boolean electrico){
        cilindraje = cc;
        esElectrico = electrico;
    }

    public void setCilindraje(int cc){
        cilindraje = cc;
    }
    public boolean isElectrico(){
        return esElectrico;
    }

}