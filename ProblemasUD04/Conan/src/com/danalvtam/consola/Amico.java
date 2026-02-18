package com.danalvtam.consola;

import java.util.Scanner;

public class Amico {

    public static void normal() {
        System.out.print("\033[0m");
        System.out.flush();
    }

    public static void bp() {
        System.out.print("\033[H\033[2J");
        System.out.flush();

    }

    public static void bpArriba() {
        System.out.print("\033[1J");
        System.out.flush();

    }

    public static void bpAbajo() {
        System.out.print("\033[0J");
        System.out.flush();

    }

    public static void bl() {
        System.out.print("\033[2K");
        System.out.flush();

    }

    public static void blDespues() {
        System.out.print("\033[0K");
        System.out.flush();

    }

    public static void blAntes() {
        System.out.print("\033[1K");
        System.out.flush();

    }

    public static void cursorXY(int columna, int linea) {
        System.out.print("\033[" + linea + ";" + columna + "H");
        System.out.flush();
    }

    public static void cursorArriba(int n) {
        System.out.print("\033[" + n + "A");
        System.out.flush();

    }

    public static void cursorAbajo(int n) {
        System.out.print("\033[" + n + "B");
        System.out.flush();

    }

    public static void cursorIzquierda(int n) {
        System.out.print(("\033[" + n + "D"));
        System.out.flush();

    }

    public static void cursorDerecha(int n) {
        System.out.print("\033[" + n + "C");
        System.out.flush();

    }

    public static void cursorInicio() {
        System.out.print("\033[0G");
        System.out.flush();

    }

    // colores
    public static final int NEGRO = 0;
    public static final int ROJO = 1;
    public static final int VERDE = 2;
    public static final int MARRON = 3;
    public static final int AZUL = 4;
    public static final int PURPURA = 5;
    public static final int CYAN = 6;
    public static final int BLANCO = 7;

    public static final int NEGRO_CLARO = 8;
    public static final int ROJO_CLARO = 9;
    public static final int VERDE_CLARO = 10;
    public static final int AMARILLO = 11;
    public static final int AZUL_CLARO = 12;
    public static final int PURPURA_CLARO = 13;
    public static final int CYAN_CLARO = 14;
    public static final int BLANCO_CLARO = 15;

    private static final String[] coloresTexto = { "\033[30m", "\033[31m", "\033[32m", "\033[33m", "\033[34m",
            "\033[35m", "\033[36m", "\033[37m", "\033[90m", "\033[91m", "\033[92m", "\033[93m", "\033[94m", "\033[95m",
            "\033[96m", "\033[97m" };

    private static final String[] coloresFondo = { "\033[40m", "\033[41m", "\033[42m", "\033[43m", "\033[44m",
            "\033[45m", "\033[46m", "\033[47m", "\033[100m", "\033[101m", "\033[102m", "\033[103m", "\033[104m",
            "\033[105m", "\033[106m", "\033[107m" };

    public static void texto(int c) {

        if (c < 0 || c > 15)
            return;

        System.out.print(coloresTexto[c]);
        System.out.flush();

    }

    public static void texto(int r, int g, int b) {

        if (r < 0 || r > 255 ||
                g < 0 || g > 255 ||
                b < 0 || b > 255)
            return;

        System.out.print("\033[38;2;" + r + ";" + g + ";" + b + "m");
        System.out.flush();
    }

    public static void fondo(int r, int g, int b) {

        if (r < 0 || r > 255 ||
                g < 0 || g > 255 ||
                b < 0 || b > 255)
            return;

        System.out.print("\033[48;2;" + r + ";" + g + ";" + b + "m");
        System.out.flush();
    }

    public static void fondo(int c) {

        if (c < 0 || c >= coloresFondo.length)
            return;

        System.out.print(coloresFondo[c]);
        System.out.flush();
    }

    public static void negrita(boolean on) {
        System.out.print(on ? "\033[1m" : "\033[22m");
        System.out.flush();
    }

    public static void cursiva(boolean on) {
        System.out.print(on ? "\033[3m" : "\033[23m");
        System.out.flush();
    }

    public static void subraya(boolean on) {
        System.out.print(on ? "\033[4m" : "\033[24m");
        System.out.flush();
    }

    public static void parpadeo(boolean on) {
        System.out.print(on ? "\033[5m" : "\033[25m");
        System.out.flush();
    }

    public static void tachado(boolean on) {
        System.out.print(on ? "\033[9m" : "\033[29m");
        System.out.flush();
    }

    public static void inverso(boolean on) {
        System.out.print(on ? "\033[7m" : "\033[27m");
        System.out.flush();
    }

    public static void oculto(boolean on) {
        System.out.print(on ? "\033[8m" : "\033[28m");
        System.out.flush();
    }

    public static void posiciona(int fila, int columna) {
        System.out.print("\033[" + fila + ";" + columna + "H");
    }

    public static double leeDouble(Scanner sc, int posX, int posY, String pregunta, int ancho, double min, double max) {

        double valor = 0;
        boolean correcto;

        int dondeLeerX = posX + pregunta.length() + 2;

        do {
            correcto = true;

            posiciona(posY, posX);
            System.out.print(pregunta + "  ");

            inverso(true);
            for (int i = 0; i < ancho; i++) {
                System.out.print(" ");
            }
            inverso(false);

            posiciona(posY, dondeLeerX);

            String texto = sc.nextLine().trim();

            try {
                valor = Double.parseDouble(texto);

                if (valor < min || valor > max) {
                    correcto = false;
                }

            } catch (Exception e) {
                correcto = false;
            }

        } while (!correcto);

        return valor;
    }

    public static double leeDouble(Scanner sc, int posX, int posY, String pregunta, int ancho) {

        return leeDouble(sc, posX, posY, pregunta, ancho, -Double.MAX_VALUE, Double.MAX_VALUE);
    }

    public static int leeInt(Scanner sc, int posX, int posY, String pregunta, int ancho, int min, int max) {

        int valor = 0;
        boolean correcto;

        int dondeLeerX = posX + pregunta.length() + 2;

        do {
            correcto = true;

            posiciona(posY, posX);
            System.out.print(pregunta + "  ");

            inverso(true);
            for (int i = 0; i < ancho; i++) {
                System.out.print(" ");
            }
            inverso(false);

            posiciona(posY, dondeLeerX);

            String texto = sc.nextLine().trim();

            try {
                valor = Integer.parseInt(texto);

                if (valor < min || valor > max) {
                    correcto = false;
                }

            } catch (Exception e) {
                correcto = false;
            }

        } while (!correcto);

        return valor;
    }

    public static int leeInt(Scanner sc, int posX, int posY, String pregunta, int ancho) {

        return leeInt(sc, posX, posY, pregunta, ancho, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

}
