import java.util.*;

public class Main {
    static Scanner scr = new Scanner(System.in).useDelimiter("\\n");
    public static void main(String[] args) {
        Set<String> diccionario = new LinkedHashSet<>(0);
        String aniadir;
        aniadir="";
        while(!aniadir.equalsIgnoreCase("fin")){
            System.out.print("Introducir palabra posición "+diccionario.size()+": ");
            aniadir= scr.next();
            if (!diccionario.add(aniadir.toLowerCase())) {
                System.out.println("La palabra "+aniadir+" ya existe en el diccionario.");
            }
        }
        System.out.println(diccionario);
        System.out.println(diccionario);
        /* CONJUNTO ORDENADO DE MANERA PERUANA
        List<String> dicionarioLista = new ArrayList(diccionario);
        Collections.sort(dicionarioLista);
        Set<String> conjuntoOrdenado = new LinkedHashSet<>(dicionarioLista);
        System.out.println(conjuntoOrdenado);
        */
        Set<String> diccionarioOrdenado = new TreeSet<>(diccionario);
        System.out.println(diccionarioOrdenado);

        //Mejor manera, como solo se usa una vez
        System.out.println(new TreeSet<>(diccionario));


        //Conjunto ordenado por tamaño de palara < a >
        Set<String> otroDiccionario = new TreeSet<>(new OrdenTamañoParole());
        otroDiccionario.addAll(diccionario);
        System.out.println(otroDiccionario);
    }
}

