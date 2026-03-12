package CarrosEjemplos;
public class Director{
    Builder constructor;

    public Director(Builder c){
        constructor = c;
    }

    public void setBuilder(Builder b){
        constructor = b;
    }

    public void construirCamioneta(){
        constructor.asignarMotor(300);
        constructor.asignarTransmision("Manual");
        constructor.asignarChasis("SUV", "Verde");
    }

    public void construirDeportivo(){
        constructor.asignarMotor(500);
        constructor.asignarTransmision("Automatica");
        constructor.asignarChasis("Convertible", "Rojo");
    }
}