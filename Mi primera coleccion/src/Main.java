import java.util.*;

public class Main {
    public static Scanner scr = new Scanner(System.in).useDelimiter("\\n");
    public static void main(String[] args) {
        //TIPO(Lista(Objeto)<tipo> nombre_var = valor(new Objeto(constructor);
        List<Integer> numeros = new ArrayList<>(3);
        int opcion;
        do{
            menu();
            opcion= scr.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Siguiente Número Lista: ");
                    numeros.add(scr.nextInt());
                    break;
                case 2:
                    mostrarLista(numeros);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    Set<Integer> conjuntoSinRepetir = new HashSet<>(numeros);
                    mostrar(conjuntoSinRepetir);
                    break;
                case 6:
                    break;

            }
        }while(opcion!=0);
    }
    public static void menu(){
        System.out.println("\n[0] Salir del programa" +
                "\n[1] Añadir Número" +
                "\n[2] Mostrar la serie original de números que haya" +
                "\n[5] Mostrar la serie de números pero sin que haya números repetidos");
    }
    public static void mostrarLista(Collection<Integer> numeros){
        System.out.println("Lista Original: ");
        for (Integer a: numeros) {
            System.out.print(a+" ");
        }
    }
    public static <T> void mostrar(Collection<T> numeros){
        System.out.println("Lista Original: ");
        for (T a: numeros) {
            System.out.print(a+" ");
        }
    }
}










/*  Mostrar la serie ordenada de menor a mayor
    Mostrar la serie ordenada de mayor a menor
    Quitar un número de la lista indicando la posición
    Quitar un número de la lista indicando el número
    Quitar los números pares
    Suma todos los números de la lista*/