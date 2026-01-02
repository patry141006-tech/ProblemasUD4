package Problemas;

import java.util.ArrayList;
import java.util.List;

public class ConjuntoEnteros {
    private List<Integer> elementos = new ArrayList<>();

    public ConjuntoEnteros() {
        elementos = new ArrayList<>();
    }

    // Array de enteros, pero si hay varios numeros sin tener un array?
    public ConjuntoEnteros(int[] valores) {
        this();

        if (valores != null) {
            for (int v : valores) {
                inserta(v);
            }
        }
    }

    public boolean esVacio() {
        return elementos.isEmpty();
    }

    public int cardinal() {
        return elementos.size();
    }

    public void inserta(int e) {
        if (e > 0 && !elementos.contains(e)) {
            elementos.add(e);
        }
    }

    public void borra(int e) {
        elementos.remove(Integer.valueOf(e));
    }

    public boolean pertenece(int e) {
        return elementos.contains(e);
    }

    @Override
    public String toString() {
        return elementos.toString();
    }

}
