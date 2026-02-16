package patdanalv.dam.com;

public class CartaBrisca extends Carta implements Comparable<CartaBrisca> {
    private int puntos;

    public CartaBrisca(int numero, Palo palo, int puntos) {
        super(numero, palo);
        this.puntos = puntos;
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
                return 10;
            case 3:
                return 9;
            case 12:
                return 8;
            case 11:
                return 7;
            case 10:
                return 6;
            case 7:
                return 5;
            case 6:
                return 4;
            case 5:
                return 3;
            case 4:
                return 2;
            case 2:
                return 1;
            default:
                throw new IllegalArgumentException("Número de carta inválido");
        }
    }

    public int getPuntos() {
        return puntos;
    }
}
