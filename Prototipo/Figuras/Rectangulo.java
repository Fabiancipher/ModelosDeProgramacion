package Figuras;
public class Rectangulo implements Figura{
    int base=0;
    int altura=0;
    String color="";

    public Rectangulo(){

    }

    public void setBase(int b){
        base = b;
    }

    public void setAltura(int a){
        altura = a;
    }

    public void setColor(String c){
        color = c;
    }

    @Override
    public Rectangulo clonar(){
        Rectangulo clon = new Rectangulo();
        
        clon.setAltura(this.altura);
        clon.setBase(this.base);
        clon.setColor(this.color);

        return clon;
    }

    @Override 
    public float getArea(){
        return this.base * this.altura;
    }

    @Override 
    public String toString(){
        return "Rectangulo / Base: "+this.base+" / Altrura: "+this.altura+" / Color: "+this.color;
    }

}