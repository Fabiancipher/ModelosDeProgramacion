package Operaciones;
public class Multiplicador extends Sumador{
    Sumador sum;
    Restador res;
    public Multiplicador(){
        sum = new Sumador();
        res = new Restador();
    }

    @Override
    public Integer operar(int a, int b){
        boolean negativo=false;

        if(a==0||b==0){
            return 0;
        }
        if(b<0 ^ a<0){
            negativo=true;
        }

        a = Math.abs(a);
        b = Math.abs(b);

        int acum=0;
        for(int i=0; i<b; i++){
            acum= sum.operar(acum, a);
        }
        if(negativo){
            int complemento=0;
            while(true){
                if(sum.operar(acum, complemento)==0){
                    break;
                }
                complemento = res.operar(complemento, 1);
            }
            acum = complemento;
        }

        return acum;
    }
}