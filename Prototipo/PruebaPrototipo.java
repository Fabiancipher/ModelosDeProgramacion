package Prototipo;
import EntradasSalidas.Salida;
import EntradasSalidas.SalidaConsola;
public class PruebaPrototipo{
    static Salida salida = new SalidaConsola();

    public static void main(String[] args) {
        salida.mostrar("Instancias originales: \n");
        //Generamos un rectangulo y un clon
        Rectangulo rectangulo = new Rectangulo();
            rectangulo.setBase(10);
            rectangulo.setAltura(10);
            rectangulo.setColor("Rojo");
        Rectangulo clonRectangulo = rectangulo.clonar();

        //Mostramos ambos rectangulos
        salida.mostrar("Original: "+rectangulo.toString()+"\n");
        salida.mostrar("Clon: "+clonRectangulo.toString()+"\n");

        //Repetimos para el triángulo y la figura compuesta
        Triangulo triangulo = new Triangulo();
            triangulo.setBase(10);
            triangulo.setAltura(10);
            triangulo.setColor("Azul");
        Triangulo clonTriangulo = triangulo.clonar();

        salida.mostrar("Original: "+triangulo.toString()+"\n");
        salida.mostrar("Clon: "+clonTriangulo.toString()+"\n");

        FiguraCompuesta compuesta = new FiguraCompuesta(rectangulo, triangulo);
        FiguraCompuesta clonCompuesta = compuesta.clonar();

        salida.mostrar("Original: \n"+compuesta.toString()+"\n");
        salida.mostrar("Clon: \n"+clonCompuesta.toString()+"\n");

        //Prueba independencia
        salida.mostrar("Modificando clon: \n");

        //Modificamos clones
        clonRectangulo.setAltura(34);
        clonTriangulo.setBase(45);
        clonCompuesta.setInterior(clonTriangulo);
        
        //Volvemos a mostrar para comprobar que las instancias son independientes
        salida.mostrar("Original: "+rectangulo.toString()+"\n");
        salida.mostrar("Clon(Modificado): "+clonRectangulo.toString()+"\n");

        salida.mostrar("Original: "+triangulo.toString()+"\n");
        salida.mostrar("Clon(Modificado): "+clonTriangulo.toString()+"\n");

        salida.mostrar("Original: \n"+compuesta.toString()+"\n");
        salida.mostrar("Clon(Modificado): \n"+clonCompuesta.toString()+"\n");

        //Prueba copias
        salida.mostrar("Creando copias: ");
        
        //Asignamos a otras variables
        Rectangulo copiaRectangulo = rectangulo;
        Triangulo copiaTriangulo = triangulo;
        FiguraCompuesta copiaCompuesta = compuesta;

        salida.mostrar("Original: "+rectangulo.toString()+"\n");
        salida.mostrar("Copia: "+copiaRectangulo.toString()+"\n");
        salida.mostrar("Original: "+triangulo.toString()+"\n");
        salida.mostrar("Copia: "+copiaTriangulo.toString()+"\n");
        salida.mostrar("Original: \n"+compuesta.toString()+"\n");
        salida.mostrar("Copia: \n"+copiaCompuesta.toString()+"\n");

        //Modificamos las originales

        rectangulo.setAltura(1000);
        triangulo.setBase(9000);
        compuesta.setInterior(clonTriangulo);

        salida.mostrar("Tras modificar las originales: ");

        salida.mostrar("Original: "+rectangulo.toString()+"\n");
        salida.mostrar("Copia: "+copiaRectangulo.toString()+"\n");
        salida.mostrar("Original: "+triangulo.toString()+"\n");
        salida.mostrar("Copia: "+copiaTriangulo.toString()+"\n");
        salida.mostrar("Original: \n"+compuesta.toString()+"\n");
        salida.mostrar("Copia: \n"+copiaCompuesta.toString()+"\n");



    }
}