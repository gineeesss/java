import java.lang.reflect.GenericArrayType;
import java.util.*;

public class Main {
    public static Scanner scr = new Scanner(System.in).useDelimiter("\\n");
    public static Map<String,Coche> garaje = new HashMap<>();
    public static void main(String[] args) {
        int opcion,kilometraje;
        String matricula = null,marca,modelo;
        do {
            menu();
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
                    System.out.println("Introducir matricula: ");
                    matricula=scr.next();
                    if (existeCarro(matricula)) System.out.println("Se eliminó el coche con matricula: "+garaje.remove(matricula));
                    else System.out.println("No se econtró la matricula");
                    break;
                case 3:
                    System.out.println("Introducir marca a buscar: ");
                    marca = scr.next();
                    for (Coche a: garaje.values()){
                        if (a.getMarca().equalsIgnoreCase(marca)) System.out.println(a);
                    }
                    break;
                case 4:
                    System.out.println("Introducir kilometros a buscar los que tienen menos de: ");
                    kilometraje = scr.nextInt();
                    for (Coche a: garaje.values()){
                        if (a.getKilometraje() <kilometraje) System.out.println(a);
                    }
                    break;
                case 5:
                    int kilometrajeMayor = 0;
                    for (Coche a: garaje.values()){
                        if (a.getKilometraje() > kilometrajeMayor) matricula=a.getMatricula();
                    }
                    System.out.println("El coche con mayor km es: \n"+garaje.get(matricula));
                    break;
                case 6:
                    List<Coche> listilla = new ArrayList<>(garaje.values());
                    Collections.sort(listilla, new OrdenKmMenorMayor());
                    for (Coche coche: listilla) {
                        System.out.println(coche);
                    }
                        /*for (ArrayList<Coche> a: listilla){
                            for (int i =0; i<listilla.size();i++){
                                if (garaje.get()==listilla[i]) System.out.println();
                            }
                        }*/

                    System.out.println(garaje);
                    //,(new OrdenKmMenorMayor())
                    break;
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
    public static boolean existeCarro(String matricula){
        return garaje.containsKey(matricula);
    }
}
