import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static Scanner scr = new Scanner(System.in).useDelimiter("\\n");
    public static void main(String[] args) {
        Set<String> diccionario = new LinkedHashSet<>();
        String aniadir;
        do{
            aniadir= scr.next();
            if (!diccionario.add(aniadir)) {
                System.out.println("La palabra "+aniadir+" ya existe en el diccionario.");
            }
        }while(!aniadir.equalsIgnoreCase("fin"));
        System.out.println(diccionario);
    }
}

