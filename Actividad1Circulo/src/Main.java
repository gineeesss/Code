import circulo.Circulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        Circulo circle = new Circulo;
        Circulo[] almacen = new Circulo[5];

        int opcion;
        do {
            menu();
            opcion = scr.nextInt();
            switch (opcion){
                case 1:
                    float radio = scr.nextFloat();
                    almacen[Circulo.getTotalCirculos()] = new Circulo(radio);
                    System.out.println(circle);
                    menu();
                    break;
                case 2:
                    menu();
                    break;
                case 3:
                    for (int i=0;i<Circulo.getTotalCirculos();i++){
                        almacen[i].toString();
                    }
                    menu();
                    break;

            }
        }while (opcion!=5);
    }







    public static void menu(){
        System.out.println("MENU\n" +
                "[1] CONSULTAR DATOS\n" +
                "[2] CONSULTAR AREA\n" +
                "[3] CONSULTAR LONGITUD");
    }
}
