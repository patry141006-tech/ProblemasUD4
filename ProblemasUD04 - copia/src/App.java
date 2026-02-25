import Problemas.ConjuntoEnteros;

public class App {
    public static void main(String[] args) {
        ConjuntoEnteros c1 = new ConjuntoEnteros(1, 2, 3);
        ConjuntoEnteros c2 = new ConjuntoEnteros(3, 2, 1);

        System.out.println(c1.equals(c2)); // true

        ConjuntoEnteros c3 = new ConjuntoEnteros(1, 2);
        System.out.println(c1.equals(c3)); // false

    }
}
