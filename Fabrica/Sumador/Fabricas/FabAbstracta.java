package Fabricas;
import Globales.EntradasSalidas.Entrada;
import Globales.EntradasSalidas.Salida;
/**
 * Interfaz que representa la fabrica abstracta, la cual define los métodos para generar entradas y salidas
 */
public interface FabAbstracta{
    Entrada generarEntrada();
    Salida generarSalida();
}