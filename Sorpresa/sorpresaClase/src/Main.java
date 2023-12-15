import ejercicio.Restaurante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Restaurante pomodoro = new Restaurante();
        int clientes=scr.nextInt();

        do{
            pomodoro.MostrarOcupacion();
            System.out.println("\n¿Cuántos venis a comer? Escribe -1 para terminar el programa");
            if (clientes==-1){
                System.out.println("\nGracias por su visita.");
            }

            if (clientes>4) System.out.println("\nLo siento no hay mesas para más de 4 personas");

        }while (clientes!=-1);
    }
}