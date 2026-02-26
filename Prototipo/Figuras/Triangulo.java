package Figuras;
public class Triangulo implements Figura{
    private int base;
    private int altura;
    private String color;

    public Triangulo(){

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
    public Triangulo clonar(){
        Triangulo clon = new Triangulo();
        
        clon.setAltura(this.altura);
        clon.setBase(this.base);
        clon.setColor(this.color);

        return clon;
    }

    @Override
    public float getArea(){
        //Implemente aquí la formula para un triangulo cualquiera
        return 0;
    }

     @Override 
    public String toString(){
        return "Triangulo / Base: "+this.base+" / Altrura: "+this.altura+" / Color: "+this.color;
    }
}