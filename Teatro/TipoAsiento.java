/**
 * Esta clase representa un flyweight del que dependen las clases que heredan de asiento
 */
package Teatro;

public class TipoAsiento{
    private final String color;
    private final String material;

    public TipoAsiento(String c, String m){
        color = c;
        material = m;
    }

    public String getColor(){
        return color;
    }

    public String getMaterial(){
        return material;
    }
}