package personal;

public abstract class Persona {
    //PROPIEDADES
    private String nombre;
    private String dni;
    private static int totalPersonas;
    //METODOS

    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        totalPersonas++;
    }

    public String mostrarDatos() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
    public String getNombre() {
        return nombre;
    }
    public String getDni() {
        return dni;
    }
    public static int getTotalPersonas() {
        return totalPersonas;
    }
}
