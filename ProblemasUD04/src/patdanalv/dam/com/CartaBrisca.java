package patdanalv.dam.com;

public class CartaBrisca extends Carta implements Comparable<CartaBrisca> {

    public CartaBrisca(int numero, Palo palo) {
        super(numero, palo);
    }

    public int cuantosPuntos() {
        int vari = 0;
        if (this.getNumero() == 1) {
            vari = 11;
        } else if (this.getNumero() == 3) {
            vari = 10;
        } else if (this.getNumero() == 12) {
            vari = 4;
        } else if (this.getNumero() == 11) {
            vari = 3;
        } else if (this.getNumero() == 10) {
            vari = 2;
        }
        return vari;
    }

    public int compareTo(CartaBrisca otra) {
        if (this.getPalo() != (otra.getPalo())) {
            throw new IllegalArgumentException("El palo de las cartas son distintos.");
        }
        return this.getValorJerarquico() - otra.getValorJerarquico();
    }

    private int getValorJerarquico() {
        switch (numero) {
            case 1:
                return 11;
            case 3:
                return 10;
            case 12:
                return 4;
            case 11:
                return 3;
            case 10:
                return 2;
            default:
                return 0;
        }
    }

}
