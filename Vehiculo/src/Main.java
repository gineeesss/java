import alquilervehiculos.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Coche[] coches= new Coche[2];
        Moto[] motos = new Moto[2];
        Bicicleta[] bicis = new Bicicleta[2];
        CocheAltaGama[] carros= new CocheAltaGama[2];

        coches[0] = new Coche("Renault","Scenic",2004,3);
        coches[1] = new Coche("Citröen","C4 Cactus",2016,5);
        motos[0] = new Moto("Kawasaki","Ninja",2008,500);
        motos[1] = new Moto("Yamaha","CXR",2018,450);
        bicis[0] = new Bicicleta("BH","Mundi",1975);
        bicis[1] = new Bicicleta("Orbea","RC-S500",2021);
        carros[0] = new CocheAltaGama("Ferrari","Enzo",1998,3);
        carros[1] = new CocheAltaGama("Nissan", "GTR",1997,5);


        int opcion,dias,elegir;
        float coste = 0f;
        Scanner scr = new Scanner(System.in).useDelimiter("\\n");

        do{
            menu();
            opcion = scr.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Tenemos estos dos coches:");
                    System.out.println("[0] " + coches[0].toString());
                    System.out.println("[1] " + coches[1].toString());
                    System.out.println("Cuál desea alquilar [0] o [1]");
                    elegir = scr.nextInt();
                    System.out.println("¿Durante cuántes días?");
                    dias = scr.nextInt();
                    coste = coches[elegir].calcularAlquiler(dias);
                    System.out.printf("El precio de alquiler es: %.2f \n¿Desea continuar con el alquiler? (S/N)\n",coste);
                    if (scr.next().equalsIgnoreCase("s")){
                        Vehiculo.setIngresoAlguiler(coste);
                        System.out.println("Alquiler realzado con éxito.");
                    } else System.out.println("Alquiler cancelado, volvieno al menú principal...");
                    break;
                case 2:
                    System.out.println("Tenemos estos dos carros:");
                    System.out.println("[0] " + carros[0].toString());
                    System.out.println("[1] " + carros[1].toString());
                    System.out.println("Cuál desea alquilar [0] o [1]");
                    elegir = scr.nextInt();
                    System.out.println("¿Durante cuántes días?");
                    dias = scr.nextInt();
                    coste = carros[elegir].calcularAlquiler(dias);
                    System.out.printf("El precio de alquiler es: %.2f \n¿Desea continuar con el alquiler? (S/N)\n",coste);
                    if (scr.next().equalsIgnoreCase("s")){
                        Vehiculo.setIngresoAlguiler(coste);
                        System.out.println("Alquiler realzado con éxito.");
                    } else System.out.println("Alquiler cancelado, volvieno al menú principal...");
                    break;
                case 3:
                    System.out.println("Tenemos estas dos motos:");
                    System.out.println("[0] " + motos[0].toString());
                    System.out.println("[1] " + motos[1].toString());
                    System.out.println("Cuál desea alquilar [0] o [1]");
                    elegir = scr.nextInt();
                    System.out.println("¿Durante cuántes días?");
                    dias = scr.nextInt();
                    coste = motos[elegir].calcularAlquiler(dias);
                    System.out.printf("El precio de alquiler es: %.2f \n¿Desea continuar con el alquiler? (S/N)\n",coste);
                    if (scr.next().equalsIgnoreCase("s")){
                        Vehiculo.setIngresoAlguiler(coste);
                        System.out.println("Alquiler realzado con éxito.");
                    } else System.out.println("Alquiler cancelado, volvieno al menú principal...");
                    break;
                case 4:
                    System.out.println("Tenemos estas dos motos:");
                    System.out.println("[0] " + bicis[0].toString());
                    System.out.println("[1] " + bicis[1].toString());
                    System.out.println("Cuál desea alquilar [0] o [1]");
                    elegir = scr.nextInt();
                    System.out.println("¿Durante cuántes días?");
                    dias = scr.nextInt();
                    coste = bicis[elegir].calcularAlquiler(dias);
                    System.out.printf("El precio de alquiler es: %.2f \n¿Desea continuar con el alquiler? (S/N)\n",coste);
                    if (scr.next().equalsIgnoreCase("s")){
                        Vehiculo.setIngresoAlguiler(coste);
                        System.out.println("Alquiler realzado con éxito.");
                    } else System.out.println("Alquiler cancelado, volvieno al menú principal...");
                    break;
                case 5:
                    System.out.println(Vehiculo.getIngresoAlguiler());
                    break;
                case 0:
                    System.out.println("Gracias por usar nuestra empresa de alquiler");
            }
        }while (opcion!=0);
    }

    public static void menu(){
        System.out.println("MENU ______________________________________________");
        System.out.println("[1] Alquilar Coche");
        System.out.println("[2] Alquilar Coche Alta Gama");
        System.out.println("[3] Alquilar Moto");
        System.out.println("[4] Alquilar Bicicleta");
        System.out.println("[5] Calcular Ingreso total alquiler para la empresa");
        System.out.println("[0] Salir");
        System.out.println("___________________________________________________");
    }
}
