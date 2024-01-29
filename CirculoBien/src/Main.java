import circulo.Circulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Circulo[] circulos = new Circulo[10];

        int opcion;
        do {
            menu();
            opcion= scr.nextInt();
            switch (opcion){
            case 1:
                System.out.println("Insertar radio: ");
                circulos[Circulo.getTotalCirculos()]=new Circulo(scr.nextFloat());
                break;
            case 2:
                System.out.println("Insertar radio: ");
                System.out.println("El área es: "+Circulo.area(scr.nextFloat()));

                break;
            case 3:
                System.out.println("El número total de circulos es: "+Circulo.getTotalCirculos());
                for (int i =0; i<Circulo.getTotalCirculos();i++) {
                    System.out.println("\nLos datos del círculo nº"+(1+i)+" son:");
                    circulos[i].mostrarInfo();
                }

                break;
            case 0:
                System.out.println("Gracias por usar el programa");
                break;
        }
        }while (opcion!=0);


    }


    public static void menu(){
        System.out.println("\nMENU\n" +
                "[1] CREAR CIRCULO CON RADIO\n" +
                "[2] CONSULTAR AREA\n" +
                "[3] CONSULTAR DATOS TOTALES\n");
    }
}
