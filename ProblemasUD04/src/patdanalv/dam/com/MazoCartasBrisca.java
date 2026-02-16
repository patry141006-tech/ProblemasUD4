package patdanalv.dam.com;

import java.util.ArrayList;
import java.util.List;

public class MazoCartasBrisca {
    private List<CartaBrisca> cartas;
    private int marcaAgua;

    public MazoCartasBrisca() {
        cartas = new ArrayList<>();
    }

    public void agregarCarta(CartaBrisca carta) {
        if (cartas.size() < 40) {
            cartas.add(carta);
        }
    }

    public CartaBrisca dameCarta() {
        return null;
    }

}
