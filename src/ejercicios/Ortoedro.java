package ejercicios;

public class Ortoedro extends FiguraTridimensional{

      //Atributos
      private double ancho;
      private double base;
      private double altura;

      //Constructores

    public Ortoedro(double ancho, double base, double altura) {
        this.ancho = ancho;
        this.base = base;
        this.altura = altura;
    }

    public Ortoedro(){
        this.ancho = 1;
        this.base = 1;
        this.altura = 1;
    }

    //Metodos
    @Override
    public double calcularVolumen() {
        return ancho * base * altura;
    }

    @Override
    public double calcularSuperficie() {
        return 2 * (ancho * base) + 2 * (ancho * altura) + 2 * ( base * altura);
    }

    @Override
    public String toString() {
        return "La figura es un Ortoedro";
    }
}
