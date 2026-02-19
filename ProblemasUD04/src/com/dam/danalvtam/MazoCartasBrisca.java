package com.dam.danalvtam;

import java.util.ArrayList;
import java.util.List;

public class MazoCartasBrisca {
    private List<CartaBrisca> cartas;
    private int marcaAgua;
    final int tamañoBaraja = 40;

    public MazoCartasBrisca() {
        cartas = new ArrayList<CartaBrisca>();
        int[] cartasInt = new int[] { 1, 2, 3, 4, 5, 6, 7, 10, 11, 12 };
        for (Palo palo : Palo.values()) {
            for (int numCarta : cartasInt) {
                CartaBrisca carta = new CartaBrisca(numCarta, palo);
                cartas.add(carta);
            }
        }
        this.marcaAgua = 39;
    }

    public List<Integer> barajar() {
        List<Integer> arrayBaraja = new ArrayList<>();
        for (int i = 0; i < tamañoBaraja; i++) {
            while (arrayBaraja.size() < tamañoBaraja) {
                int meter = (int) (Math.random() * tamañoBaraja);
                if (!arrayBaraja.contains(meter)) {
                    arrayBaraja.add(meter);
                }
            }
        }
        return arrayBaraja;
    }

    public void barajaBarajada() {
        List<Integer> barajado = barajar();

        for (int bara : barajado) {
            System.out.println(bara);
        }

        ArrayList<CartaBrisca> cartasBarajadas = new ArrayList<>();
        for (int i = 0; i < barajado.size(); i++) {
            cartasBarajadas.add((CartaBrisca) cartas.get(barajado.get(i)));
        }
        cartas = cartasBarajadas;
    }

    public int cuantasQuedan() {
        return marcaAgua - this.tamañoBaraja;
    }

    public CartaBrisca extraerCarta() {
        if (marcaAgua == 0) {
            return null;
        } else {
            CartaBrisca devolver = cartas.get(marcaAgua);
            marcaAgua--;
            return devolver;
        }
    }

    public CartaBrisca getCarta(int i) {
        if (marcaAgua == 0) {
            return null;
        } else {
            CartaBrisca devolver = cartas.get(marcaAgua);
            return devolver;
        }
    }

    public CartaBrisca getMuestra() {
        CartaBrisca devolver = cartas.get(0);
        return devolver;
    }

}
