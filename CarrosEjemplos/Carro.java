package CarrosEjemplos;
public abstract class Carro{
    Motor motor;
    String transmision;
    Chasis chasis;

    public Motor getMotor(){
        return motor;
    }
    public String getTransmision(){
        return transmision;
    }
    public Chasis getChasis(){
        return chasis;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        String tipoMotor = motor.isElectrico() ? "Electrico" : "Combustion";

        sb.append("Cilindraje del motor: ").append(motor.cilindraje).append(" || Tipo de Motor: ").append(tipoMotor).append("\n");
        sb.append("Tipo de transmision: ").append(transmision).append("\n");
        sb.append("Tipo de chasis: ").append(chasis.tipo).append(" || Color: ").append(chasis.color).append("\n");

        return sb.toString();
    }

    public abstract Carro duplicar();
}