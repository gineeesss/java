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
            log = new PrintWriter(new FileWriter("logC.txt",true));
            fichero = new PrintWriter(new FileWriter("ficheroC.txt",true));
            ficheroUno = new Scanner(new File("ficheroUnoC.txt"));
            ficheroDos = new Scanner(new File("ficheroDosC.txt"));
            while (ficheroUno.hasNext() | ficheroDos.hasNext()){
                if (ficheroUno.hasNextLine()) fichero.println(ficheroUno.nextLine());
                if (ficheroDos.hasNextLine()) fichero.println(ficheroDos.nextLine());
            }
        }catch (IOException e){
            Date fecha = new Date();
            log.print(fecha);
            log.println(e.getMessage());
        }finally {
            if (log !=null) log.close();
            if(fichero!=null) fichero.close();
        }

    }
}
