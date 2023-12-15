package ejercicio;

public class Restaurante {
    //properties
    private int[] ocupacion = new int[10];

    //methods

    public Restaurante() {
        for (int i = 0; i < ocupacion.length; i++) {
            this.ocupacion[i] = (int)(Math.random()*5+0);
        }
    }

    public void MostrarOcupacion(){
        System.out.print("Mesa nº|\t ");
        for (int i=0;i< ocupacion.length;i++){
            System.out.print(i+1 +"\t");
        }
        System.out.println("\n_____________________________________________________");
        System.out.print("\nOcup nº|\t ");
        for (int i=0;i< ocupacion.length;i++){
            System.out.print(ocupacion[i]+"\t");
        }
    }
}
