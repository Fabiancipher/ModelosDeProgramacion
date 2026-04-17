package Proxy.Modelos;
public class ProxyICM implements Calculador {
    private CalculadoraICM calculadoraICM;

    public ProxyICM() {
        
    }

    @Override
    public double calcular(double peso, double altura) {
        calculadoraICM = new CalculadoraICM();
        if (peso <= 0 || altura <= 0) {
            System.err.println("Los valores deben ser mayores a cero");
            return 0;
        }
        if(altura>100){ // Se asume que está en centímetros
            altura = altura / 100;
        }
        return calculadoraICM.calcular(peso, altura);
    }
}