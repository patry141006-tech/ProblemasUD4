package com.dam.danalvtam;

import java.util.Random;
import java.util.Scanner;

import com.danalvtam.consola.Amico;

public class PartidaBrisca extends MazoCartasBrisca {
    Scanner sc = new Scanner(System.in);
    JugadorBrisca jugador1 = new JugadorBrisca(true);
    JugadorBrisca jugador2 = new JugadorBrisca(false);
    MazoCartasBrisca mazo = new MazoCartasBrisca();

    public void repartir() {
        mazo.barajar();
        for (int i = 0; i < 3; i++) {
            jugador1.agregarCarta(mazo.extraerCarta());
            jugador2.agregarCarta(mazo.extraerCarta());
        }
    }

    public void pintar() {
        System.out.print("\t MAZO JUGADOR");
        Amico.cursorXY(0, 12);
        System.out.print("Carta 1");
        Amico.cursorXY(11, 12);
        System.out.print("Carta 2");
        Amico.cursorXY(22, 12);
        System.out.print("Carta 3");
        Amico.cursorXY(41, 4);
        System.out.print("QUEDAN " + mazo.cuantasQuedan());

        Amico.cursorXY(4, 14);
        System.out.print("PUNTOS DE JUGADOR " + jugador1.getPuntos());
        Amico.cursorXY(4, 15);
        System.out.print("PUNTOS DE PROGRAMA " + jugador2.getPuntos());

        jugador1.getCartas(0).print(2, 3);
        jugador1.getCartas(1).print(12, 3);
        jugador1.getCartas(2).print(22, 3);
        mazo.getMuestra().print(55, 3);
        jugador1.getCartas(0).printReverso(40, 5);
        if (primerTurno() == 0) {
            Amico.cursorXY(5, 13);
            System.out.print("USTED SALE ELIJA CARTA (1-3)");
            sc.nextInt();
        } else {
            Amico.cursorXY(5, 13);
            System.out.print("RESPONDA ELIJA CARTA (1-3)");
            sc.nextInt();

        }

    }

    public int primerTurno() {
        Random random = new Random();
        int numero = random.nextInt(2);
        return numero;
    }

    public void main(String[] args) {
        Amico.bp();
        repartir();
        pintar();

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
