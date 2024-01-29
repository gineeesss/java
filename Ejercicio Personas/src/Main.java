import clases.Pepe;
import clases.Personas1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scr = new Scanner(System.in);
        Pepe pep = new Pepe(001,"Pepe");
        int p = scr.nextInt();
        pep.edadDeltio(p);
        System.out.println(pep);;

        // Personas1 p1 = new Personas1("Pedro","Pérez",1998);
        // Personas1 p2 = new Personas1("Luis","León",2009);

        // System.out.println(p1);
        // System.out.println(p2);

    }
}