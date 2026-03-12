package CarrosEjemplos;
public class BuilderDiesel extends Builder{

   public BuilderDiesel(){

   }

   @Override
   public void asignarMotor(int cc){
        motor = new Motor(cc, false);
   }

   @Override
   public Carro getCarro(){
        return new CarroDiesel(motor, transmision, chasis);
   }

    
}