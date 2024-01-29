import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        float[] numeros = new float[10];
        for (int i = 0;i< numeros.length;i++){
            System.out.print("\nIngresar  Número nº"+(i+1)+":");
            numeros[i]= scr.nextFloat();
        }
        System.out.println("Lista de Números:");
        for (int  i= numeros.length - 1; i>=0;i--){
            if (i !=0) {
                System.out.print(numeros[i] + ", ");
            }else System.out.print(numeros[i]);
        }
    }
}