package CarrosEjemplos;
public class CarroDiesel extends Carro{
    public CarroDiesel(Motor m, String t, Chasis c){
        motor = m;
        transmision = t;
        chasis = c;
    }

    @Override
    public Carro duplicar(){
        Carro clon = new CarroDiesel(motor, transmision, chasis);
        return clon;
    }
}