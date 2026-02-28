package Cliente;
import EntradasSalidas.Entrada;
import EntradasSalidas.Salida;
import Fabricas.FabAbstracta;
import Fabricas.FabOperaciones;
import Operaciones.Operacion;
/**
 * Esta es una clase que representa un cliente de las fabricas
 * El cliente tiene una entrada, una salida y un operador, los cuales se pueden cambiar a través de las fábricas abstractas y concretas
 */
public class Cliente{
    Entrada entrada;
    Salida salida;
    Operacion operador;

    /**
     * Constructor del cliente, el cual recibe una fabrica abstracta y una fabrica concreta de operaciones para inicializar su entrada, salida y operador
     * @param fabrica
     * @param operador
     */
    public Cliente(FabAbstracta fabrica, FabOperaciones operador){
        entrada = fabrica.generarEntrada();
        salida = fabrica.generarSalida();
        this.operador = operador.generarOperacion();
    }

    public void setOperador(FabOperaciones operador){
        this.operador = operador.generarOperacion();
    }

    public void setFabrica(FabAbstracta fabrica){
        entrada = fabrica.generarEntrada();
        salida = fabrica.generarSalida();
    }

    /**
     * Lleva a cabo la operación. Indica al usuario que ingrese los números a operar y muestra el resultado
     * <p>
     * Para consola
     */
    public String operar(){
        salida.mostrar("Ingrese el primer número: ");
        int numUno = Integer.parseInt(entrada.capturar());
        salida.mostrar("Ingrese el segundo número: ");
        int numDos = Integer.parseInt(entrada.capturar());

        String resultado = operador.operar(numUno, numDos).toString();

        salida.mostrar(resultado);

        return resultado;
    }

    public void operarArchivo(String s, String r, String p){
        String encontrados = "Datos encontrados en el archivo: \n"+entrada.capturar();
        salida.mostrar(
            "Resultado suma: "+s+"\n"+
            "Resultado resta: "+r+"\n"+
            "Resultado producto: "+p+"\n"+
            encontrados
        );
    }

    /**
     * Una verificación binaria con números
     * @param m Mensaje a mostrar
     * @param v Condicion de continuidad
     * @param f Condicion de quiebre
     * @return Si se escogió la condición de verdad o no
     */
    public boolean verificar(String m, int v, int f){
            salida.mostrar(m);
            int dec = Integer.parseInt(entrada.capturar());

            while(dec!=v && dec!=f){
                salida.mostrar("Decision invalida: ");
                dec = Integer.parseInt(entrada.capturar());
            }

            return dec != f;
    }

}