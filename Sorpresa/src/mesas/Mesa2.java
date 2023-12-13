/*
* CLASE QUE CREA UN ARRAY CON VALORES ALEATORIOS [0-4]
* SERÁN UTILIZADOS COMO NUMERO DE COMENSALES POR MESA
* */

package mesas;
import java.util.Arrays;
public class Mesa2 {
    int[] comensales=new int[10];

    public Mesa2() {
        for(int a=0;a<comensales.length;a++){
            this.comensales[a] = (int)(Math.random()*5+0);
        }
    }
    public int mesalibre(int per){
        boolean mesalibre = false;
        int mejormesa=0;
        for (int a=1;a<=comensales.length;a++){
            if (comensales[a]==0) {
                return a+1;
            }else if(comensales[a]-per>=0){
               mejormesa=a+1;
            }
        }
        return mejormesa;
    }
    public void ocupar(int per,int mes){
        this.comensales[mes]=this.comensales[mes]+per;
    }

    @Override
    public String toString() {
        return Arrays.toString(comensales);
    }
}
