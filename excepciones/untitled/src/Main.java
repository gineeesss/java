import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner scr = new Scanner(System.in);

    public static void main(String[] args) {
        int numerador, denominador, opcion = 0;
        do {
            try {
                opcion=menu();
                switch (opcion) {
                    case 1:
                        System.out.println("Dime el numerador");
                        numerador = scr.nextInt();
                        denominador= denominador();
                        System.out.println("Lnea no ejecutada");
                        System.out.println("El resultado de la división es: " + (numerador / denominador));
                        opcion = 0;
                        break;
                    case 0:
                        System.out.println("AYPS");
                        break;
                }
            } catch (InputMismatchException ex) {
                ex = new InputMismatchException("Los numeros para dividir an de sr enteros");
                System.out.println(ex.getMessage());
                scr.nextLine();
            } catch (ArithmeticException ex) {
                System.out.println(ex.getMessage());

            }
        }while (opcion != 0) ;
    }
    private static int menu(){
        try {
            System.out.println("Elige una opcion: \n[1] Hacer una Division entera \n[0] Salir del programa");
            return scr.nextInt();
        } catch (InputMismatchException ex) {
            ex = new InputMismatchException("Fallo");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            scr.nextLine();
            return -1;
        }
    }
    private static int denominador() throws ArithmeticException{
        try{
            int denominador;
            System.out.println("Dime el numerador");
            denominador=scr.nextInt();
            if (denominador == 0) throw new ArithmeticException();
            return denominador;
        }catch (InputMismatchException ex){
            ex = new InputMismatchException("Los numeros no pueden ser 0");
            System.out.println(ex.getMessage());
            System.out.println("Esta linea se ve");
            scr.nextLine();
            return -1;
        }
    }
}

