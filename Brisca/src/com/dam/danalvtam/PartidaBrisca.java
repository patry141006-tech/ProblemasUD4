package com.dam.danalvtam;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import com.danalvtam.consola.Amico;

public class PartidaBrisca extends MazoCartasBrisca {
    Scanner sc = new Scanner(System.in);
    JugadorBrisca jugador1 = new JugadorBrisca(true);
    JugadorBrisca jugador2 = new JugadorBrisca(false);
    MazoCartasBrisca mazo = new MazoCartasBrisca();
    boolean jugador1Empieza;

    public void main(String[] args) {
        jugador1Empieza = new Random().nextInt(2) % 2 == 0;
        jugar();
    }

    public void repartir() {
        mazo.barajar();
        for (int i = 0; i < 3; i++) {
            jugador1.agregarCarta(mazo.extraerCarta());
            jugador2.agregarCarta(mazo.extraerCarta());
        }
    }

    public void pintar() {
        System.out.print("\t MAZO JUGADOR");
        Amico.cursorXY(3, 11);
        System.out.print("Carta 1");
        Amico.cursorXY(13, 11);
        System.out.print("Carta 2");
        Amico.cursorXY(23, 11);
        System.out.print("Carta 3");
        Amico.cursorXY(41, 4);
        System.out.print("QUEDAN " + (mazo.cuantasQuedan() <= 0 ? "0" : mazo.cuantasQuedan()));

        Amico.cursorXY(4, 14);
        System.out.print("PUNTOS DE JUGADOR " + jugador1.getPuntos());
        Amico.cursorXY(4, 15);
        System.out.print("PUNTOS DE PROGRAMA " + jugador2.getPuntos());

        Amico.cursorXY(10, 17);
        System.out.print("JUGADA HUMANO");
        Amico.cursorXY(27, 17);
        System.out.print("JUGADA PROGRAMA");

        try {
            jugador1.cartas.get(0).print(2, 3);
            jugador1.cartas.get(1).print(12, 3);
            jugador1.cartas.get(2).print(22, 3);
        } catch (IndexOutOfBoundsException e) {
            // Capturamos Excepcion de las cartas
        }
        mazo.getMuestra().print(55, 3);
        if (mazo.cuantasQuedan() > 0) {
            jugador1.cartas.get(0).printReverso(40, 5);
        }

        if (jugador1Empieza) {
            Amico.cursorXY(5, 12);
            System.out.print("USTED SALE ELIJA CARTA (1-3)");
        } else {
            Amico.cursorXY(5, 12);
            System.out.print("RESPONDA ELIJA CARTA (1-3)");
        }
    }

    public void jugar() {
        Scanner sca = new Scanner(System.in);
        repartir();
        while (!jugador1.cartas.isEmpty() || !jugador2.cartas.isEmpty()) {
            Amico.bp();
            pintar();

            CartaBrisca cartaElegidaJugador = null;
            CartaBrisca cartaElegidaMaquina = null;

            if (jugador1Empieza) {
                cartaElegidaJugador = juegaHumano();
                cartaElegidaMaquina = juegaPrograma();
            } else {
                cartaElegidaMaquina = juegaPrograma();
                cartaElegidaJugador = juegaHumano();
            }

            if (ganaPrimera(cartaElegidaJugador, cartaElegidaMaquina, jugador1Empieza, mazo.cartas.get(0).getPalo())) {
                jugador1.sumarPuntos(cartaElegidaJugador.cuantosPuntos());
                jugador1.sumarPuntos(cartaElegidaMaquina.cuantosPuntos());
                jugador1Empieza = true;
                Amico.cursorXY(45, 20);
                System.out.print("USTED HA GANADO. Pulse ENTER...");
                if (mazo.cuantasQuedan() >= 0) {
                    jugador1.agregarCarta(mazo.extraerCarta());
                    jugador2.agregarCarta(mazo.extraerCarta());
                }
            } else {
                jugador2.sumarPuntos(cartaElegidaJugador.cuantosPuntos());
                jugador2.sumarPuntos(cartaElegidaMaquina.cuantosPuntos());
                jugador1Empieza = false;
                Amico.cursorXY(45, 20);
                System.out.print("USTED HA PERDIDO. Pulse ENTER...");
                if (mazo.cuantasQuedan() >= 0) {
                    jugador2.agregarCarta(mazo.extraerCarta());
                    jugador1.agregarCarta(mazo.extraerCarta());
                }
            }
            sca.nextLine();
        }
        sca.close();
        Amico.cursorXY(5, 30);

        System.out.println("PARTIDA FINALIZADA. PUNTUACIÓN FINAL:");
        System.out.println("JUGADOR: " + jugador1.getPuntos());
        System.out.println("PROGRAMA: " + jugador2.getPuntos());
        if (jugador1.getPuntos() > jugador2.getPuntos()) {
            System.out.println("¡FELICIDADES! HAS GANADO LA PARTIDA.");
        } else if (jugador1.getPuntos() < jugador2.getPuntos()) {
            System.out.println("LO SIENTO, HAS PERDIDO LA PARTIDA.");
        } else {
            System.out.println("LA PARTIDA HA TERMINADO EN EMPATE.");
        }
    }

    public CartaBrisca juegaPrograma() {
        Random random = new Random();
        int indiceCartaPrograma = random.nextInt(jugador2.cartas.size());
        CartaBrisca cartaElegidaMaquina = jugador2.cartas.remove(indiceCartaPrograma);
        cartaElegidaMaquina.print(29, 18);
        return cartaElegidaMaquina;
    }

    public CartaBrisca juegaHumano() {
        int indiceCartaJugador = 0;
        Amico.subraya(true);
        Amico.cursorXY(33, 12);
        while (indiceCartaJugador < 1 || indiceCartaJugador > jugador1.cartas.size()) {
            try {
                indiceCartaJugador = sc.nextInt();
            } catch (InputMismatchException e) {
                // Ignoramos Excepcion
            }
            Amico.cursorXY(33, 12);
        }
        Amico.subraya(false);
        CartaBrisca cartaElegidaJugador = jugador1.cartas.remove(indiceCartaJugador - 1);
        cartaElegidaJugador.print(12, 18);

        return cartaElegidaJugador;
    }

    public boolean ganaPrimera(CartaBrisca primera, CartaBrisca segunda, boolean empiezaJ1, Palo triunfo) {
        if (primera.getPalo() == triunfo &&
                segunda.getPalo() != triunfo) {
            return true;
        }
        if (segunda.getPalo() == triunfo &&
                primera.getPalo() != triunfo) {
            return false;
        }
        if (primera.getPalo() == segunda.getPalo()) {
            return primera.compareTo(segunda) > 0;
        }

        if (empiezaJ1) {
            return true;
        }
        return false;
    }
}
