import estudiante.Estudiante;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Estudiante[] estudiante = new Estudiante[5];

        int opcion;
        do {
            menu();
            opcion = scr.nextInt();
            switch (opcion) {
                case 1:
                    estudiante[Estudiante.getNumeroexpedentes()] = new Estudiante(scr.next(), LocalDate.of(scr.nextInt(),scr.nextInt(),scr.nextInt()));
                    break;
                case 2:
                    for (int i =0;i<Estudiante.getNumeroexpedentes();i++){
                        System.out.println("Estudiante nº"+(i+1));
                        System.out.println(estudiante[i].toString());
                    }
                    break;
                case 3:
                    System.out.println("El número de matriculados es: "+Estudiante.getNumeroexpedentes());
                    break;
            }
        }while (opcion!=0);








    }


    public static void menu(){
        System.out.println("JEFATURA");
        System.out.println("[1] MATRICULAR NUEVO ESTUDIANTE \n(Por favor seguir este formato: Nombre: [Nombre] Fecha: [aaaa,mm,dd])");
        System.out.println("[2] INFORMACIÓN ESTUDIANTES");
        System.out.println("[3] NÚMERO DE MATRICULADOS");
    }
}
