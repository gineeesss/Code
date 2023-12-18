import banco.Cuenta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        float[][] vector = new float[2][10];
        Cuenta cuenta ;
        for (int i = 0; i<2;i++){
            for (int j = 0; j<10; j++){
                cuenta+j+i = vector[i][j];
            }
        }

        Cuenta cuentaSa;

        System.out.println("BIENVENIDO/A AL BANCO CASTELAR");
        System.out.println("[0] NUEVO CLIENTE (crear nueva cuenta)");
        System.out.println("[1] CONSULTAR SALDO");
        System.out.println("[2] INGRESAR DINERO");
        System.out.println("[4] RETIRAR DINERO");
        System.out.println("[5] CONSULTAR MOROSIDAD");
        System.out.println("[6] SALIR");
        int eleccion = scr.nextInt();

        int numeroCuenta = scr.nextInt();
        switch (eleccion){
            case 0: //crear nueva cuenta
                cuenta = new Cuenta(numeroCuenta);

            case 1: //cuenta con saldo
                float saldo = scr.nextFloat();
                cuentaSa = new Cuenta(numeroCuenta, saldo)

        }









    }
}
