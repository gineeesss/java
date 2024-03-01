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

    public void mostrarDatos() {
        System.out.println("Profesor{" +
                "Profesor='" + especialidad + '\'' +
                 "dni: "+ this.getDni()+"especialidad: "+this.especialidad+"} " );
    }

    public static int getTotalProfesores() {
        return totalProfesores;
    }
}
