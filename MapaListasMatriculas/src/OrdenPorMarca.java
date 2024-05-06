import java.util.Comparator;

public class OrdenPorMarca implements Comparator<Coche> {
    @Override
    public int compare(Coche o1, Coche o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}
