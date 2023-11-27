public class Main {
    public static void main(String[] args) {
      int [][]numeros = new int [4][5];
      int a = numeros.length;
        System.out.println(a);
        int sumafilas = 0;
      for (int i=0; i<4;i++){
          for (int j=0;j<5;j++) {
              numeros[i][j] = (int) (Math.random() * 100 + 1);
          }
      }
        for (int i=0; i<4;i++){
            for (int j=0;j<5;j++) {
                System.out.print(numeros[i][j]+" ");
                sumafilas = sumafilas + numeros[i][j];
            }
            System.out.println("| "+sumafilas);
            sumafilas = 0;
            System.out.println("b");
        }
    }
}