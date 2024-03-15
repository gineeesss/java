import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner scr = new Scanner(System.in);
            int numerador, denominador, opcion;
            do {

            System.out.println("Elige una opcion: \n[1] Hacer una Division entera \n[0] Salir del programa");
            opcion = scr.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Dime el numerador");
                    numerador = scr.nextInt();
                    System.out.println("Dime el numerador");
                    denominador = scr.nextInt();
                    System.out.println("El resultado de la división es: "+(numerador/denominador));
                    break;
                case 2:
                    System.out.println("AYPS");
                    break;
            }
            }while (opcion!=0);

    }
}
