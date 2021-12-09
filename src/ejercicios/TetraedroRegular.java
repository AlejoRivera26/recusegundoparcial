package ejercicios;

public class TetraedroRegular extends FiguraTridimensional{

    //Atributos
    private double arista;

    //Constructor
    public TetraedroRegular(double arista) {
        this.arista = arista;
    }

    public TetraedroRegular(){
        this.arista = 1;
    }

    //Metodos
    @Override
    public double calcularVolumen() {
        return (Math.sqrt(2)) * (Math.pow(arista, 3)) / 12;
    }

    @Override
    public double calcularSuperficie() {
        return (Math.sqrt(3)) * (Math.pow(arista, 2));
    }

    @Override
    public String toString() {
        return "La figura es un Tetraedro Regular";
    }
}
