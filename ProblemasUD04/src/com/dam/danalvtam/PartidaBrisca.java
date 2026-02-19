package com.dam.danalvtam;

import java.util.ArrayList;
import java.util.List;

public class PartidaBrisca {
    private int turno;
    private Palo muestra;
    private MazoCartasBrisca mazo;
    private List<JugadorBrisca> jugadores;

    public PartidaBrisca(Palo muestra) {
        this.muestra = muestra;
        this.turno = 0;
        this.mazo = new MazoCartasBrisca();
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(JugadorBrisca jugador) {
        jugadores.add(jugador);
    }

    public void siguienteTurno() {
        turno = (turno + 1) % jugadores.size();
    }

    public JugadorBrisca getJugadorActual() {
        return jugadores.get(turno);
    }
}
