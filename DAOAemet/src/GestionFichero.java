import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public abstract class GestionFichero {
    static Map<String, String[]> datos = null;
    static Scanner fichero;
    static String[] linea;
    public static Map<String, String[]> leerFichero(){
        try {
            datos = new HashMap<>();
            fichero = new Scanner(new File("Aemet_Badajoz_2023.csv"));
            fichero.nextLine();
            while (fichero.hasNext()){
                linea = fichero.next().split(";");
                datos.putIfAbsent(linea[0],linea);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            if (fichero!=null) fichero.close();
        }
        return datos;
    }
}
