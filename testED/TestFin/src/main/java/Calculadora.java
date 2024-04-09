import java.util.Scanner;

public class Calculadora {
    private static final String VERSION = "1.0";
    private static Scanner scr;

    public Calculadora() {
    }

    public static void main(String[] args) {
        System.out.println("Calculadora de pila - Versión 1.0");
        System.out.println("Ingrese la expresión en notación de pila (por ejemplo, '2 3 s 2 m'): ");
        scr = new Scanner(System.in);
        String expresion = scr.nextLine();
        String[] elementos = expresion.split(" ");
        Pila pila = new Pila();

        for (String elemento : elementos) {
            switch (elemento) {
                case "s":
                    pila.sumar();
                    break;
                case "r":
                    pila.restar();
                    break;
                case "m":
                    pila.multiplicar();
                    break;
                case "d":
                    pila.dividir();
                    break;
                default:
                    pila.push(Double.parseDouble(elemento));
            }
        }

        System.out.println("El resultado es: " + pila.pop());
    }

    static class Pila {
        private double[] pila = new double[50];
        private int pico = -1;

        Pila() {
        }

        public void push(double valor) {
            this.pila[++this.pico] = valor;
        }

        public double pop() {
            return this.pila[this.pico--];
        }

        public void sumar() {
           // double b = this.pop();
            //double a = this.pop();
            //this.push(a + b);
        }

        public void restar() {
            double b = this.pop();
            double a = this.pop();
            this.push(a - b);
        }

        public void multiplicar() {
            double b = this.pop();
            double a = this.pop();
            this.push(a * b);
        }

        public void dividir() {
            double b = this.pop();
            double a = this.pop();
            this.push(a / b);
        }
    }
}
