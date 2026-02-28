package Casa;
public class Casa{
    public Ventana ventana;
    public Puerta puerta;
    public Techo techo;
    
    public Casa(Ventana ventana, Puerta puerta, Techo techo) {
        this.ventana = ventana;
        this.puerta = puerta;
        this.techo = techo;
    }

    public Casa clonar(){
        Casa clon = new Casa(this.ventana, this.puerta, this.techo);
        return clon;
    }

    public void setVentana(Ventana ventana){
        this.ventana = ventana;
    }
    public void setPuerta(Puerta puerta){
        this.puerta = puerta;
    }
    public void setTecho(Techo techo){
        this.techo = techo;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Forma ventana: ").append(this.ventana.forma).append("\n");
        sb.append("Material ventana: ").append(this.ventana.material).append("\n");
        sb.append("Alto puerta: ").append(this.puerta.alto).append("\n");
        sb.append("Ancho puerta: ").append(this.puerta.ancho).append("\n");
        sb.append("Material puerta: ").append(this.puerta.material).append("\n");
        sb.append("Alto techo: ").append(this.techo.alto).append("\n");
        sb.append("Ancho techo: ").append(this.techo.ancho).append("\n");
        sb.append("Material techo: ").append(this.techo.material).append("\n");
        return sb.toString();
    }
}