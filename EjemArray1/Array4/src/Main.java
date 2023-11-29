import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String[] paises = {"España   ","Rusia    ","Japón    ","Australia"};
        float[][] medidas = new float [4][10];
        float media = 0;
        float alturamaxima=medidas[0][0];
        float alturaminima=210;
        float sumamedidas = 0;
        System.out.println("________________________________________________________________________________________________________________");

        System.out.printf("|Pais%-7s| Datos%-45s| Altura Media | Altura Máxima | Altura Mínima |\n","","");
        System.out.println("|___________|___________________________________________________|______________|_______________|_______________|");
        for (int j=0; j<4; j++){
            System.out.printf("|%-11s| {",paises[j]);
            for (int i=0;i<10;i++){
                medidas [j][i]=(float)(Math.random()*70f + 140f);
                if (medidas[j][i]==medidas[j][medidas[0].length-1]){
                    System.out.printf("%.0f}|",medidas[j][i]);
                }else System.out.printf("%.0f, ",medidas[j][i]);
                sumamedidas = sumamedidas + medidas[j][i];
                if (medidas[j][i] > alturamaxima){
                    alturamaxima = medidas[j][i];
                }
                if (medidas[j][i] < alturaminima){
                    alturaminima = medidas[j][i];
                }
            }
            media = (sumamedidas/medidas[0].length);
           //System.out.println(Math.round(media)+"            "+alturamaxima+"            "+alturaminima);
            System.out.printf("%9s%6s%9.0f%7s%9.0f%7s\n",Math.round(media),"|",alturamaxima,"|",alturaminima,"|");
            //System.out.printf("%-14s %.0f %-14s %.2f %-14s %.2f\n", paises[j], media,"", alturamaxima,"", alturaminima);
           // System.out.println("|--------------------------------------------------------------------------------------------------------------|");

            alturaminima=210;
            alturamaxima =0;
            sumamedidas = 0;
        }
    //    System.out.println("|-----------|---------------------------------------------------|--------------|---------------|---------------|");

        System.out.println("|___________|___________________________________________________|______________|_______________|_______________|");


    }
}