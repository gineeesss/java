import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*List<Integer> numeros = new ArrayList<>(3);
        numeros.add(4);
        numeros.add(-3);
        numeros.add(51);
        Collections.sort(numeros);
        for (Integer i: numeros) {
            System.out.println(i);
        }*/
        List<Alumno> clase = new ArrayList<>();
        clase.add(new Alumno("Ginés",20));
        clase.add(new Alumno("Pedro",21));
        clase.add(new Alumno("Ángel",20));
        clase.add(new Alumno("Gabriel",33));
        clase.add(new Alumno("Retrete",8));
        clase.add(new Alumno("Pedro",18));
        clase.add(new Alumno("Ricardo",18));
        clase.add(new Alumno("Miau",177));
        clase.add(new Alumno("Pepe",25));
        /*Collections.sort(clase);
        for(Integer i: clase){
            System.out.println(i); -- da error porque como tiene dos propiedades, no sabe cual es el criterio de ordenación
        }*/
        Collections.sort(clase);
        System.out.println(clase);
        Collections.sort(clase,(new OrdenEdadAscendente()));
        System.out.println(clase);
        Collections.sort(clase,(new OrdenCantidadLetraDeterminada()));
        System.out.println(clase);
    }
}

