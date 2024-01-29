/*public class Main {
    public static void main(String[] args) {
        String[] paises = {"España   ","Rusia    ","Japón    ","Australia"};
        int[][] medidas = new int [4][10];
        float media;
        int alturamaxima=medidas[0][0];
        int alturaminima=210;
        int sumamedidas = 0;

        String barrabaja = "_";         //bucle para imprimir la primera linea de la tabla
        for (int i = 1; i<113; i++)
            System.out.print(barrabaja);

        //System.out.println("________________________________________________________________________________________________________________");

        System.out.printf("\n|Pais%-7s| Datos%-45s| Altura Media | Altura Máxima | Altura Mínima |\n","","");
        //System.out.printf("|Pais%-7s| Datos%-45s| Altura Media | Altura Máxima | Altura Mínima |\n","","");
        System.out.println("|___________|___________________________________________________|______________|_______________|_______________|");

        // En el mismo bucle creo e impromo la tabla
        for (int j=0; j<medidas.length; j++){
            System.out.printf("|%-11s| {",paises[j]);
            for (int i=0;i<medidas[j].length;i++){
                medidas [j][i]=(int)(Math.random()*71f + 140f);
                //si es en un intervalo, es más facil hacerlo multiplicando el random con el numero maxio-minimo+1-->210-140+1
                // -->estos son los numeros que quiero sacar, pero no donde empezar
                // entones, se le suma la cantidad desde donde se quiere empezar a sacar numeros --> 140
                // seria como Math.random()*(210-140+1)+(140) --> si se va a pasar a int se mete toddo en un parentesis
                if (medidas[j][i]==medidas[j][medidas[0].length-1]){
                    System.out.printf("%d}|",medidas[j][i]);         //Esta linea y la siguiente es para darle un formato más bonito a los datos, y necesarias para
                }else System.out.printf("%d, ",medidas[j][i]);       //recoger lo datos entre dos llaves {}, lo que haces es que si es la últia posicion de la fila, se cierra.
                sumamedidas = sumamedidas + medidas[j][i];
                if (medidas[j][i] > alturamaxima){
                    alturamaxima = medidas[j][i];
                }
                if (medidas[j][i] < alturaminima){
                    alturaminima = medidas[j][i];
                }
            }
            media = (float)(sumamedidas/(1.0*medidas[0].length));
           //System.out.println(Math.round(media)+"            "+alturamaxima+"            "+alturaminima);
            System.out.printf("%6s%d%6s%9d%7s%9d%7s\n"," ",Math.round(media),"|",alturamaxima,"|",alturaminima,"|");
            //System.out.printf("%-14s %.0f %-14s %.2f %-14s %.2f\n", paises[j], media,"", alturamaxima,"", alturaminima);
           // System.out.println("|--------------------------------------------------------------------------------------------------------------|");

            alturaminima=210;
            alturamaxima =0;
            sumamedidas = 0;
        }
    //    System.out.println("|-----------|---------------------------------------------------|--------------|---------------|---------------|");

        System.out.println("|___________|___________________________________________________|______________|_______________|_______________|");


    }
}
*/
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String[] paises = {"España   ","Rusia    ","Japón    ","Australia"};
        int[][] medidas = new int [4][10];
        float media;
        int alturamaxima=medidas[0][0];
        int alturaminima=210;
        int sumamedidas = 0;

        String barrabaja = "_";         //bucle para imprimir la primera linea de la tabla
        for (int i = 1; i<113; i++)
            System.out.print(barrabaja);

        //System.out.println("________________________________________________________________________________________________________________");

        System.out.printf("\n|Pais%-7s| Datos%-45s| Altura Media | Altura Máxima | Altura Mínima |\n","","");
        //System.out.printf("|Pais%-7s| Datos%-45s| Altura Media | Altura Máxima | Altura Mínima |\n","","");
        System.out.println("|___________|___________________________________________________|______________|_______________|_______________|");

        // En el mismo bucle creo e impromo la tabla

        for (int j=0; j<medidas.length; j++){
            System.out.printf("|%-11s| {",paises[j]);
            for (int n:medidas[j]){
                medidas [j][n]=(int)(Math.random()*71f + 140f);
                //si es en un intervalo, es más facil hacerlo multiplicando el random con el numero maxio-minimo+1-->210-140+1
                // -->estos son los numeros que quiero sacar, pero no donde empezar
                // entones, se le suma la cantidad desde donde se quiere empezar a sacar numeros --> 140
                // seria como Math.random()*(210-140+1)+(140) --> si se va a pasar a int se mete toddo en un parentesis
                if (medidas[j][n]==medidas[j][medidas[0].length-1]){
                    System.out.printf("%d}|",medidas[j][n]);         //Esta linea y la siguiente es para darle un formato más bonito a los datos, y necesarias para
                }else System.out.printf("%d, ",medidas[j][n]);       //recoger lo datos entre dos llaves {}.
                sumamedidas = sumamedidas + medidas[j][n];
                if (medidas[j][n] > alturamaxima){
                    alturamaxima = medidas[j][n];
                }
                if (medidas[j][n] < alturaminima){
                    alturaminima = medidas[j][n];
                }
            }
            media = sumamedidas/(float)(medidas[0].length);
            //media = (float)(sumamedidas/(1.0*medidas[0].length));
            //System.out.println(Math.round(media)+"            "+alturamaxima+"            "+alturaminima);
            System.out.printf("%6s%d%6s%9d%7s%9d%7s"+media + "\n"," ",Math.round(media),"|",alturamaxima,"|",alturaminima,"|"); //6 espacios en blanco+un entero+espacios etc
            //he tenido que usar taulaciones en vez deespacios
            //System.out.printf("%-14s %.0f %-14s %.2f %-14s %.2f\n", paises[j], media,"", alturamaxima,"", alturaminima);
            // System.out.println("|--------------------------------------------------------------------------------------------------------------|");

            alturaminima=210;
            alturamaxima =0;
            sumamedidas = 0;
        }
        //    System.out.println("|-----------|---------------------------------------------------|--------------|---------------|---------------|");

        System.out.println("|___________|___________________________________________________|______________|_______________|_______________|");


    }
}