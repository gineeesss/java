import java.util.Comparator;

public class OrdenTmax implements Comparator<Tiempo> {
    @Override
    public int compare(Tiempo o1, Tiempo o2) {
        return o1.getTmax().compareTo(o2.getTmax());
    }
}
