package Problemas;

import java.util.ArrayList;
import java.util.List;

public class ConjuntoEnteros {
    private List<Integer> elementos = new ArrayList<>();

    public ConjuntoEnteros() {
        elementos = new ArrayList<>();
    }

    public ConjuntoEnteros(int... valores) {
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

    public void inserta(int... valores) {
        if (valores != null) {
            for (int v : valores) {
                inserta(v);
            }
        }
    }

    public void borra(int e) {
        elementos.remove(Integer.valueOf(e));
    }

    public boolean pertenece(int e) {
        return elementos.contains(e);
    }

    public ConjuntoEnteros union(ConjuntoEnteros c) {
        ConjuntoEnteros resultado = new ConjuntoEnteros();

        for (int e : elementos) {
            resultado.inserta(e);
        }

        if (c != null) {
            for (int e : c.elementos) {
                resultado.inserta(e);
            }
        }

        return resultado;
    }

    public ConjuntoEnteros interseccion(ConjuntoEnteros c) {
        ConjuntoEnteros resultado = new ConjuntoEnteros();

        if (c != null) {
            for (int e : elementos) {
                if (c.pertenece(e)) {
                    resultado.inserta(e);
                }
            }
        }

        return resultado;
    }

    public ConjuntoEnteros menos(ConjuntoEnteros c) {
        ConjuntoEnteros resultado = new ConjuntoEnteros();

        for (int e : elementos) {
            if (c == null || !c.pertenece(e)) {
                resultado.inserta(e);
            }
        }

        return resultado;
    }

    @Override
    public String toString() {
        String resultado = "[";

        for (int i = 0; i < elementos.size(); i++) {
            resultado += elementos.get(i);
            if (i < elementos.size() - 1) {
                resultado += ", ";
            }
        }

        resultado += "]";
        return resultado;
    }

    public boolean equals(ConjuntoEnteros otro) {
        if (otro == null)
            return false;

        if (this.cardinal() != otro.cardinal())
            return false;

        for (int e : this.elementos) {
            if (!otro.pertenece(e)) {
                return false;
            }
        }

        return true;
    }

}
