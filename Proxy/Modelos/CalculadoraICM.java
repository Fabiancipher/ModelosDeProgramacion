public class CalculadoraICM implements Calculador {
    public CalculadoraICM() {
        
    }
    @Override
    public double calcular(double peso, double altura) {
        return peso / (altura * altura);
    }

}