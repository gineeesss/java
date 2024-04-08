import java.util.*;

public class Main {
    public static Scanner scr = new Scanner(System.in).useDelimiter("\\n");
    public static void main(String[] args) {
        //TIPO(Lista(Objeto)<tipo> nombre_var = valor(new Objeto(constructor);
        List<Integer> numeros = new ArrayList<>(3);
        ArrayList<Integer> cosita = new ArrayList<>();
        ArrayList<Integer> numerosOrdenados;
        Iterator<Integer> iterador;
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
                    mostrarColeccion(numeros);
                    break;
                case 3:
                    //mostrarColeccion(new ArrayList<Integer>(numeros));
                    numerosOrdenados = new ArrayList<>(numeros);
                    numerosOrdenados.sort(null);
                    //lista.clear();
                    //lista.addAll(numeros);
                    Collections.sort(numerosOrdenados);
                    mostrarColeccion(numerosOrdenados);
                    break;
                case 4:
                    numerosOrdenados = new ArrayList<>(numeros);
                    numerosOrdenados.sort(Comparator.reverseOrder()); //sort requiere de un comparador, por lo que lo ideal
                    //es usar un metodo que devuelva un comparador --> interfaz Comparator
                    mostrarColeccion(numerosOrdenados);
                    break;
                case 5:
                    //Set<Integer> conjuntoSinRepetir = new HashSet<>(numeros);
                    //mostrar(conjuntoSinRepetir);
                    mostrarColeccion(new HashSet<>(numeros));
                    break;
                case 6:
                    System.out.println("Posición a borrar: ");
                    cosita.add(numeros.remove(scr.nextInt()));
                    mostrarLista(cosita);
                    break;
                case 7:
                    int borrar = scr.nextInt();
                    iterador = numeros.iterator();
                    while(iterador.hasNext()){
                        if(iterador.next().intValue()==borrar) iterador.remove();
                    }
                    break;
                case 8:
                    iterador = numeros.iterator();
                    while(iterador.hasNext()){
                        if (iterador.next()%2==0) iterador.remove();
                    }
                    break;
                case 9:
                    /*int suma=0;
                    for(int i=0;i<numeros.size();i++){
                        suma+=numeros.get(i);
                    }
                    System.out.println("La suma de todos los números de la Colección es: "+ suma);*/
                    sumarColeccion(numeros);
                    break;
            }
        }while(opcion!=0);
    }
    public static void menu(){
        System.out.println("\n[0] Salir del programa" +
                "\n[1] Añadir Número" +
                "\n[2] Mostrar la serie original de números que haya" +
                "\n[3] Mostrar la serie ordenada de menor a mayor" +
                "\n[4] Mostrar la serie ordenada de mayor a menor" +
                "\n[5] Mostrar la serie de números pero sin que haya números repetidos" +
                "\n[6] Quitar un número de la lista indicando la posición" +
                "\n[7] Quitar un número de la lista indicando el número" +
                "\n[8] Quitar los números pares" +
                "\n[9] Sumar todos los elementos");
    }
    public static void mostrarLista(Collection<Integer> numeros){
        System.out.println("Lista : ");
        for (Integer a: numeros) {
            System.out.print(a+" ");
        }
    }
    public static <T> void mostrarColeccion(Collection<T> numeros){
        System.out.println("Colección: ");
        for (T a: numeros) {
            System.out.print(a+" ");
        }
    }
    public static void sumarColeccion(Collection<Integer> numeros){
        int suma=0;
        for (Integer a: numeros) {
            suma += a;
        }
        System.out.println("La suma de todos los números de la Colección es: "+ suma);
    }
}

// comparar y ordenar





