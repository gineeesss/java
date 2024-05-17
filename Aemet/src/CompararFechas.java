import java.util.Comparator;

public class CompararFechas implements Comparator<Fecha> {
    @Override
    public int compare(Fecha o1, Fecha o2) {
        if (o1.anio > o2.anio) return Integer.compare(o1.anio,o2.anio);
        if (o1.mes > o2.mes) return Integer.compare(o1.mes, o2.mes);
        else return Integer.compare(o1.dia, o2.dia);
    }
}
