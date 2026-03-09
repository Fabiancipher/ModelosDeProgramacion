package Singleton;
public class PruebaSingleton{
    static BaseDatos bd;
    public static void main(String[] args) {
        Empleado tecnico = new Empleado("Tecnico");

        solicitarInstancia(tecnico, 20);

        System.out.println(bd);

        Empleado admin = new Empleado("Admin");

        solicitarInstancia(admin, 20000000);

        System.out.println(bd);

        Empleado conserje = new Empleado("Conserje");

        solicitarInstancia(conserje, 34500);

        System.out.println(bd);
        
    }
    static public void solicitarInstancia(Empleado e, int inicial){
        if(e.tieneAcceso()){
            bd = BaseDatos.obtenerInstancia(inicial);
        }
        else{
            System.err.println("No posee acceso");
        }
    }
}