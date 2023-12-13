/*package mesas;
public class Mesa {
    //propiedades
     int[][] mesas = new int[2][10];
    //metodos
    public Mesa(int[][] mesas) { //construye las mesas con cada numero (1-10) y comensales aleatorios(0-5)
        for(int j=0;j < mesas.length; j++) {
            for (int i = 0; i < mesas[0].length; i++) {
                if(j==0){
                    this.mesas[j][i] = i;
                }else this.mesas[j][i] = (int)(Math.random()*5+0);
            }
         }
    }
}
*/