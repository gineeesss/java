import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static Scanner scr = new Scanner(System.in).useDelimiter("\\n");
    public static void main(String[] args) {
        Map<String,String > dgt = new HashMap<>();
        dgt.put("es","España");
        dgt.put("fr","Francia");
        dgt.put("pt","Portugal");
        dgt.put("de","Alemania");
        dgt.put("pl","Polonia");
        dgt.put("fn","Finlandia");
        int oopcion;
        String claveIns;
        String valorIns;
        boolean borrado;
        char letra;
        do {
            menu();
            oopcion = scr.nextInt();
            switch (oopcion){
                case 1:
                    System.out.println("Introducir Clave: ");
                    claveIns= scr.next();
                    if (!dgt.containsKey(claveIns)) {
                        System.out.println("Introducir Valor: ");
                        dgt.put(claveIns,scr.next());
                    }else System.out.println("Clave existente, introducir otra.");
                    break;
                case 2:
                    System.out.println("Introducir clave a borar: ");
                    if (dgt.remove(scr.next())==null) System.out.println("No se ha encontrado la clave");
                    else System.out.println("Eliminado");
                    break;
                case 3:
                    borrado = false;
                    System.out.println("Introducir valor a borrar");
                    valorIns = scr.next();
                    Iterator<String> iterador = dgt.values().iterator();
                    while (iterador.hasNext()){
                        if (iterador.next().equalsIgnoreCase(valorIns)) {
                            iterador.remove();
                            borrado=true;
                        }
                    }
                    if (borrado) System.out.println("Borrado Correctamente: "+valorIns);
                    else System.out.println("No se ha encontrado");
                    break;
                case 4:
                    System.out.println(dgt);
                    break;
                case 5:
                    claveIns = scr.next();
                    String valorBorrado=dgt.replace(claveIns,scr.next());
                    if (valorBorrado==null) System.out.println("No se ha encontrado la clave: "+claveIns);
                    else System.out.println("Valor eliminado: "+valorBorrado);
                    break;
                case 6:
                    System.out.println("Introducir letra: ");
                    letra=scr.next().charAt(0);
                    break;
            }
        }while (oopcion!=0);

    }
    public static void menu(){
        System.out.println("""
                [1] Añadir un país 
                [2] Borrar un país (a partir de su clave)
                [3] Borrar un país (a partir de su valor)
                [4] Mostrar todos los países
                [5] Cambiar el valor de una clae (redireccionar)
                [6] Mostrar los paises que comencen por una letra concreta
                [0] Salir del programa
                """);
    }
}
