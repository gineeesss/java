import garaje.Coche;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static Scanner scr = new Scanner(System.in).useDelimiter("\\n");
    public static void main(String[] args) {
        List<Coche> empresa = new ArrayList<>(5);
        String matricula,marca,modelo;
        int opcion,kilometraje;
    do {
        menu();
        opcion=scr.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Introduce Matricula: ");
                matricula = scr.next();
                if (existeMatricula(empresa,matricula)){
                    System.out.println("Introduce Marca: ");
                    marca = scr.next();
                    System.out.println("Introduce Modelo: ");
                    modelo = scr.next();
                    System.out.println("Introduce Kilometraje: ");
                    kilometraje = scr.nextInt();
                    empresa.add(new Coche(matricula,marca,modelo,kilometraje));
                }
                else System.out.println("Esta Matrícula ya está registrada");
                break;
            case 2:
                for (Coche a: empresa){
                    System.out.println(a);
                }
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;

        }
    }while (opcion!=0);
    }
    public static void menu(){
        System.out.println("""
                [1] Introducir Coche
                [2] Mostrar todos los Coches
                [3] Mostrar Coches de una Marca
                [4] Mostrar Coches menores de Kilometraje(insertar)
                [5] Coche con mayor Kilometraje
                [6] Coches Ordenados (kilometraje < a >)
                [0] Salir
                """);
    }
//    public static void matricular();
    public static boolean existeMatricula(List<Coche> empresa,String matricula){
        for (Coche a: empresa) {
            if (a.getMatricula().equals(matricula)) return true;
        }
        return false;
    }
}
