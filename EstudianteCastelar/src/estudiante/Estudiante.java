package estudiante;

import java.time.LocalDate;

public class Estudiante {
    //PROPERTIES
    private String nombre;
    private LocalDate fecha;
    private int expediente;
    private static int numeroexpedientes;
    //METHODS

// hacer cuentas en el constructor es una mala praxis
// por lo que seria mas conveniente crear otra propiedad extatica que sirva para
// guardar el proximo numero de expediente, en vez de poner 1000 en el constructor
    public Estudiante(String nombre, LocalDate fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.expediente = 1000 + numeroexpedientes;
        numeroexpedientes++;
    }

    public static int getNumeroexpedentes() {
        return numeroexpedientes;
    }

    @Override
    public String toString() {
        return "{" +
                "nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                ", expediente=" + expediente +
                '}';
    }
}
