import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      int [][]numeros = new int [4][5];
      int a = numeros.length;
      //System.out.println(a);
      //int b = numeros[0].length;
      // System.out.println(b);
      int sumafilas = 0;
      int sumatotal = 0;

      //bucle para crear la matriz
      for (int i=0; i<numeros.length;i++){
          for (int j=0;j<numeros[0].length;j++) {
              numeros[i][j] = (int) (Math.random() * 100 + 1);
          }
      }
      //interfaz columnas
        System.out.printf("/////|Col1 |Col2 |Col3 |Col4 |Col5 | Suma|\n");
        //System.out.println("____________________________________");
        System.out.println("=====|===================================|");
      //bucle para imprimir la tabla y la columnas extra con la suma de cada fila
        for (int i=0; i< numeros.length;i++){
            System.out.printf("Fil%d ",i+1);
            for (int j=0;j<numeros[0].length;j++) {
                //System.out.print(numeros[i][j]+"  ");
                System.out.printf("%s| %-4d","",numeros[i][j]);
               sumafilas = sumafilas + numeros[i][j];
            }
            System.out.println("| "+sumafilas+" | Suma Fila "+(i+1));
            sumatotal = sumafilas + sumatotal;
            sumafilas = 0;
        }
        //System.out.println("____________________________________");
        System.out.println("=====|===================================|");

        //bucle para imprimir la fila de las sumas de las columnas y la suma total
        int sumacolumnas = 0;
        System.out.print("Suma ");
        for (int w  =0;w< numeros[0].length;w++) {
            for (int t = 0; t < numeros.length; t++) {
                sumacolumnas = sumacolumnas + numeros[t][w];
            }
            //System.out.print(sumacolumnas+" ");
            System.out.printf("%s| %-4d","",sumacolumnas);
            sumacolumnas = 0;
        }
        System.out.print("| "+sumatotal);

    }
}