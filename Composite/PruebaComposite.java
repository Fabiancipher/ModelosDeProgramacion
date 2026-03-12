package Composite;
public class PruebaComposite{
    public static void main(String[] args) {
        Babysitter compuesto = new Babysitter(100);
        Carro carroUno = new Carro(50);
        Carro carroDos = new Carro(70);
        compuesto.montar(carroUno);

        System.out.println(compuesto.getPeso());

        Babysitter compuestoDos = new Babysitter(100);
        compuesto.montar(compuestoDos);

        compuestoDos.montar(carroDos);
        
        System.out.println(compuestoDos.getPeso());

        System.out.println(compuesto.getPeso());
    }
}