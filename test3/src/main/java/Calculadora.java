import java.util.Scanner;

public class Calculadora {
    public static Scanner scr = new Scanner(System.in).useDelimiter("\\n");
    public static void main(String[] args) {
        String calculo = scr.next();
        String[] pila = calculo.split(" ");
        int caracteres = 1;
//            System.out.println(caracteres);
        double resultado = Double.parseDouble(pila[0]);
        while(caracteres!=pila.length+1){
            switch (pila[caracteres + 1]) {
                case "s":
                    resultado = suma(pila,resultado,caracteres);
                    caracteres += 2;
                    break;
                case "r":
                    resultado = resta(pila,resultado,caracteres);
                    caracteres += 2;
                    break;
                case "m":
                    resultado = multiplicacion(pila,resultado,caracteres);
                    caracteres += 2;
                    break;
                case "d":
                    resultado = division(pila,resultado,caracteres);
                    caracteres += 2;
                    break;
            }
        }
        System.out.println("El resultado es: " + resultado);
    }



    public static double suma(String[] pila,double resultado ,int caracteres){
        return resultado + Double.parseDouble(pila[caracteres]);
    }
    public static double resta(String[] pila,double resultado , int caracteres){
        return resultado - Double.parseDouble(pila[caracteres-2]);
    }
    public static double multiplicacion(String[] pila,double resultado , int caracteres){
        return resultado * Double.parseDouble(pila[caracteres-2]);
    }
    public static double division(String[] pila,double resultado , int caracteres){
        return resultado / Double.parseDouble(pila[caracteres-2]);
    }
}
