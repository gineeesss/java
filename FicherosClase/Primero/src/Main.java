import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

public class Main {
    static Scanner ficheroUno,ficheroDos;
    static PrintWriter fichero,log;
    public static void main(String[] args) {
        try{
            log = new PrintWriter(new FileWriter("log.txt",true));
            fichero = new PrintWriter(new FileWriter("fichero.txt"));
            ficheroUno = new Scanner(new File("ficheroUno.txt"));
            ficheroDos = new Scanner(new File("ficheroDos.txt"));
            while (ficheroUno.hasNext() | ficheroDos.hasNext()){
                if (ficheroUno.hasNextLine()) fichero.println(ficheroUno.nextLine());
                if (ficheroDos.hasNextLine()) fichero.println(ficheroDos.nextLine());
            }
            fichero.flush();
        }catch (IOException e){
            Date fecha = new Date();
            log.print(fecha);
            log.println(e.getMessage());
            log.flush();
        }finally {
            if (log !=null) log.close();
            if(fichero!=null) fichero.close();
            if (ficheroUno!=null)ficheroUno.close();
            if (ficheroDos!=null)ficheroDos.close();
        }
    }
}
