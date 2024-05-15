import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static PrintWriter numAleatorios, log;
    public static void main(String[] args) {
        try{
            log = new PrintWriter(new FileWriter("log.txt",true));
            numAleatorios = new PrintWriter("numeros.txt");
            Set<Integer> numerosSet = new HashSet<>();
            while (numerosSet.size()<20){
                int numero = (int) (Math.random()*100+1);
                if (numerosSet.add(numero)) numAleatorios.println(numero);
            }
        }catch (IOException e){
            Date fecha = new Date();
            log.print(fecha);
            log.println(e.getMessage());
            log.flush();
        }finally {
            if (log !=null) log.close();
            if (numAleatorios != null) numAleatorios.close();
        }
    }
}
