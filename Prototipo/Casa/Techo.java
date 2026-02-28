package Casa;
public class Techo{
    public String material;
    public float alto;
    public float ancho;

    public Techo(String m, float a, float an){
        material = m;
        alto = a;
        ancho = an;
    }

    public void setMaterial(String material){
        this.material = material;
    }
    public void setAlto(float alto){
        this.alto = alto;
    }
    public void setAncho(float ancho){
        this.ancho = ancho;
    }
}