import Problemas.Racional;

public class App {
    public static void main(String[] args) throws Exception {
        Racional r1 = new Racional(2, 6);
        Racional r2 = new Racional(1, 3);
        Racional suma = r1.suma(r2);
        System.out.printf("La suma de %s + %s = %s\n", r1, r2, suma);
        System.out.println(r1.equals(r2));
    }
}
