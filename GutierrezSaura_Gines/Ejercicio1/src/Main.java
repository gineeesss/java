import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int[][] numeros = new int[10][10];
        for (int i = 0;i<numeros.length;i++){
            for (int j= 0;j<numeros[0].length;j++){
                numeros[i][j]=(int) (Math.random() *25 +1);
            }
        }
        int filaMayor = 0;
        int posicionFila = 0;
        int posicionFilaMasGrande = 0;
         for (int[] a:numeros){
             int propuestaMayor = 0;
             for (int cifra :a) {
                 propuestaMayor +=cifra;
                 System.out.println(cifra);
             }
             System.out.println(" ");
             if (propuestaMayor > filaMayor){
                 posicionFilaMasGrande = posicionFila;
                 filaMayor=propuestaMayor;
             }
             posicionFila++;
         }
        System.out.println("La fila con mayor suma es la fila "+posicionFilaMasGrande+" y la suma vale: "+filaMayor);




        System.out.println("Introducir numero para comprobar los elementos que lo contienen");
        int averiguar=scr.nextInt();

        System.out.println("Los elementos que tienen el numero: "+averiguar+" son: ");
        for (int i=0;i<numeros.length;i++){
            for (int j=0;j<numeros[0].length;j++){
                if(numeros[i][j]==averiguar){
                    System.out.println("{"+(i+","+j)+"}");
                }
            }
        }
    }
}
