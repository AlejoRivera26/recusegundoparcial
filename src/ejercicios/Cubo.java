package ejercicios;

public class Cubo extends FiguraTridimensional{

    //Atributos
    private double lado;

    //Constructores

    public Cubo(double lado) {
        this.lado = lado;
    }

    public Cubo(){
        this.lado = 1;
    }

    //Metodos

    @Override
    public double calcularVolumen() {
        return Math.pow(lado, 3);
    }

    @Override
    public double calcularSuperficie() {
        return 6 * (Math.pow(lado, 2));
    }

    @Override
    public String toString() {
        return "La figura es un Cubo";
    }
}
