import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Noviembre","Diciembre"};
        int[] temperaturas = new int[12];
        for (int i=0; i< meses.length;i++){
            System.out.println("Introduce temperatura media de "+meses[i]+":");
            temperaturas[i] = scr.nextInt();
        }

        String guion = "=";
        String guiones = guion;

        for (int j = 0; j < meses.length; j++) {
            if (temperaturas[j] >=0){
                for (int i = 1; i < temperaturas[j]; i++) {
                    guiones = guiones + guion;
                }
            }else {
                int a = temperaturas[j]*-1;
                for (int i = 1; i < a; i++) {
                    guiones = guiones + guion;
                }
            }
            if (temperaturas[j] ==0){
                System.out.println(meses[j]+": ");
            } else if (temperaturas[j]<0) {
                System.out.println(meses[j]+": -/"+guiones);
                guiones = guion;
            }else {
                System.out.println(meses[j] + ": " + guiones);
                guiones = guion;
            }
        }
    }
}