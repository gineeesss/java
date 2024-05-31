import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Introduce año");
        int anio = scr.nextInt();
        if (anio%4 == 0 && anio%100==0){
            if(anio%400==0){
                System.out.println("El año" +anio+" es bisiesto");
            }
            else System.out.println("El año "+anio+" no es bisiesto");
        }else if (anio%4 == 0 && anio%100!=0) System.out.println("El año "+anio+" no es bisiesto");

    }
}