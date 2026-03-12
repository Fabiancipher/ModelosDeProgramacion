public abstract class Casa{

    String paredes; int cantidadParedes;
    String techo;
    String puertas; int cantidadPuertas;
    String ventanas; int cantidadParedes;

    public void setParedes(String pared){
        paredes = pared;
    }

    public void setTecho(String techo){
        this.techo = techo;
    }

    public void setPuerta(String puerta){
        puertas = puerta;
    }

    public void setVentanas(String ventana){
        ventanas = ventana;
    }

    public void setCantidadParedes(int cantidad){
        cantidadParedes = cantidad;
    }

    public void setCantidadPuertas(int cantidad){
        cantidadPuertas = cantidad;
    }

    public void setCantidadVentanas(int cantidad){
        cantidadVentanas = cantidad;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Cantidad de paredes: ").append(cantidadParedes).append("\n");
        sb.append("Material Paredes: ").append(paredes).append("\n");
        sb.append("Cantidad de puertas: ").append(cantidadPuertas).append("\n");
        sb.append("Material Puertas: ").append(puertas).append("\n");
        sb.append("Cantidad de ventanas: ").append(cantidadVentanas).append("\n");
        sb.append("Forma Ventanas: ").append(ventanas).append("\n");
        sb.append("Material Techo: ").append(techo).append("\n");
    }

}