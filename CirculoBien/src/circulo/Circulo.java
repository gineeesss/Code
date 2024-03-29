package circulo;

import java.util.Scanner;

/*Crea una clase llamada Círculo que permita crear objetos "círculos" a partir de su radio y poder
calcular así la longitud de su circunferencia y el área. Nos gustaría poder saber la cantidad
total de objetos "círculos" que se han creado en cualquier momento así como la información de
cada objeto creado (su radio, su longitud de circunferencia y su área). Además, sería interesante
que pudiéramos calcular el área de un círculo cualquiera sin necesidad de tener que crear un objeto
para ello. Sin embargo, si quisiéramos conocer toda la información, área y longitud de la circunferencia,
 entonces sí deberíamos obligar a crear un objeto para poder acceder a él siempre que lo necesitemos.

Crea luego un programa Principal que te permita usar las características de la clase Círculo recién
creada.*/
public class Circulo {
//PROPERTIES
    private float radio;
    private static int totalCirculos;
//METHODS

    public Circulo(float radio){
        this.radio=radio;
        totalCirculos++;
    }
    public static int getTotalCirculos() {
        return totalCirculos;
    }
    public static float area(float radio){
        return (float)(Math.PI * Math.pow(radio,2));
    }
    public static float circunferencia(float radio){
        return (float)(2*Math.PI*radio);
    }
    public static void mostrarInfo(){
        System.out.println("La cantidad de circulos registrada es: "+ totalCirculos);
        for (int i =0; i<getTotalCirculos();i++) {
            System.out.println("Los datos del círculo nº"+(1+i)+" son:");
            System.out.println("El radio es: " + this.radio);
            System.out.println("La longitud es: " + circunferencia(this.radio));
            System.out.println("El área del círculo es: " + area(radio));
        }
    }

    public static float radioPreguntar(){
        Scanner scr = new Scanner(System.in);
        System.out.println("Introducir radio: ");
        float radio = scr.nextFloat();
        return radio;
    }
}
