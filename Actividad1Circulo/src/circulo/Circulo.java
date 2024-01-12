package circulo;
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
    private float area;
    private float circunferencia;
    private static int totalCirculos;
//METHODS

    public Circulo(float radio){
        this.radio=radio;
        this.area=(float)(Math.PI * Math.pow(radio,2));
        this.circunferencia = (float)(Math.PI * 2 *radio);
        totalCirculos++;
    }
    public Circulo(){
        this.radio=radio;
        this.area=(float)(Math.PI * Math.pow(radio,2));
        this.circunferencia = (float)(Math.PI * 2 *radio);
        totalCirculos++;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", area=" + area +
                ", circunferencia=" + circunferencia +
                ",total circulos}"+ totalCirculos;
    }

    public static int getTotalCirculos() {
        return totalCirculos;
    }
}
