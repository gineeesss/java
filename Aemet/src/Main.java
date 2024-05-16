import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner ceeseuve;
    static PrintWriter log;
    static List<Registro> registros;
    static String linea;
    static String[] celdas;
    public static void main(String[] args) {
        try {
            log = new PrintWriter(new FileWriter("log.txt",true));
            ceeseuve = new Scanner( new File("Aemet_Badajoz_2023.csv"));
            registros = new ArrayList<>();

            ceeseuve.nextLine();
            while (ceeseuve.hasNextLine()) {
                linea = ceeseuve.nextLine();
                celdas = linea.split(";");
                registros.add(new Registro(celdas));
                System.out.print(celdas[0]);
                System.out.print(celdas[1]);
                System.out.print(celdas[2]);
                System.out.print(celdas[3]);
                System.out.println();
            }
        } catch (IOException e) {
            Date date = new Date();
            log.print(date);
            log.println(e.getMessage());
        }finally {
            if (log!=null) log.close();
            if (ceeseuve!=null) ceeseuve.close();
        }
    }
    static void temperaturaMedia(int mes){
    }
}