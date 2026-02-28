import Cliente.Cliente;
import Fabricas.*;
public class pruebaFabricaOperaciones {
    static FabAbstracta fabrica;
    static FabOperaciones operador;
    static Cliente cliente;
    public static void main(String[] args) {
        fabrica = new FabConsola();
        operador = new FabSumador();
        cliente = new Cliente(fabrica, operador);

        
        if(!cliente.verificar("¿Desea seguir con la suma?(Si: 1/No: 0): ", 1, 0)){
            return;
        }

        String suma = cliente.operar();

        if(!cliente.verificar("¿Desea seguir con la resta?(Si: 1/No: 0): ", 1, 0)){
            return;
        }

        cliente.setOperador(operador = new FabRestador());
        String resta = cliente.operar();

        if(!cliente.verificar("¿Desea seguir con la multiplicacion?(Si: 1/No: 0):", 1, 0)){
            return;
        }
        
        cliente.setOperador(operador = new FabProducto());
        String producto = cliente.operar();

        cliente.setFabrica(fabrica = new FabArchivo());
        cliente.operarArchivo(suma, resta, producto);

    }

}