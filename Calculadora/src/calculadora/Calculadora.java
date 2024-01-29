package calculadora;

import java.util.Scanner;

public class Calculadora {
    private int n;
    private int auxiliar;
    Scanner scr = new Scanner(System.in);
    public Calculadora() {
        Iniccializar();
        CalculadoraDisplay(n);
    }
   public void CalculadoraDisplay(int n){
        System.out.println("-MENÚ----------\nResultado: "+this.n+"\nSumar       [1]\nRestar      [2]\nMultiplicar [3]\nDividir     [4]\nFactorial   [5]\nInicializar [6]\nFin         [7]");
       int i = scr.nextInt();
           switch (i){
               case 1:
                   Sumar(this.n);
                   break;
               case 2:
                   Restar(this.n);
                   break;
               case 3:
                   Multiplicar(this.n);
                   break;
               case 4:
                   Dividir(this.n);
                   break;
               case 5:
                   Factorial();
                   break;
               case 6:
                   Iniccializar();
                   break;
               case 7:
                   return;

           }
       CalculadoraDisplay(this.n);


   }
    public int Sumar(int n){
       auxiliar = scr.nextInt();
       this.n = n + auxiliar;
       return this.n;
    }
    public int Restar(int n){
        auxiliar = scr.nextInt();
        this.n=n - auxiliar;
        return n;
    }
    public int Multiplicar(int n){
        auxiliar = scr.nextInt();
        this.n = n*auxiliar;
        return n;
    }
    public int Dividir(int n){
        auxiliar = scr.nextInt();
        this.n = n / auxiliar;
        return n;
    }
    public int Factorial(){
        auxiliar = n -1;
        if(n>=0){
            if (n==0){
                this.n=1;
            }
            else{
                for (;auxiliar>1;auxiliar--){
                    this.n = n * auxiliar;
                }
            }
        }
        return n;
    }
    public void Iniccializar(){
        System.out.println("Introduce Número con el que desea realizar cálculos");
        int n = scr.nextInt();
        this.n = n;
    }
}
