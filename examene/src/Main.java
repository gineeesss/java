import examen.EntradasGraduacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Indica el numero de entradas para cada zona");
        System.out.print("Butacas:");
        int entradasButacas = scr.nextInt();
        System.out.print("Anfiteatro:");
        int entradasAnfiteatro = scr.nextInt();
        System.out.print("Palco:");
        int entradasPalco = scr.nextInt();
        EntradasGraduacion ent = new EntradasGraduacion(entradasButacas,entradasAnfiteatro,entradasPalco);
        int opcion;
        do{
            System.out.println("MENU \n1.Mostrar número de entradas disponibles en cada zona \n2.Vender entras \n3.Salir");
            opcion=scr.nextInt();

            switch (opcion){
                case 1:
                    System.out.println(ent);
                    break;
                case 2:
                    ent.venderEntradas();
                    break;
            }
        }while (opcion!=3);
    }
}