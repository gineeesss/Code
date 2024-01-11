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
        int posicionCuenta;
        // Cuenta cuenta ;
        Cuenta[] cuenta =new Cuenta[10]; //se crea un array del tipo Cuenta, es decir de objeto cuenta, entonces cadda posicion es un objeto


        System.out.println("BIENVENIDO/A AL BANCO CASTELAR");
        System.out.println("[1] NUEVO CLIENTE (SIN saldo)");
        System.out.println("[2] NUEVO CLIENTE (CON saldo)");
        System.out.println("[3] CONSULTAR SALDO");
        System.out.println("[4] INGRESAR DINERO");
        System.out.println("[5] RETIRAR DINERO");
        System.out.println("[6] CONSULTAR MOROSIDAD");
        System.out.println("[9] SALIR");

        /*private static String menu() {
            String menuBanco = ("BIENVENIDO/A AL BANCO CASTELAR" + "\n[1] NUEVO CLIENTE (SIN saldo)\n[2] NUEVO CLIENTE (CON saldo)")
                    "\n[3] CONSULTAR SALDO" +
                    "\n[4] INGRESAR DINERO" +
                    "\n[5] RETIRAR DINERO" +
                    "\n[6] CONSULTAR MOROSIDAD" +
                    "\n[9] SALIR");
            return menuBanco;
        }*/
        do {
            eleccion = scr.nextInt();
            switch (eleccion) {
                case 1: //crear nueva cuenta
                    System.out.println("introduce numero de cuenta");
                    numeroCuenta = scr.nextInt();
                    posicionCuenta = buscarCuenta(numeroCuenta,cuenta);
                    if (posicionCuenta==-1) {
                        System.out.println("Cuenta ya existe");
                    } else {
                        cuenta[Cuenta.getTotalCuentas()] = new Cuenta(numeroCuenta);
                    }
                    break;

                case 2: //cuenta con saldo

                    System.out.println("introduce numero de cuenta");
                    numeroCuenta = scr.nextInt();
                    posicionCuenta = buscarCuenta(numeroCuenta,cuenta);
                    if (posicionCuenta==-1) {
                        System.out.println("Cuenta ya existe");
                    } else{
                        cuenta[Cuenta.getTotalCuentas()] = new Cuenta(numeroCuenta);
                        System.out.println("¿Con cuánto dinero quiere iniciar la cuenta?");
                        saldo = scr.nextFloat();
                        cuenta[numeroCuenta].ingresar(saldo);}
                    break;

                case 3: // consultar saldo de una cuenta
                    /*existecuenta = false;
                    System.out.println("Introduzca el numero de cuenta que quiere consultar");
                    numeroCuenta = scr.nextInt();
                    for (int i=0;i<Cuenta.getTotalCuentas() && !existecuenta;i++){
                        if(numeroCuenta==cuenta[i].getIdentificador()){
                            existecuenta = true;
                            System.out.printf("El saldo de la cuenta %d es %.2f\n", cuenta[i].getIdentificador(), cuenta[i].getSaldo());
                        }
                    } if (!existecuenta) System.out.println("Lo sentimos pero esa cueta no existe");
                    break;*/
                    System.out.println("Introduce el numero de cuenta que quiere consultar");
                    numeroCuenta= scr.nextInt();
                    posicionCuenta= buscarCuenta(numeroCuenta, cuenta);
                    if (posicionCuenta==-1) {
                        System.out.println("Cuenta ya existe");

                    } else {
                        cuenta[Cuenta.getTotalCuentas()] = new Cuenta(numeroCuenta);
                        System.out.printf("El saldo de la cuenta %d es %.2f", cuenta[posicionCuenta].getIdentificador(), cuenta[posicionCuenta].getSaldo());
                    }
                    break;
                case 4:
                    /*existecuenta = false;
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
                    break;*/
                    posicionCuenta=preguntarCuenta();
                    buscarCuenta(posicionCuenta, cuenta);
                    if (posicionCuenta==-1) {
                        System.out.println("Cuenta NO existe");

                    } else {
                        System.out.println("Cuánto dinero quiere ingresar en la cuenta");
                        cuenta[posicionCuenta].ingresar(scr.nextFloat());
                    }

                    break;
                case 5:
                    /*existecuenta = false;
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
                    break;*/
                    posicionCuenta=preguntarCuenta();
                    buscarCuenta(posicionCuenta, cuenta);
                    if (posicionCuenta==-1) {
                        System.out.println("Cuenta NO existe");
                    } else {
                        System.out.println("Cuánto dinero quiere retirar en la cuenta");
                        cuenta[posicionCuenta].retirar(scr.nextFloat());
                    }
                case 6:
                    /*existecuenta = false;
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
                    break;*/
                    posicionCuenta=preguntarCuenta();
                    buscarCuenta(posicionCuenta, cuenta);
                    if (posicionCuenta==-1) {
                        System.out.println("Cuenta NO existe");
                    } else {
                        cuenta[posicionCuenta].esMorosa();
                    }
                case 7:
                    System.out.printf("En nuestro  banco hayun total de %d cuentas\n", Cuenta.getTotalCuentas());
                    System.out.printf("El dinero total que hay en el banco es %.2f €\n", Cuenta.getTotalSaldo());
                    break;
            }
        }while(eleccion != 9);
    }

    private static int buscarCuenta(int numeroCuenta, Cuenta[] cuenta){ //se recibe el numero de cucenta a buscar y el array donde están todas las cuentas
    //boolean existecuenta = false;
        for (int i=0;i<Cuenta.getTotalCuentas() /*&& !existecuenta*/;i++){
            if(numeroCuenta==cuenta[i].getIdentificador()){
                //existecuenta = true;
                return i; //devuelva la posicion de la cuenta en el array, no el numero de la cuenta
            }
        }
        return -1;
    }

    private static int preguntarCuenta(){
        Scanner scr = new Scanner(System.in);
        System.out.println("Introduzca el número de cuenta");
        int numeroCuenta = scr.nextInt();
        return numeroCuenta;
    }
}
