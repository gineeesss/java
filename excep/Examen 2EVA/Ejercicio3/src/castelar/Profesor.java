package castelar;

public final class Profesor extends Persona {
    private String especialidad;
    private static int totalProfesores;

    public Profesor(String nombre, String dni, String especialidad) {
        super(nombre, dni);
        this.especialidad = especialidad;
        totalProfesores++;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Profesor{nombre: "+getNombre()+", dni: "+getDni()+", especialidad: "+this.especialidad);
    }

    public static int getTotalProfesores() {
        return totalProfesores;
    }
}
