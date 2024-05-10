import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Escribir {
    public static Scanner scr = new Scanner(System.in).useDelimiter("\\n");
        public static Map<String,Coche> garaje = new HashMap<>();
        static PrintWriter fichero,log;
        public static void main(String[] args) {
            int opcion,kilometraje;

        String matricula = null,marca,modelo;
        List<Coche> listilla;
        do {
            menu2();
            opcion= scr.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Introducir matricula: ");
                    matricula=scr.next();
                    if (!existeCarro(matricula)){
                        System.out.println("Introducir marca: ");
                        marca=scr.next();
                        System.out.println("Introducir modelo: ");
                        modelo=scr.next();
                        System.out.println("Introducir kilometraje: ");
                        kilometraje=scr.nextInt();
                        garaje.put(matricula,new Coche(matricula,marca,modelo,kilometraje));
                    }else System.out.println("Esta matrícula ya está registrada");
                    break;
                case 2:
                    escribirFichero();
                    break;
                /*case 2:
                    System.out.println("Introducir matricula: ");
                    matricula=scr.next();
                    if (existeCarro(matricula)) System.out.println("Se eliminó el coche con matricula: "+garaje.remove(matricula));
                    else System.out.println("No se econtró la matricula");
                    break;
                case 3:
                    for (Coche a: garaje.values()){
                        System.out.println(a);
                    }
                    break;
                case 4:
                    System.out.println("Introducir marca a buscar: ");
                    marca = scr.next();
                    for (Coche a: garaje.values()){
                        if (a.getMarca().equalsIgnoreCase(marca)) System.out.println(a);
                    }

                    break;
                case 5:
                    System.out.println("Introducir kilometros a buscar los que tienen menos de: ");
                    kilometraje = scr.nextInt();
                    for (Coche a: garaje.values()){
                        if (a.getKilometraje() <kilometraje) System.out.println(a);
                    }
                    break;
                case 6:
                    listilla = new ArrayList<>(garaje.values());
                    Collections.sort(listilla);
                    System.out.println("El coche con mayor km es: \n"+listilla.get(listilla.size()-1));
                    //Esta opcion es para hacerla si no se sabe ordenar
                    //int kilometrajeMayor = 0;
                    //for (Coche a: garaje.values()){
                    //    if (a.getKilometraje() > kilometrajeMayor) matricula=a.getMatricula();
                    //}
                    //System.out.println("El coche con mayor km es: \n"+garaje.get(matricula));
                    break;
                case 7:
                    listilla = new ArrayList<>(garaje.values());
                    Collections.sort(listilla, new OrdenKmMenorMayor());

                    Collections.sort(new ArrayList<>(garaje.values()), (new OrdenKmMenorMayor()));
                    for (Coche coche: listilla) {
                        System.out.println(coche);
                    }
                    System.out.println(garaje);
                    //,(new OrdenKmMenorMayor())
                    Map<Coche,String> cochesOrdenKmDesc = new TreeMap<>(); //la clave es por lo que se ordena
                    for (String a:garaje.keySet()) cochesOrdenKmDesc.put(garaje.get(a),a);
                    break;
                */
            }
        }while (opcion!=0);
    }
    public static void menu(){
        System.out.println("""
                [1] Introducir Coche
                [2] Borrar Coche
                [3] Mostrar todos los Coches
                [4] Mostrar Coches de una Marca
                [5] Mostrar Coches menores de Kilometraje(insertar)
                [6] Coche con mayor Kilometraje
                [7] Coches Ordenados (kilometraje descendene))
                [0] Salir
                """);
    }
    public static void menu2(){
        System.out.println("""
                [1] Introducir Coche
                [2] Volver Datos a Fichero
                [0] Salir
                """);
    }
    public static boolean existeCarro(String matricula){
        return garaje.containsKey(matricula);
    }
    private static void escribirFichero(){
        try {
            log = new PrintWriter(new FileWriter("fichero.txt",true));
            fichero = new PrintWriter(new FileWriter("fichero.txt",true));
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
    }
}
