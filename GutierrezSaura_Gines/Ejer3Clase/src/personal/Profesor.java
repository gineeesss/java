package personal;

public class Profesor extends Persona{
    //PROPIEDADES
    private String especialidad;
    private static int totalProfesores;

    public Profesor(String nombre, String dni, String especialidad) {
        super(nombre, dni);
        this.especialidad = especialidad;
        totalProfesores++;
    }

    public String mostrarDatos() {
        return "Profesor{" +
                "Profesor='" + especialidad + '\'' +
                "} " + super.mostrarDatos();
    }

    public static int getTotalProfesores() {
        return totalProfesores;
    }
}
