import mesas.Mesa2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
       /*  int[] numero = new int[10];
        for(int i=0;i< numero.length;i++){
            numero[i]=i;
            Mesa mesa = new Mesa(numero[i]);
        }
        ya no me da tiempo a intentarlo con este
           modelo porque tengo hecho el array de dos diensiones en la clase
           y deberia de hacerlo solo de 1
        */
    Mesa2 mesa2 = new Mesa2();




        System.out.println("BUSCAR MESA LIBRE \nOCUPAR MESA");
        int menu = scr.nextInt();

        switch (menu){
            case 1:
                System.out.println("CUANTAS PERSONAS");
                int numClientes = scr.nextInt();
                System.out.println(mesa2.mesalibre(numClientes));;
            case 2:

                break;

        }
        System.out.println(" ");

        System.out.println(mesa2);








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