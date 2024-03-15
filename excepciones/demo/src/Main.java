import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{

        Scanner scr = new Scanner(System.in);
        int numerador, denominador, opcion;
            System.out.println("Elige una opcion: \n[1] Hacer una Division entera \n[0] Salir del programa");
        opcion = scr.next
        System.out.println("Dime el numerador");
        numerador = scr.nextInt();
        System.out.println("Dime el numerador");
        denominador = scr.nextInt();
        System.out.println("El resultado de la división es: "+(numerador/denominador));
        } catch (ArithmeticException holi){
            holi = new ArithmeticException("Está haciedno una division por cero y no se puede");
            System.out.println(holi.getMessage());
        }catch (InputMismatchException holi){
            holi = new InputMismatchException("Sólo puedes poner números enteros. No se acpeta otros caracteres");
            System.out.println(holi.getMessage());
        }catch (Exception ex){
            ex = new Exception("Se ha producio una excepcion que no conozco");
            System.out.println(ex.getMessage());
        }
    }
}
