import java.util.Comparator;

public class CompararViento implements Comparator<Registro> {
    @Override
    public int compare(Registro o1, Registro o2) {
        return -Float.compare(o1.racha,o2.racha);
    }
}
