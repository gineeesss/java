import garaje.Coche;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static Scanner scr = new Scanner(System.in).useDelimiter("\\n");
    public static List<Coche> empresa = new ArrayList<>(5);
    public static void main(String[] args) {
        int opcion;
    do {
        menu();
        opcion=scr.nextInt();
        switch (opcion){
            case 1:
                addCoches();
                break;
            case 2:
                for (Coche a: empresa){
                    System.out.println(a);
                }
                break;
            case 3:
                String marcaBuscar = scr.next();
                for (Coche a: empresa){
                    if (a.getMarca().equalsIgnoreCase(marcaBuscar)) System.out.println(a);
                }
                break;
            case 4:
                int menosKmBuscar = scr.nextInt();
                for (Coche a: empresa){
                    if (a.getKilometraje()<menosKmBuscar) System.out.println(a);
                }
                break;
            case 5:
                int masKm=0,indiceMasKm=-1;
                for (Coche a: empresa) {
                    if (a.getKilometraje()>=masKm) {
                        masKm = a.getKilometraje();
                        indiceMasKm=empresa.indexOf(a);
                    }
                }

                System.out.println("El coche con más km es:" + empresa.get(indiceMasKm).toString());
                break;
            case 6:
                Collections.sort(empresa);
                System.out.println(empresa);
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
                [7] Coches Ordenados (kilometraje < a >)
                [0] Salir
                """);
    }
//    public static void matricular();
    public static boolean existeMatricula(String matricula){
        for (Coche a: empresa) {
            if (a.getMatricula().equals(matricula)) return true;
        }
        return false;
    }public static int extraerMatricula(String matricula){
        for (Coche a: empresa) {
            if (a.getMatricula().equals(matricula)) return empresa.indexOf(a);
        }
        return -1;
    }

    public static void  addCoches(){
        String matricula,marca,modelo;
        System.out.println("Introduce Matricula: ");
        matricula = scr.next();
        if (!existeMatricula(matricula)){
            System.out.println("Introduce Marca: ");
            marca = scr.next();
            System.out.println("Introduce Modelo: ");
            modelo = scr.next();
            System.out.println("Introduce Kilometraje: ");
            empresa.add(new Coche(matricula,marca,modelo,scr.nextInt()));
        }
        else System.out.println("Esta Matrícula ya está registrada");
    }
}
