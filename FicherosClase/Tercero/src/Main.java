import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    static Scanner numerosNoOrden;
    static PrintWriter log, numerosOrdenados;
    public static void main(String[] args) {
        try{
            log = new PrintWriter(new FileWriter("log.txt",true));
            numerosNoOrden = new Scanner(new File("numeros.txt")).useDelimiter(";");
            numerosOrdenados = new PrintWriter("numerosOrdenados.txt");
            List<Integer> listaNumeros = new ArrayList<>();
            while (numerosNoOrden.hasNext()){
                listaNumeros.add(numerosNoOrden.nextInt());
            }
            Collections.sort(listaNumeros);
            for (Integer a: listaNumeros) {
                numerosOrdenados.print(a+";");
            }
            numerosOrdenados.flush();
        }catch (IOException e){
            Date fecha = new Date();
            log.print(fecha);
            log.println(e.getMessage());
            log.flush();
        }finally {
            if (log !=null) log.close();
            if (numerosOrdenados!=null)numerosOrdenados.close();
            if (numerosNoOrden!=null)numerosNoOrden.close();
        }
    }
}
