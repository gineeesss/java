import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Leer {
    public static Scanner scr = new Scanner(System.in).useDelimiter("\\n");
    public static Map<String,Coche> garaje = new HashMap<>();
    static Scanner fichero;
    static PrintWriter log;
    public static void main(String[] args) {
        int opcion,kilometraje;

        String matricula = null,marca,modelo;
        List<Coche> listilla;
        do {
            menu2();
            opcion= scr.nextInt();
            switch (opcion){
                case 1:
                    leerFichero();
                    break;
                case 2:
                    for (Coche a: garaje.values())System.out.println(a);
                    break;
                case 3:
                    System.out.println("Matricula a borrar: ");
                    if (garaje.remove(scr.next())==null) System.out.println("No se ha encontrado la matricula");
                    else System.out.println("Matricula borrada correctamente");
                    break;
                case 4:
                    List<Coche> cochesOrdenados = new ArrayList<>(garaje.values());
                    cochesOrdenados.sort(new OrdenKmMayorMenor());
                    for (Coche a: cochesOrdenados) System.out.println(a);
                    break;
            }
        }while (opcion!=0);
    }
    public static void menu2(){
        System.out.println("""
                [1] Leer Información Fichero
                [2] Mostrar Colección
                [3] Eliminar un coche de la Colección
                [0] Salir
                """);
    }
    public static boolean existeCarro(String matricula){
        return garaje.containsKey(matricula);
    }
    /*private static void escribirFichero(){
        try {
            log = new PrintWriter(new FileWriter("datos_coches.txt",true));
            fichero = new PrintWriter(new FileWriter("datos_coches.txt",true));
            for (Coche a:garaje.values()){
                fichero.println(a.escribir());
            }
            fichero.flush();
        } catch (IOException e) {
            Date fecha = new Date();
            log.print(fecha);
            log.println(e.getMessage());
        }finally {
            if (log !=null) log.close();
            if (fichero!=null) fichero.close();
        }
    }*/
    private static void leerFichero(){
        try {
            String[] lectura;
            log = new PrintWriter(new FileWriter("datos_coches.txt",true));
            fichero = new Scanner(new File("fichero.txt"));
            while (fichero.hasNext()){
                lectura=fichero.nextLine().split(";");
                garaje.putIfAbsent(lectura[0],new Coche(lectura[0],lectura[1],lectura[2],(Integer.parseInt(lectura[3]))));
            }
        } catch (IOException e) {
            Date fecha = new Date();
            log.print(fecha);
            log.println(e.getMessage());
        }finally {
            if (log !=null) log.close();
        }
    }
}
