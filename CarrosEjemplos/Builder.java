package CarrosEjemplos;
public abstract class Builder{
    Motor motor;
    String transmision;
    Chasis chasis;

    public abstract void asignarMotor(int cc);
    public void asignarTransmision(String trans){
        transmision = trans;
    }
    public void asignarChasis(String tipo, String color){
        chasis = new Chasis(color, tipo);
    }
    public abstract Carro getCarro();
}