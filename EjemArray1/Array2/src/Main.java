import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Noviembre","Diciembre"};
        int[] temperaturas = new int[12];
        for (int i=0; i< meses.length;i++){
            System.out.println("Introduce temperatura media de "+meses[i]+":");
            temperaturas[i] = scr.nextInt();
        }

        String igual = "=";
        String iguales = igual;

        for (int j = 0; j < meses.length; j++) {
            if (temperaturas[j] >=0){
                for (int i = 1; i < temperaturas[j]; i++) {
                    iguales = iguales + igual;
                }
            }else {
                int a = temperaturas[j]*-1;
                for (int i = 1; i < a; i++) {
                    iguales = iguales + igual;
                }
            }
            if (temperaturas[j] ==0){
                //System.out.println(meses[j]+": ");
                System.out.printf("%-10s: \n",meses[j]);

            } else if (temperaturas[j]<0) {
                //System.out.println(meses[j]+": -/"+iguales);
                System.out.printf("%-10s: -/%s\n",meses[j],iguales);
                iguales = igual;
            }else {
             //   System.out.println(meses[j] + ": " + iguales);
                System.out.printf("%-10s: %s\n",meses[j],iguales);
                iguales = igual;
            }
        }
    }
}