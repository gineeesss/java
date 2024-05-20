import java.util.Comparator;

public class OrdenTin implements Comparator<Tiempo> {
    @Override
    public int compare(Tiempo o1, Tiempo o2) {
        return Float.compare(o1.getTmin(),o2.getTmin());
    }
}
