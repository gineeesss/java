package calculadora;

import java.util.Scanner;
public class Calcu {
    private int n;
    private int auxiliar;

    public Calcu(int n) {
        this.n = n;
    }
    public Calcu() {
        this(0);
    }
    public int sumar(int n){
        return this.n += n;
    }
    public int restar(int n){
        return this.n -= n;
    }
    public int multiplicar(int n){
        return this.n *= n;
    }
    public int dividir(int n){
        return this.n /= n;
    }
    public int factorial(){
        /*int resultado = 1;
        for (int i = 1; i <= n; i++){
            resultado *= i;
        }*/
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
    public void inicializar() {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        this.n = n;
    }
    public String toString() {
        return String.valueOf(this.n);
    }


}
