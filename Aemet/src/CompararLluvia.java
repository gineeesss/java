import java.util.Comparator;

public class CompararLluvia implements Comparator<Registro> {
    @Override
    public int compare(Registro o1, Registro o2) {
        return -Float.compare(o1.prec,o2.prec);
    }
}
