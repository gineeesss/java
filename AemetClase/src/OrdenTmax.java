import java.util.Comparator;

public class OrdenTmax implements Comparator<Tiempo> {
    @Override
    public int compare(Tiempo o1, Tiempo o2) {
        return Float.compare(o1.getTmax(),o2.getTmax());
    }
}
