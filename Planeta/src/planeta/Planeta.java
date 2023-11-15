package planeta;

public class Planeta {
    private String nombre;
    private String cantidadSatelites;
    private double masa;
    private double volumen;
    private int diametro;
    private int distanciaSol;
    private enum tipoPlaneta{ENANO, TERRESTRE, GASEOSO}
    public Planeta(String  nombre, int satelites, double masa, double volummen, int diametro, int distancia){
    }

    @Override
    public String toString() {
        return "Planeta{" +
                "nombre='" + nombre + '\'' +
                ", cantidadSatelites='" + cantidadSatelites + '\'' +
                ", masa=" + masa +
                ", diametro=" + diametro +
                ", distanciaSol=" + distanciaSol +
                '}';
    }

    public double calcularDensidad(){
        double densidad = this.masa/this.volumen;
        return densidad;
    }
    public boolean esEsterior(){
        boolean exterior;

        return exterior;
    }
}
