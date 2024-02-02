import alquilervehiculos.*;

import java.lang.annotation.Documented;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in).useDelimiter("\\n");

        Vehiculo[][] cochera = new Vehiculo[4][2];
        cochera[0][0] = new Coche("Renault","Scenic",2004,3);
        cochera[0][1] = new Coche("Citröen","C4 Cactus",2016,5);
        cochera[1][0] = new Moto("Kawasaki","Ninja",2008,500);
        cochera[1][1] = new Moto("Yamaha","CXR",2018,450);
        cochera[2][0] = new Bicicleta("BH","Mundi",1975);
        cochera[2][1] = new Bicicleta("Orbea","RC-S500",2021);
        cochera[3][0] = new CocheAltaGama("Ferrari","Enzo",1998,3);
        cochera[3][1] = new CocheAltaGama("Nissan", "GTR",1997,5);

// option!=5
        int dias,j,i,option;
        float coste =0;
        do {
            menu();
            option = scr.nextInt();
            if (option >= 1 & option <=5){
                i = option - 1;//primera dimesión (categoria vehículo)
                System.out.println("¿Cuál desea alquilar? [1][2]");
                System.out.println((cochera[i][0]).toString());
                System.out.println((cochera[i][1]).toString());
                j = scr.nextInt() - 1;
                System.out.println("¿Cuántos días?");
                dias = scr.nextInt();
                coste = (cochera[i][j]).calcularAlquiler(dias);
                System.out.printf("El precio de alquiler es: %.2f \n¿Desea continuar con el alquiler? (S/N)\n", coste);
                if (scr.next().equalsIgnoreCase("s")) {
                    Vehiculo.setIngresoAlguiler(coste);
                    System.out.println("Alquiler realzado con éxito.");
                } else System.out.println("Alquiler cancelado, volvieno al menú principal...");
            } else if (option==5) {
                System.out.println(Vehiculo.getIngresoAlguiler());
            }else break;

        }while (option!=0);
        }

    public static void menu(){
        System.out.println("MENU ______________________________________________");
        System.out.println("[1] Alquilar Coche");
        System.out.println("[2] Alquilar Moto");
        System.out.println("[3] Alquilar Bicicleta");
        System.out.println("[4] Alquilar Coche Alta Gama");
        System.out.println("[5] Calcular Ingreso total alquiler para la empresa");
        System.out.println("[0] Salir");
        System.out.println("___________________________________________________");
    }
}
