package com.dam.danalvtam;

import java.util.Random;

public class PartidaBrisca extends MazoCartasBrisca {
    JugadorBrisca jugador1 = new JugadorBrisca(true);
    JugadorBrisca jugador2 = new JugadorBrisca(false);

    // static int turno = 0;

    public int primerTurno() {
        Random random = new Random();
        int numero = random.nextInt(2);
        return numero;
    }

    public void main(String[] args) {
        if (primerTurno() == 0) {
            System.out.print("Empieza Jugador 1");
        } else if (primerTurno() == 1) {
            System.out.println("Empieza Jugador 2");
        }

    }

    public boolean ganaPrimera(CartaBrisca primera, CartaBrisca segunda) {
        if (primera.getPalo() == segunda.getPalo()) {
            return primera.compareTo(segunda) > 0;
        }
        if (primera.getPalo() == cartas.get(0).getPalo() &&
                segunda.getPalo() != cartas.get(0).getPalo()) {
            return true;
        }

        if (segunda.getPalo() == cartas.get(0).getPalo() &&
                primera.getPalo() != cartas.get(0).getPalo()) {
            return false;
        }

        return true;

    }
}
