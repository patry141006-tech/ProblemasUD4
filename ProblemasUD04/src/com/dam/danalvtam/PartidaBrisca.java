package com.dam.danalvtam;

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
        System.out.print("QUEDAN " + mazo.cuantasQuedan());

        Amico.cursorXY(4, 14);
        System.out.print("PUNTOS DE JUGADOR " + jugador1.getPuntos());
        Amico.cursorXY(4, 15);
        System.out.print("PUNTOS DE PROGRAMA " + jugador2.getPuntos());

        Amico.cursorXY(10, 17);
        System.out.print("JUGADA HUMANO");
        Amico.cursorXY(27, 17);
        System.out.print("JUGADA PROGRAMA");

        jugador1.getCarta(0).print(2, 3);
        jugador1.getCarta(1).print(12, 3);
        jugador1.getCarta(2).print(22, 3);
        mazo.getMuestra().print(55, 3);
        jugador1.getCarta(0).printReverso(40, 5);

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
        while (jugador1.quedanCartas() || jugador2.quedanCartas()) {
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

            if (ganaPrimera(cartaElegidaJugador, cartaElegidaMaquina)) {
                jugador1.sumarPuntos(cartaElegidaJugador.cuantosPuntos());
                jugador1.sumarPuntos(cartaElegidaMaquina.cuantosPuntos());
                jugador1Empieza = true;
                Amico.cursorXY(45, 20);
                System.out.print("USTED HA GANADO. Pulse ENTER...");
                jugador1.agregarCarta(mazo.extraerCarta());
                jugador2.agregarCarta(mazo.extraerCarta());
            } else {
                jugador2.sumarPuntos(cartaElegidaJugador.cuantosPuntos());
                jugador2.sumarPuntos(cartaElegidaMaquina.cuantosPuntos());
                jugador1Empieza = false;
                Amico.cursorXY(45, 20);
                System.out.print("USTED HA PERDIDO. Pulse ENTER...");
                jugador2.agregarCarta(mazo.extraerCarta());
                jugador1.agregarCarta(mazo.extraerCarta());
            }
            sca.nextLine();
        }

    }

    public CartaBrisca juegaPrograma() {
        Random random = new Random();
        int indiceCartaPrograma = random.nextInt(2);
        CartaBrisca cartaElegidaMaquina = jugador2.getCarta(indiceCartaPrograma);
        cartaElegidaMaquina.print(29, 18);
        jugador2.removeCarta(indiceCartaPrograma);
        return cartaElegidaMaquina;
    }

    public CartaBrisca juegaHumano() {
        int indiceCartaJugador = sc.nextInt();
        CartaBrisca cartaElegidaJugador = jugador1.getCarta(indiceCartaJugador - 1);
        cartaElegidaJugador.print(12, 18);
        jugador1.removeCarta(indiceCartaJugador - 1);

        return cartaElegidaJugador;
    }

    public boolean ganaPrimera(CartaBrisca primera, CartaBrisca segunda) {
        if (primera.getPalo() == cartas.get(0).getPalo() &&
                segunda.getPalo() != cartas.get(0).getPalo()) {
            return true;
        }
        if (segunda.getPalo() == cartas.get(0).getPalo() &&
                primera.getPalo() != cartas.get(0).getPalo()) {
            return false;
        }
        if (primera.getPalo() == segunda.getPalo()) {
            return primera.cuantosPuntos() > segunda.cuantosPuntos();
        }
        return true;
    }
}
