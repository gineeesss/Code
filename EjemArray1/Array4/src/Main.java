import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String[] paises = {"España   ","Rusia    ","Japón    ","Australia"};
        int[][] medidas = new int [4][10];
        float media;
        int alturamaxima=medidas[0][0];
        int alturaminima=210;
        int sumamedidas = 0;

        String barrabaja = "_";         //bucle para imprimir la primera linea de la tabla
        for (int i = 1; i<113; i++)
            System.out.print(barrabaja);

        //System.out.println("________________________________________________________________________________________________________________");

        System.out.printf("\n|Pais%-7s| Datos%-45s| Altura Media | Altura Máxima | Altura Mínima |\n","","");
        //System.out.printf("|Pais%-7s| Datos%-45s| Altura Media | Altura Máxima | Altura Mínima |\n","","");
        System.out.println("|___________|___________________________________________________|______________|_______________|_______________|");

        // En el mismo bucle creo e impromo la tabla
        for (int j=0; j<4; j++){
            System.out.printf("|%-11s| {",paises[j]);
            for (int i=0;i<10;i++){
                medidas [j][i]=(int)(Math.random()*70f + 140f);
                if (medidas[j][i]==medidas[j][medidas[0].length-1]){
                    System.out.printf("%d}|",medidas[j][i]);         //Esta linea y la siguiente es para darle un formato más bonito a los datos, y necesarias para
                }else System.out.printf("%d, ",medidas[j][i]);       //recoger lo datos entre dos llaves {}.
                sumamedidas = sumamedidas + medidas[j][i];
                if (medidas[j][i] > alturamaxima){
                    alturamaxima = medidas[j][i];
                }
                if (medidas[j][i] < alturaminima){
                    alturaminima = medidas[j][i];
                }
            }
            media = (float)(sumamedidas/(1.0*medidas[0].length));
           //System.out.println(Math.round(media)+"            "+alturamaxima+"            "+alturaminima);
            System.out.printf("%6s%d%6s%9d%7s%9d%7s"+media + "\n"," ",Math.round(media),"|",alturamaxima,"|",alturaminima,"|");
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