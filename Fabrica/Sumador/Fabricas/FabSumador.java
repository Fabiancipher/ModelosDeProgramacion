package Fabricas;
import Globales.Operaciones.Operacion;
import Globales.Operaciones.Sumador;
public class FabSumador extends FabOperaciones{
    public FabSumador(){

    }

    @Override
    public Operacion generarOperacion(){
        return new Sumador();
    }
}