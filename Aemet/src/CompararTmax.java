import java.util.Comparator;

public class CompararTmax implements Comparator<Registro> {
    @Override
    public int compare(Registro o1, Registro o2) {
        return -Float.compare(o1.tmax,o2.tmax);
    }
}
