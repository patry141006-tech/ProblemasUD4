package patdanalv.dam.com;

public class Prueba {

    public static void main(String[] args) {
        CartaBrisca c1 = new CartaBrisca(1, Palo.BASTOS);
        CartaBrisca c2 = new CartaBrisca(11, Palo.BASTOS);

        System.out.println(c1.compareTo(c2));
        System.out.println(c2.compareTo(c1));

        MazoCartasBrisca mazo = new MazoCartasBrisca();
        /*
         * for (CartaBrisca c : mazo.getCartas(0)) {
         * System.out.println(c.toString());
         * }
         * System.out.println("ORDENADAS");
         * System.out.println(mazo.getCartas(0).size());
         * mazo.barajaBarajada();
         * for (CartaBrisca c : mazo.getCartas(0)) {
         * System.out.println(c.toString());
         * }
         * System.out.println(mazo.getCartas.size()));
         */
    }
}
