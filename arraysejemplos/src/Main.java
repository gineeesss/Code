public class Main {
    public static void main(String[] args) {
        int [] enteros = new int[5];
        char [] letras = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
        String[] dias = {"Lunes","Martes","Miercoles"};
        for(int i = 0; i<5;i++){
            enteros[i]=(int)(Math.random()*14+1);
        }
        for(int i = 0; i< enteros.length;i++) {
            System.out.println(enteros[i]);
        }
        for (char letra: letras){
            System.out.print(letra+" ");
        }
    }
}