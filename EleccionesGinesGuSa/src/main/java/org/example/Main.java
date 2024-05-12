package org.example;

import java.util.Scanner;

public class Main {
    public static ClaseVotacion propuesta = new ClaseVotacion();
    public static Scanner scr = new Scanner(System.in).useDelimiter("\\n");

    public static void main(String[] args) {
        String nombre,voto;
        int votaciones = scr.nextInt();
        for (int i= 0;i<votaciones;i++){
            nombre =scr.next();
            voto=scr.next();
            propuesta.clasificarVotos(nombre,voto, scr.nextInt());
        }
        propuesta.mostrarLista();
    }
}