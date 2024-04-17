import Paquete.Alumno;
import Paquete.Notas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scr = new Scanner(System.in).useDelimiter("\\n");
    public static void main(String[] args) {
        List<Alumno> clase = new ArrayList<>(28);
        String nombre;
        int opcion;
        int indice;
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
            case 5:
                System.out.println("Nombre del alumno a borrar: ");
                clase.remove(buscarAlumno(clase,scr.next()));
                System.out.println("Se ha eliminado el alumno");
                break;
            /*case 6:
                System.out.println("Nombre del alumno a borrar: ");
                buscarAlumno(clase,scr.next());
                //indice = buscarAlumno(clase,scr.next());
                //Alumno persona = clase.get(indice);
                if (buscarNota(clase.get(buscarAlumno(clase,scr.next())).getNota() , scr.next()) != null){
                   // buscarNota(clase.get(buscarAlumno(clase,scr.next())).getNota().remove();
                }
                break;*/
            case 6:
                System.out.println("Nombre Alumno");
                indice = buscarAlumno(clase, scr.next());
                if (indice==-1) System.out.println("no existe");
                else {
                    System.out.println("Modulo: ");
                    modulo=scr.next();
                    /*for (Notas j:clase.get(indice).getNota()){
                        if (j.getModulo().equalsIgnoreCase(modulo)) clase.get(indice).getNota().remove(j);
                    }*/
                    Iterator<Notas> iterador = clase.get(indice).getNota().iterator();
                    while (iterador.hasNext()){
                        if (iterador.next().getModulo().equalsIgnoreCase(modulo)) iterador.remove();
                    }
                }
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
                   [5] Eliminar a un Alumno a partir de su nombre
                   [6] Eliminar nota(objeto) de un Alumno
                   [0] Salir del Programa
                """);
    }
    private static int buscarAlumno(List<Alumno> clase, String nombre){
        for (Alumno a: clase) {
            if (a.getNombre().equalsIgnoreCase(nombre)) return clase.indexOf(a);
        }
        return -1;
    }
    private static Notas buscarNota(List<Notas> notas, String modulo){
        for (Notas a: notas) {
            if (a.getModulo().equalsIgnoreCase(modulo)) return a;
        }
        return null;
    }
}
