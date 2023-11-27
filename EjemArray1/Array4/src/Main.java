import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String[] paises = {"España   ","Rusia    ","Japón    ","Australia"};
        float[][] medidas = new float [4][10];
        float media = 0;
        float alturamaxima=medidas[0][0];
        float alturaminima=210;
        float sumamedidas = 0;
        System.out.println("Pais       |Altura Media      |Altura Máxima        |Altura Mínima");
        System.out.println("---------------------------------------------------------------");
        for (int j=0; j<4; j++){
            for (int i=0;i<10;i++){
                medidas [j][i]=(float)(Math.random()*70f + 140f);
                sumamedidas = sumamedidas + medidas[j][i];
                if (medidas[j][i] > alturamaxima){
                    alturamaxima = medidas[j][i];
                }
                if (medidas[j][i] < alturaminima){
                    alturaminima = medidas[j][i];
                }
            }
            media = Math.round(sumamedidas/medidas[0].length);
            System.out.println(paises[j] +"      "+ media+"            "+alturamaxima+"            "+alturaminima);
            alturaminima=210;
            alturamaxima =0;

        }


    }
}