
import calculadora.Calcu;
import calculadora.Calculadora;
import calculadora.CalculadoraCorregida;
import calculadora.Calculadoraa;

import java.util.Scanner;

// como en los metodos e piden que tiene que entra parametros, entonces en los propios metodos no pregutno por ese numero sino fuera en el main
public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        CalculadoraCorregida calco = new CalculadoraCorregida();

        int opcion;
        do{
            System.out.println("-MENU----------\nResultado:"+ calco.getResultado()+"\nSumar       [1]\nRestar      [2]\nMultiplicar [3]\nDividir     [4]\nFactorial   [5]\nInicializar [6]\nFin         [7] ");
            opcion = scr.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Sumar: ");
                    calco.sumar(scr.nextInt());
                    // System.out.println(calco.sumar(scr.nextInt()));
                    break;
                case 2:
                    System.out.println("Restar: ");
                    System.out.println(calco.restar(scr.nextInt()));
                break;
                case 3:
                    System.out.println("Multiplicar: ");
                    System.out.println(calco.multipliar(scr.nextInt()));
                break;
                case 4:
                    System.out.println("Dividir: ");
                    System.out.println(calco.dividir(scr.nextInt()));
                break;
                case 5:
                    calco.factorial();
                    System.out.println(calco.getResultado());
                break;
                case 6:
                    calco.inicializar();
                break;
                case 7:

            }
        }while(opcion!=7);




        //Calculadora calc = new Calculadora();
        /* Calcu calcu= new Calcu();
            Scanner scr = new Scanner(System.in);
            Calcu calc = new Calcu();
            int i, n;
            do {
                System.out.println("-MENU----------\nResultado: " + calc + "\nSumar       [1]\nRestar      [2]\nMultiplicar [3]\nDividir     [4]\nFactorial   [5]\nInicializar [6]\nFin       [7] ");
                i = scr.nextInt();
                switch (i){
                    case 1:
                        n = scr.nextInt();
                        calc.sumar(n);
                        break;
                    case 2:
                        n = scr.nextInt();
                        calc.restar(n);
                        break;
                    case 3:
                        n = scr.nextInt();
                        calc.multiplicar(n);
                        break;
                    case 4:
                        n = scr.nextInt();
                        calc.dividir(n);
                        break;
                    case 5:
                        calc.factorial();
                        break;
                    case 6:
                        calc.inicializar();
                        break;
                }
                System.out.println("Resultado: " + calc);
            } while (i >= 0 && i <= 6); */
    }
}