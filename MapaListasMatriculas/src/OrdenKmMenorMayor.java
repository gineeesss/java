import java.util.Comparator;

public class OrdenKmMenorMayor implements Comparator<Coche> {
    @Override
    public int compare(Coche o1, Coche o2) {
        return -o1.compareTo(o2); //el - revierte el orden
    }
}
