import castelar.*;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useDelimiter("\\n");
        Persona[] personas = new Persona[2];
        int opcion=0,i=0;

        do{
            opcion=mostrarMenu();
            switch (opcion){
                case 1:
                    if (Persona.getTotalPersonas()>personas.length) inscribirPersona(personas);
                    break;
                case 2:
                    i=buscarPersona(personas);
                    if (i!=-1){
                        if (personas[i] instanceof Estudiante) {
                            System.out.println("¿De qué asignatura se va a matricular?");
                            ((Estudiante) personas[i]).matricular(teclado.next());
                        }
                        else System.out.println("Lo siento pero esa persona es un profesor");
                    }
                    break;
                case 3:
                    System.out.println("El número de estudiantes es: "+Estudiante.getTotalEstudiantes());
                    System.out.println("El número de profesores es: "+Profesor.getTotalProfesores());
                    break;
                case 4:
                    i=buscarPersona(personas);
                    if (i!=-1) personas[i].mostrarDatos();
                    break;
                case 0:
                    System.out.println("Gracias por usar mi programa");
                    break;

            }
        }while (opcion!=0);
    }

    private static int mostrarMenu(){
        Scanner teclado = new Scanner(System.in).useDelimiter("\\n");
        System.out.println("Elige una de las siguientes opciones:" +
                "\n1) Inscribir a una nueva persona" +
                "\n2) Matricular asignatura" +
                "\n3) Mostrar número de estudiantes y número de profesores" +
                "\n4) Mostrar datos de una persona" +
                "\n0) Salir del programa");
        try{
            return teclado.nextInt();
        }catch (InputMismatchException ex){
            ex = new InputMismatchException("Introducir un numero entre 0-4");
            System.out.println(ex.getMessage());
            teclado.next();
            return -1;
        }
    }

    private static void inscribirPersona(Persona[] personas){
        String nombre, dni;
        Scanner teclado = new Scanner(System.in).useDelimiter("\\n");
        System.out.println("Dime el nombre");
        nombre= teclado.next();
        System.out.println("Dime el DNI");
        dni= teclado.next();
        System.out.println("¿Vamos a inscribir a un profesor(1) o a un estudiante(2)?");
        try {
            if (teclado.nextInt()==1){
            System.out.println("Dime la especialidad");
            personas[Persona.getTotalPersonas()]= new Profesor(nombre,dni, teclado.next());
            }
            else{
                System.out.println("Dime la etapa");
                personas[Persona.getTotalPersonas()]= new Estudiante(nombre,dni, teclado.next());
            }
        }catch (InputMismatchException ex){
            ex = new InputMismatchException("Seleccionar [1] Profesor o [2] Estudiante");
            System.out.println(ex.getMessage());
            teclado.next();
        }catch (ArrayIndexOutOfBoundsException ex){
            ex = new ArrayIndexOutOfBoundsException("Se ha alcanzado el número máximo de registros");
            System.out.println(ex.getMessage());
        }
    }

    private static int buscarPersona(Persona[] personas){
        String dni;
        Scanner teclado = new Scanner(System.in).useDelimiter("\\n");
        System.out.println("Dime el DNI");
        dni=teclado.next();
        for (int i=0;i<Persona.getTotalPersonas();i++){
            if (personas[i].getDni().equalsIgnoreCase(dni)) return i;
        }
        System.out.println("Lo siento pero esa persona no existe");
        return -1;
    }
}
//InputMismatchException
//ArrayIndexOutOfBoundsException