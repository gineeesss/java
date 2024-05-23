import java.util.Comparator;

public class OrdenTmin implements Comparator<Tiempo> {
    @Override
    public int compare(Tiempo o1, Tiempo o2) {
        return o1.getTmin().compareTo(o2.getTmin());
    }
}
