import java.util.Comparator;

public class OrdenKmMayorMenor implements Comparator<Coche> {
    @Override
    public int compare(Coche o1, Coche o2) {
        return Integer.compare(o2.getKilometraje(), o1.getKilometraje());
        //return -o1.compareTo(o2);

    }
}
