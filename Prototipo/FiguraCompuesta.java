package Prototipo;
public class FiguraCompuesta implements Figura{
    private Figura exterior;
    private Figura interior;

    public FiguraCompuesta(Figura i, Figura e){
        exterior = e;
        interior = i;
    }

    public void setExterior(Figura e){
        exterior = e;
    }

    public void setInterior(Figura i){
        interior = i;
    }

    public Figura getInterior(){
        return interior;
    }

    public Figura getExterior(){
        return exterior;
    }

    @Override
    public FiguraCompuesta clonar(){
        FiguraCompuesta clon = new FiguraCompuesta(interior.clonar(), exterior.clonar());
        return clon;
    }

    @Override
    public String toString(){
        return "Exterior: "+exterior.toString()+"\n"+
                "Interior: "+interior.toString()+"\n";
    }
}