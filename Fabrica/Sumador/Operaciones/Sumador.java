package Operaciones;
public class Sumador extends Operacion{
    public Sumador(){

    }

    @Override
    public Integer operar(int a, int b){
        return a+b;
    }
}