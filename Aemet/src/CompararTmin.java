import java.util.Comparator;

public class CompararTmin implements Comparator<Registro> {
    @Override
    public int compare(Registro o1, Registro o2) {
        return Float.compare(o1.tmin,o2.tmin);
    }
}
