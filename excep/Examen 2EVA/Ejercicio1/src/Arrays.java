import java.util.InputMismatchException;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[][] numeros= new int[10][10];
        int mayor=0,suma, fila=0,busca;

        for (int i=0;i<numeros.length;i++){
            suma=0;
            for (int j=0;j<numeros[i].length;j++){
                numeros[i][j]=(int) (Math.random()*25+1);
                System.out.printf("%d \t",numeros[i][j]);
                suma+=numeros[i][j];
            }
            System.out.println();
            if (suma>mayor){
                mayor=suma;
                fila=i;
            }
        }

        System.out.printf("La fila con mayor suma es la fila %d y la suma vale %d\n",fila,mayor);

        System.out.println("Dime un número del 1 al 25");
        try{
            busca=teclado.nextInt();

        System.out.printf("Los elementos que tienen el número %d son:\n",busca);
        for(int i=0;i< numeros.length;i++){
            for (int j=0;j<numeros[i].length;j++){
                if (busca==numeros[i][j]){
                    System.out.printf("{%d,%d} ",i,j);
                }
            }
        }
        }catch (InputMismatchException ex){
            ex = new InputMismatchException("Introducir un numero entero");
            System.out.println(ex.getMessage());
            teclado.next();
        }catch (RangoInvalidoException ex){

        }

    }
}
