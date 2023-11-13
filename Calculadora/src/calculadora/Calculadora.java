package calculadora;

import java.util.Scanner;

public class Calculadora {
    private int n;
    private int calculo;

   public Calculadora(){
       Scanner scr = new Scanner(System.in);
       System.out.println("Introduce Número con el que desea realizar cálculos");
       int n = scr.nextInt();
       System.out.println("-MENÚ----------\n\nSumar       [1]\nRestar      [2]\nMultiplicar [3]\nDividir     [4]\nFactorial   [5]\nInicializar [6]\nFin         [7]");
       int i = scr.nextInt();
       switch (i){
           case 1:
               Sumar();
               break;
           case 2:
               break;
           case 3:
               break;
           case 4:
               break;
           case 5:
               break;
           case 6:
               break;
           case 7:
               break;
       }

   }
    public int Sumar(){
    return n;
    }
    public int Restar(){
        return n;
    }
    public int Multiplicar(){
        return n;
    }
    public int Dividir(){
        return n;
    }
    public int Factorial(){
        return n;
    }
    public int Iniccializar(){
        return n;
    }

}
