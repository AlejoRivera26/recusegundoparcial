package ejercicios;

public class Main {

    public static void main(String[] args) {


        Ortoedro primerOrtoedro = new Ortoedro(3, 4, 5);
        System.out.println(primerOrtoedro.toString());
        System.out.println(primerOrtoedro.calcularVolumen());
        System.out.println(primerOrtoedro.calcularSuperficie());

        TetraedroRegular primerTetraedroRegular = new TetraedroRegular(4);
        System.out.println(primerTetraedroRegular.toString());
        System.out.println(primerTetraedroRegular.calcularVolumen());
        System.out.println(primerTetraedroRegular.calcularSuperficie());

        Cubo primerCubo = new Cubo(5);
        System.out.println(primerCubo.toString());
        System.out.println(primerCubo.calcularVolumen());
        System.out.println(primerCubo.calcularSuperficie());

    }
}
