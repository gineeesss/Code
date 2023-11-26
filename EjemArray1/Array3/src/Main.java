public class Main {
    public static void main(String[] args) {
        // Declaración e inicialización del array tridimensional
        int[][][] numeros = new int[3][3][3];

        // Inicialización de los valores del array tridimensional
        int num = 1;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                for (int k = 0; k < numeros[i][j].length; k++) {
                    numeros[i][j][k] = num++;
                }
            }
        }

        // Mostrar los valores almacenados en el array tridimensional
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                for (int k = 0; k < numeros[i][j].length; k++) {
                    System.out.print(numeros[i][j][k] + " ");
                }
                System.out.println();  // Nueva línea después de cada fila
            }
            System.out.println();  // Nueva línea después de cada "capa"
        }
    }
}