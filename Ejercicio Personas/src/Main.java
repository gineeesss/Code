import clases.Personas1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Personas1 p1 = new Personas1("Pedro","Pérez","",1998);
        Personas1 p2 = new Personas1("Luis","León","",2009);

        p1.CalcularDNI();
        p1.CambiarNombre();
        System.out.println(p1);

        p2.CalcularDNI();
        p2.CambiarNombre();
        System.out.println(p2);

    }
}