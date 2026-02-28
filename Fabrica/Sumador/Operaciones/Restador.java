package Operaciones;
public class Restador extends Operacion{
    public Restador(){

    }

    @Override
    public Integer operar(int a, int b){
        return a-b;
    }
}