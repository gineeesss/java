import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Introduce los segundos que deseas pasar a miuntos: ");
        int segundos = scr.nextInt();
        int minutos;
        int horas ;
        minutos = segundos/60;
        segundos = segundos%60;
        horas = minutos/60;
        minutos = minutos%60;
        System.out.println("Equivale a " +horas+" horas, "+minutos+" minutos y "+segundos+ " segundos.");
    }
}