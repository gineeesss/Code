import calculadora.Calcu;
import calculadora.Calculadora;
import calculadora.Calculadoraa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Calculadora calc = new Calculadora();
        Calcu calcu= new Calcu();
            Scanner scr = new Scanner(System.in);
            Calcu calc = new Calcu();
            int i, n;
            do {
                System.out.println("-MENU----------\nSumar       [1]\nRestar      [2]\nMultiplicar [3]\nDividir     [4]\nFactorial   [5]\nInicializar [6]");
                i = scr.nextInt();
                switch (i){
                    case 1:
                        n = scr.nextInt();
                        calc.sumar(n);
                        break;
                    case 2:
                        n = scr.nextInt();
                        calc.restar(n);
                        break;
                    case 3:
                        n = scr.nextInt();
                        calc.multiplicar(n);
                        break;
                    case 4:
                        n = scr.nextInt();
                        calc.dividir(n);
                        break;
                    case 5:
                        calc.factorial();
                        break;
                    case 6:
                        calc.inicializar();
                        break;
                }
                System.out.println("Resultado: " + calc);
            } while (i >= 0 && i <= 6);
        }

    }