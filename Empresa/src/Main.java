import empleados.*;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in).useDelimiter("\\n");
        Empleado[] plantilla = new Empleado[4];
        plantilla[0] = new Repartidor("Paco",20,1050,"Zona 2");
        plantilla[1] = new Repartidor("Ruben",20,990,"zona 3");
        plantilla[2] = new Comercial("Luisa",22,1400,500);
        plantilla[3] = new Comercial("Elisa",34,1600,210);
        //System.out.println(plantilla[1]);
        int opcion=0;
        do{
            menu();
            opcion = scr.nextInt();
            switch (opcion){
                case 1:
                    for (Empleado a: plantilla) System.out.println(a.toString());
                    break;
                case 2:
                    for (Empleado a: plantilla){
                        if (a instanceof Comercial) System.out.println(a.toString());
                    }
                    break;
                case 3:
                    for (Empleado a: plantilla){
                        if (a instanceof Repartidor) System.out.println(a);
                    }
                    break;
                case 4:
                    for (Empleado a: plantilla) a.aplicarPlus();
                    break;
            }
        }while (opcion!=5);
    }


public static void menu(){
        System.out.println("[1] MOSTRAR PLANTILLA");
        System.out.println("[2] MOSTRAR COMERCIALES");
        System.out.println("[3] MOSTRAR REPARTIDORES");
        System.out.println("[4] APLICAR PLUS");
    }

}
