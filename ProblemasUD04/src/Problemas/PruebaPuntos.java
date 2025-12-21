package Problemas;

public class PruebaPuntos {
    public static void main(String[] args) {

        Punto2D p1 = new Punto2D(3, 2);
        Punto2D p2 = new Punto2D(1, -1);
        Punto2D p3 = p1.suma(p2);

        p2.setX(p1.getX());
        p2.setY(p1.getY());

        System.out.println(
                p1 + " es igual a " + p2 + "? " + p1.equals(p2));
    }
}
