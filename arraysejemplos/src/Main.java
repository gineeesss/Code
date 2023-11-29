import java.util.random.*;
public class Main {
    public static void main(String[] args) {
        int [] enteros = new int[5];
        char [] letras = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
        String[] dias = {"Lunes","Martes","Miercoles"};
        String [][] paz = {{"enero","febrero","marzo"},{"abril","mayo","junio"}};
        for(int i = 0; i<5;i++){
            enteros[i]=(int)(Math.random()*14+1);
        }
        for(int i = 0; i< enteros.length;i++) {
            System.out.println(enteros[i]);
        }
        for (char letra: letras){
            System.out.print(letra+" ");
        }
        RandomGenerator g = RandomGenerator.of("Random");
        System.out.println(g);
        System.out.println(paz[0][2]);


        int [][][][]universo = new int[1][2][3][4];
        for (int t=0;t< universo.length;t++){
            for (int w=0;w< universo[0].length;w++){
                for (int j=0;j<universo[0].length;j++){
                    for (int i=0;i<universo[0][0][0].length;i++){
                        universo[t][w][j][i]= (int)Math.random()*50+60;
                    }
                }
            }
        }
        for (int[][][] a:universo){
            for (int[][] b:a){
                for (int[] c:b){
                    for (int d:c){
                        System.out.println(d + " ");
                    }
                }
            }
        }
    }

}