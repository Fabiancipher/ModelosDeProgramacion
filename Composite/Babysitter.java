package Composite;

import java.util.ArrayList;

public class Babysitter extends Vehiculo{
    ArrayList<Vehiculo> hijos = new ArrayList<>();

    public Babysitter(int m){
        masa = m;
    }

    @Override
    public void montar(Vehiculo hijo){
        hijos.add(hijo);
    }

    @Override
    public void desmontar(Vehiculo hijo){
        hijos.remove(hijo);
    }

    public ArrayList<Vehiculo> getHijos(){
        return hijos;
    }

    @Override
    public double getPeso(){
        for(Vehiculo hijo: hijos){
            if(hijo==null){
                continue;
            }
            this.masa += hijo.masa;
        }
        return this.masa*9.8;
    }
}
    