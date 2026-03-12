package CarrosEjemplos;
public class CarroElectrico extends Carro{
    public CarroElectrico(Motor m, String t, Chasis c){
        motor = m;
        transmision = t;
        chasis = c;
    }

    @Override
    public Carro duplicar(){
        Carro clon = new CarroElectrico(motor, transmision, chasis);
        return clon;
    }
}