package patdanalv.dam.com;

public class Carta {
    protected int numero;
    private Palo palo;

    public Carta(int numero, Palo palo) {
        if (numero < 1 && numero > 12) {
            throw new IllegalArgumentException("El numero de la carta es erroneo");
        }
        if (palo == null) {
            throw new IllegalArgumentException("El palo es incorrecto");
        }

        this.numero = numero;
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public Palo getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        if (numero == 1) {
            return "{ AS de " + palo + " }";
        } else if (numero == 10) {
            return "{ SOTA de " + palo + " }";
        } else if (numero == 11) {
            return "{ CABALLO de " + palo + " }";
        } else if (numero == 12) {
            return "{ REY de " + palo + " }";
        } else {
            return "{ " + numero + " de " + palo + "}";
        }
    }

    /*
     * public void dibujar(int x, int y){
     * setcursor(x, y++);
     * texto(NEGRO);
     * fondo(BLANCO);
     * System.out.print("┌──────┐");
     * setcursor(x, y++);
     * System.out.printf("│%2d │", numero);
     * switch(palo){
     * case Palo.ESPADAS: ... break;
     * }
     * setcursor(x, y++);
     * System.out.print("└──────┘");
     * }
     * }
     */
    public void print(int x, int y) {

    }

    public void printReverso(int x, int y) {

    }

}