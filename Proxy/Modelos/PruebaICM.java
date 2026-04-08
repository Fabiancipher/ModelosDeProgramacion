public class PruebaICM{
    public static void main(String[] args) {
        ProxyICM proxyICM = new ProxyICM();
        
        double icm = proxyICM.calcular(0, 1.77);
        System.out.println("El ICM es: " + icm);
        icm= proxyICM.calcular(77, 177);
        System.out.println("El ICM es: " + icm);
        icm= proxyICM.calcular(77, 1.77);
        System.out.println("El ICM es: " + icm);
    }
}