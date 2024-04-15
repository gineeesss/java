package Paquete;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Alumno {
    private String nombre;
    private List<Notas> nota = new ArrayList<>();

    public Alumno(String nombre){
        this.nombre = nombre;
        addNota();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Notas> getNota() {
        return nota;
    }
    private void addNota(){
        Scanner scr = new Scanner(System.in).useDelimiter("\\n");
        boolean masnotas = false;
        do{
        System.out.println("Introducir modulo: ");
        String modulo = scr.next();
        System.out.println("Introducir nota: ");
        this.nota.add(new Notas(modulo,scr.nextFloat()));
        masnotas=false;
        System.out.println("¿Quieres añadir otra nota?");
        if (scr.next().equalsIgnoreCase("si")) masnotas = true;
        }while (masnotas);
    }

    @Override
    public String toString() {
        return "Nombre='" + nombre + '\'' +
                ", nota=" + nota.toString() ;
    }
    public float notaMedia(){
        float sumatorio = 0f;
        for (Notas a: nota) {
            sumatorio+=a.getNota();
        }
        return sumatorio/nota.size();
    }

/* para que este metodo funcione, la lista tiene que estar declarada como estatic
    public static float notaMediaModulo(String modulo){
        float sumatorio = 0f;
        int alumnosModulo=0;
        for (Notas a: nota) {
            if(a.getModulo().equalsIgnoreCase(modulo)) {
                sumatorio += a.getNota();
                alumnosModulo+=1;
            }
        }
        return sumatorio/alumnosModulo;
    }
 */
}
