package CarrosEjemplos;
public class BuilderElectrico extends Builder{

   public BuilderElectrico(){

   }

   @Override
   public void asignarMotor(int cc){
      motor = new Motor(cc, true);
   }

   @Override
   public Carro getCarro(){
        return new CarroElectrico(motor, transmision, chasis);
   }
    
}