import Paquete.Alumno;
import Paquete.Notas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scr = new Scanner(System.in).useDelimiter("\\n");
    public static void main(String[] args) {
        List<Alumno> clase = new ArrayList<>(28);
        String nombre;
        int opcion;
        int indice;
        float notamedia;
        String modulo;
        do{
            menu();
            opcion=scr.nextInt();
        switch(opcion){
            case 1:
                System.out.println("Dime el nombre del alumno: ");
                nombre = scr.next();
                if (buscarAlumno(clase,nombre)>=0) System.out.println("Lo siento, ya existe");
                else{
                    clase.add(new Alumno(nombre));
                }
                break;
            case 2:
                System.out.println("Dime el nombre del alumno: ");
                nombre=scr.next();
                indice=buscarAlumno(clase,nombre);
                if (indice<0) System.out.println("No exsite");
                else {
                    System.out.println("La nota de "+nombre+" es: "+clase.get(indice).toString());
                }
                break;
            case 3:
                System.out.println("Dime el nombre del alumno: ");
                nombre=scr.next();
                indice=buscarAlumno(clase,nombre);
                if (indice<0) System.out.println("No exsite");
                else{
                    System.out.println("La nota media del alumno "+nombre+" es: "+clase.get(indice).notaMedia());
                }
                break;
            case 4:
               /* System.out.println("Introducir Módulo para calcular la nota media");
                modulo=scr.next();
                System.out.println("La nota media del módulo "+modulo+" es: "+Alumno.notaMediaModulo(modulo));
*/
                //opcion 2

                float sumatorio=0f;
                int alumnosNum=0;
                System.out.println("Introducir Módulo: ");
                modulo = scr.next();
                for (Alumno a:clase){
                    for(Notas s: a.getNota()){
                        if (s.getModulo().equalsIgnoreCase(modulo)){
                            sumatorio += s.getNota();
                            alumnosNum+=1;
                        }
                    }
                }
                System.out.println("La nota media del Módulo: "+modulo+" es: "+sumatorio/alumnosNum);
                break;

        }
        }while (opcion!=0);
        System.out.println("Programa Finalizado");
    }
    private static void menu(){
        System.out.println("""
                   [1] Añadir nuevo Alumno
                   [2] Mostrar notas de un Alumno
                   [3] Mostrar nota media de un Alumno
                   [4] Calcular la nota media de un Módulo
                   [0] Salir del Programa
                """);
    }
    private static int buscarAlumno(List<Alumno> clase, String nombre){
        for (Alumno a: clase) {
            if (a.getNombre().equalsIgnoreCase(nombre)) return clase.indexOf(a);
        }
        return -1;
    }
}
