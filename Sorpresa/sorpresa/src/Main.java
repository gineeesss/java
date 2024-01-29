import mesas.Mesa2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
       /*  int[] numero = new int[10];
        for(int i=0;i< numero.length;i++){
            numero[i]=i;
            Mesa mesa = new Mesa(numero[i]);
        }
        ya no me da tiempo a intentarlo con este
           modelo porque tengo hecho el array de dos diensiones en la clase
           y deberia de hacerlo solo de 1
        */
        Mesa2 mesa2 = new Mesa2();
        int menu;
        int numClientes=0;
        int mesaposible=0;
        do {
            System.out.println("[1] BUSCAR MESA LIBRE \n[2] OCUPAR MESA \n\n[0] CERRAR PROGRAMA");
            menu = scr.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("CUANTAS PERSONAS");
                    numClientes = scr.nextInt();
                    mesaposible = mesa2.mesalibre(numClientes);
                    if(mesaposible==0){
                        System.out.println("No hay mesas disponibles");
                    } else System.out.println(mesa2.mesalibre(numClientes));
                    break;
                case 2:
                    mesa2.ocupar(numClientes,mesaposible);
                    System.out.println();
                    break;

            }

            System.out.println(" ");
            System.out.println(mesa2);
        }while (menu!=0);







       /* int[][] mesas= new int[2][10]; //la primera dimension(derecha) es  la cantidad de mesas, está en dos dimensiones, el numero y la cantidad de comensales
        for(int j=0;j<mesas.length;j++) {
            for (int i = 0; i < mesas[0].length; i++) {
                if(j==0){
                    mesas[j][i] = i;
                }else mesas[j][i] = (int)(Math.random()*5+0);
            }
        }

        for (int[] b:mesas){
            for (int a: b){
                System.out.print(a + " ");
            }
            System.out.println("");
        }*/
    }
}