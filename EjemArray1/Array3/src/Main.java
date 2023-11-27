public class Main {
    public static void main(String[] args) {
      int [][]numeros = new int [4][5];
      int a = numeros.length;
      System.out.println(a);
      int sumafilas = 0;
      int sumatotal = 0;

      //bucle para crear la matriz
      for (int i=0; i<4;i++){
          for (int j=0;j<5;j++) {
              numeros[i][j] = (int) (Math.random() * 100 + 1);
          }
      }
      //bucle para imprimir la tabla y la columnas extra con la suma de cada fila
        for (int i=0; i<4;i++){
            for (int j=0;j<5;j++) {
                System.out.print(numeros[i][j]+"  ");
                sumafilas = sumafilas + numeros[i][j];
            }
            System.out.println("| "+sumafilas);
            sumatotal = sumafilas + sumatotal;
            sumafilas = 0;
        }
        System.out.println("-------------------------");

        //bucle para imprimir la fila de las sumas de las columnas y la suma total
        int sumacolumnas = 0;
        for (int w=0;w<5;w++) {
            for (int t = 0; t < 4; t++) {
                sumacolumnas = sumacolumnas + numeros[t][w];
            }
            System.out.print(sumacolumnas+" ");
            sumacolumnas = 0;
        }
        System.out.print("| "+sumatotal);

    }
}