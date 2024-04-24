import java.util.Comparator;

public class OrdenCantidadLetraDeterminada implements Comparator<Alumno> {
    @Override
    public int compare(Alumno o1, Alumno o2) {
        int letrasO1=0;
        int letrasO2=0;
        for (int i=0;i<o1.getNombre().length();i++){
            if ((o1.getNombre().charAt(i))=='e') letrasO1++;
        }
        for (int i=0;i<o2.getNombre().length();i++){
            if ((o2.getNombre().charAt(i))=='e' || (o2.getNombre().charAt(i))== 'E') letrasO2++;
        }
        if (letrasO1>letrasO2){
            return 1;
        }else if (letrasO2>letrasO1){
            return -1;
        }else return 0;
    }
}
