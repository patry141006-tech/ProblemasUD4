package Problemas.EjerciciosTema5.Interfaces;

public class Prueba {

    public static void main(String[] args) {
        I1 cargaCamion = (kg) -> {
            System.out.println("Se han cargado " + kg + " kg");
        };

        cargaCamion.carga(500);
        System.out.println("¿Cabe mas? " + cargaCamion.cabeMas());

        I2 maximo = (n1, n2) -> n1 > n2 ? n1 : n2;

        System.out.println("Maximo: " + maximo.maximo(10, 20));
        System.out.println("toString(): " + maximo.toString());
    }

}
