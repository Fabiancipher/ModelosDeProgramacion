package Adaptador;
import EntradasSalidas.EntradaConsola;
import EntradasSalidas.SalidaConsola;
import Operaciones.*;
public class PruebaAdaptador{
    static SalidaConsola salida = new SalidaConsola();
    static EntradaConsola entrada = new EntradaConsola();
    static Adaptador adaptador = new Adaptador();
    public static void main(String[] args) {
    	Operacion operacion = new Sumador();
    	
    	Integer suma = operar(operacion);
    	
    	salida.mostrar(suma.toString());
    	
    	Integer resta = operar(operacion= new Restador());
    	
    	salida.mostrar(resta.toString());
    	
    	Integer producto = operar(operacion= new Multiplicador());
    	
    	salida.mostrar(producto.toString());
    	
    }
    static public Integer operar(Operacion operacion) {
    	salida.mostrar("Ingrese dos números a continuación: \n");
    	return operacion.operar(adaptador.convertir(entrada.capturar()),adaptador.convertir(entrada.capturar()));
    }
}