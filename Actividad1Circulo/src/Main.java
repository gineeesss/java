import circulo.Circulo;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);


        //Circulo circle = new Circulo;
        Circulo[] almacen = new Circulo[5];

        int opcion;
        float radio;
        do {
            menu();
            opcion = scr.nextInt();
            switch (opcion){
                case 1:
                    almacen[Circulo.getTotalCirculos()] = new Circulo(Circulo.radioPreguntar());
                    System.out.println();
                    break;
                case 2:
                    radio = Circulo.radioPreguntar();
                    System.out.printf("El area del circulo es: %.2f\n",Circulo.area(radio));
                    break;
                case 3:
                    for (int i=0;i<Circulo.getTotalCirculos();i++){
                        System.out.println(
                                "\nCirculo nº"+ (i+1)
                                +"\nRadio: "+ almacen[i].getRadio()
                                +"\nArea: " +  Math.round(Circulo.area(almacen[i].getRadio())*100)/100.0
                                +"\nCircunferencia: " +  Math.round(Circulo.circunferencia(almacen[i].getRadio())*100)/100.0
                        );

                    }
                    System.out.print("\nTotal Circulos: "+Circulo.getTotalCirculos());
                    break;
            }

        }while (opcion!=5);
    }

    public static void menu(){
        System.out.println("\nMENU\n" +
                "[1] CREAR CIRCULO CON RADIO\n" +
                "[2] CONSULTAR AREA\n" +
                "[3] CONSULTAR DATOS TOTALES\n");
    }
    /*public static float area(float radio){
        float area = (float)(Math.PI * Math.pow(radio,2));
        return area;
    }
    public static float radioPreguntar(){
        Scanner scr = new Scanner(System.in);
        System.out.println("Introducir radio: ");
        float radio = scr.nextFloat();
        return radio;
    }*/
}
