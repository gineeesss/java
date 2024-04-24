import java.util.Comparator;

public class OrdenEdadAscendente implements Comparator<Alumno> {
    @Override
    public int compare(Alumno o1, Alumno o2) {
        return o1.getEdad().compareTo(o2.getEdad());
    }
}
