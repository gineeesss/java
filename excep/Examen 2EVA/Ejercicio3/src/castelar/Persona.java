package castelar;

public abstract class Persona {
    private String nombre, dni;
    private static int totalPersonas;

    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        totalPersonas++;
    }

    public abstract void mostrarDatos();

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public static int getTotalPersonas() {
        return totalPersonas;
    }

}
