import banco.Cuenta;

import java.util.Scanner;


// registrar las cuentas en un array

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int eleccion;
        //int contador = 0; // cuenta el numero de cuentas que hay creadas  (contaba)
//        boolean existecuenta;
        int numeroCuenta;
        float saldo;
        // Cuenta cuenta ;
        Cuenta[] cuenta =new Cuenta[10];


        System.out.println("BIENVENIDO/A AL BANCO CASTELAR");
        System.out.println("[1] NUEVO CLIENTE (SIN saldo)");
        System.out.println("[2] NUEVO CLIENTE (CON saldo)");
        System.out.println("[3] CONSULTAR SALDO");
        System.out.println("[4] INGRESAR DINERO");
        System.out.println("[5] RETIRAR DINERO");
        System.out.println("[6] CONSULTAR MOROSIDAD");
        System.out.println("[9] SALIR");

        do {
            eleccion = scr.nextInt();
            switch (eleccion) {
                case 1: //crear nueva cuenta
                    System.out.println("introduce numero de cuenta");
                 //   existecuenta = false;
                    numeroCuenta = scr.nextInt();
                    /*for (int i=0;i<Cuenta.getTotalCuentas() && !existecuenta;i++){
                        if(numeroCuenta==cuenta[i].getIdentificador()){
                            existecuenta = true;
                            System.out.println("Ese numero de cuenta ya existe");
                        }*/
                    buscarCuenta(numeroCuenta,cuenta);
                    } if (!existecuenta) {
                        cuenta[Cuenta.getTotalCuentas()] = new Cuenta(numeroCuenta);
                    }
                    break;

                case 2: //cuenta con saldo
                    existecuenta = false;
                    System.out.println("Introduce el numero de la cuenta (3 cifras):");
                    numeroCuenta = scr.nextInt();
                    for (int i=0;i<Cuenta.getTotalCuentas() && !existecuenta;i++){
                        if(numeroCuenta==cuenta[i].getIdentificador()){
                            existecuenta = true;
                            System.out.println("Ese numero de cuenta ya existe");
                        }
                    } if (!existecuenta) {
                        System.out.println("¿Con cuánto dinero vas a abrir la cuenta?");
                        saldo = scr.nextFloat();
                        cuenta[Cuenta.getTotalCuentas()] = new Cuenta(numeroCuenta, saldo);
                    }
                    break;

                case 3: // consultar saldo de una cuenta
                    existecuenta = false;
                    System.out.println("Introduzca el numero de cuenta que quiere consultar");
                    numeroCuenta = scr.nextInt();
                    for (int i=0;i<Cuenta.getTotalCuentas() && !existecuenta;i++){
                        if(numeroCuenta==cuenta[i].getIdentificador()){
                            existecuenta = true;
                            System.out.printf("El saldo de la cuenta %d es %.2f\n", cuenta[i].getIdentificador(), cuenta[i].getSaldo());
                        }
                    } if (!existecuenta) System.out.println("Lo sentimos pero esa cueta no existe");
                    break;
                case 4:
                    existecuenta = false;
                    System.out.println("Introduzca el numero de cuenta en la que quiere ingresar dinero");
                    numeroCuenta = scr.nextInt();
                    for (int i=0;i<Cuenta.getTotalCuentas() && !existecuenta;i++){
                        if(numeroCuenta==cuenta[i].getIdentificador()){
                            existecuenta = true;
                            System.out.println("¿Cuánto dinero quiere ingresar en la cuenta?");
                            saldo = cuenta[i].ingresar(scr.nextFloat());
                            System.out.printf("El nuevo saldo de la cuenta es %.2f\n",saldo); // cuenta[i].getSaldo()  si se usase el getter, sería redundante guardar el valor anterior en una variable (saldo)
                        }
                    } if (!existecuenta) System.out.println("Lo sentimos pero esa cueta no existe");
                    break;
                case 5:
                    existecuenta = false;
                    System.out.println("Introduzca el numero de cuenta en la que quiere retirar");
                    numeroCuenta = scr.nextInt();
                    for (int i=0;i<Cuenta.getTotalCuentas() && !existecuenta;i++){
                        if(numeroCuenta==cuenta[i].getIdentificador()){
                            existecuenta = true;
                            System.out.println("¿Cuánto dinero quiere retirar en la cuenta?");
                            saldo = cuenta[i].retirar(scr.nextFloat());
                            System.out.printf("El nuevo saldo de la cuenta es %.2f\n",saldo); // cuenta[i].getSaldo()  si se usase el getter, sería redundante guardar el valor anterior en una variable (saldo)
                        }
                    } if (!existecuenta) System.out.println("Lo sentimos pero esa cueta no existe");
                    break;
                case 6:
                    existecuenta = false;
                    System.out.println("Introduzca el numero de cuenta para comprobar");
                    numeroCuenta = scr.nextInt();
                    for (int i=0;i<Cuenta.getTotalCuentas() && !existecuenta;i++){
                        if(numeroCuenta==cuenta[i].getIdentificador()){
                            existecuenta = true;
                            if(cuenta[i].esMorosa()){
                                System.out.println("Esta cuenta SI es morosa" + cuenta[i].getSaldo());
                            }else System.out.println("Esta cuenta NO es morosa" + cuenta[i].getSaldo());
                        }
                    } if (!existecuenta) System.out.println("Lo sentimos pero esa cueta no existe");
                    break;
                case 7:
                    System.out.printf("En nuestro  banco hayun total de %d cuentas\n", Cuenta.getTotalCuentas());
                    System.out.printf("El dinero total que hay en el banco es %.2f €\n", Cuenta.getTotalSaldo());
                    break;
            }
        }while(eleccion != 9);
    }
    private static void buscarCuenta(int numeroCuenta, Cuenta[] cuenta){
    boolean existecuenta = false;
        for (int i=0;i<Cuenta.getTotalCuentas() && !existecuenta;i++){
            if(numeroCuenta==cuenta[i].getIdentificador()){
                existecuenta = true;
                System.out.println("Ese numero de cuenta ya existe, introduce una nueva");
            }
        }
    }
}
