import mesas.Mesa;

public class Main {
    public static void main(String[] args) {
        int[] numero = new int[10];
        for(int i=0;i< numero.length;i++){
            numero[i]=i;
            Mesa mesa = new Mesa(numero[i]);
        }
        /* ya no me da tiempo a intentarlo con este
           modelo porque tengo hecho el array de dos diensiones en la clase
           y deberia de hacerlo solo de 1
        */










       /* int[][] mesas= new int[2][10]; //la primera dimension(derecha) es  la cantidad de mesas, está en dos dimensiones, el numero y la cantidad de comensales
        for(int j=0;j<mesas.length;j++) {
            for (int i = 0; i < mesas[0].length; i++) {
                if(j==0){
                    mesas[j][i] = i;
                }else mesas[j][i] = (int)(Math.random()*5+0);
            }
        }

        for (int[] b:mesas){
            for (int a: b){
                System.out.print(a + " ");
            }
            System.out.println("");
        }*/
    }
}