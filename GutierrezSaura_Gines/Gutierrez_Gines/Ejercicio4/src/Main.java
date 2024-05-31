import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Introduce primer numero:");
        int num1 = scr.nextInt();
        System.out.println("Introduce segundo numero:");
        int num2 = scr.nextInt();
        int mcm = 1;;
        boolean divible = false;
            mcm = num1 * num2;
            if(num1 ==10 || num2 == 10){
                mcm = mcm /2;
            } else if (num1 == num2 *10) {
                mcm = num1;
            } else if (num2 == num1 *10) {
                mcm = num2;
            }
        System.out.println("El mínimo comun multiplo de "+num1+" y "+num2+" es "+mcm);

    }
}