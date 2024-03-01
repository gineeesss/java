import personal.Estudiante;
import personal.Persona;
import personal.Profesor;

import java.util.Scanner;

public class Main {
    public static Scanner scr = new Scanner(System.in).useDelimiter("\\n");
    public static void main(String[] args) {
        Persona[] instituto = new Persona[5];

        int opcion = 5;
        do{
            menu();
            opcion =scr.nextInt();
            switch (opcion){
                case 1:
                    crearPersona(instituto);
                    break;
                case 2:
                    matricularAsignatura(instituto);
                    break;
                case 3:
                    mostrarDatosPersonas();
                    break;
                case 4:
                    mostrarPersona(instituto);
                    break;
            }
        }while (opcion!=5);
    }
    public static void mostrarDatosPersonas(){
        System.out.println("Total de Profesores: "+Profesor.getTotalProfesores());
        System.out.println("Total de Estudiantes: "+Estudiante.getTotalEstudiantes());
    }
    public static void crearPersona(Persona[] insti){
        System.out.println("Introducir DNI: ");
        String dni = scr.next();
        if (buscarPersona(insti,dni)==-1){
            System.out.println("[1] Crear Profesor \n[2] Crear Estudiante");
            int crear=scr.nextInt();
            System.out.println("Introducir Nombre: ");
            String nombre = scr.next();
            if (crear==1){
                System.out.println("Introducir Espeialidad: ");
                String especialidad = scr.next();
                insti[Persona.getTotalPersonas()]=new Profesor(nombre,dni,especialidad);
            } else if (crear==2) {
                System.out.println("Introducir Etapa: ");
                String etapa = scr.next();
                insti[Persona.getTotalPersonas()]=new Estudiante(nombre,dni,etapa);
            }
        }else System.out.println("Esta persona ya existe en el regstro");
    }
    private static int buscarPersona(Persona[] insti, String dni){
        for (int i=0; i<Persona.getTotalPersonas();i++){
            if (dni.equalsIgnoreCase(insti[i].getDni())){
                return i ;
            }
        }return -1;
    }
    public static void matricularAsignatura(Persona[] insti){
        System.out.println("Introducir dni: ");
        String dni = scr.next();
        int personaPosicion=buscarPersona(insti,dni);
        if (personaPosicion!=-1 ){
            if (insti[personaPosicion] instanceof Estudiante){
                System.out.println("Introducir asignatura a matricular: ");
                String asignatura = scr.next();
                ((Estudiante) insti[personaPosicion]).matricular(asignatura);
            }else System.out.println("Esta persona no es un Estudiante");
        } else System.out.println("La Persona con el dni: "+dni+" no existe en el registro.");
    }
    public static void mostrarPersona(Persona[] insti){
        System.out.println("Introduir DNI: ");
        String dni = scr.next();
        int existe = buscarPersona(insti,dni);// guarda la posicion en el array del dni, sino guarda -1, significa que no existe
        if (existe!=-1){
            insti[existe].mostrarDatos();
        }else System.out.println("La persona con el dni: "+dni+" no existe en el sistema");
    }
    public static void menu(){
        System.out.println("[1] Inscirbir persona");
        System.out.println("[2] Matricular Asignatura");
        System.out.println("[3] Mostrar numero de estuddiantes y profesores");
        System.out.println("[4] Mostrar datos Persona");
        System.out.println("[5] Salir");
    }
}
