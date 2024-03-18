package castelar;

public final class Estudiante extends Persona{
    private String etapa;
    private String asignatura;
    private static int totalEstudiantes;

    public Estudiante(String nombre, String dni, String etapa) {
        super(nombre, dni);
        this.etapa = etapa;
        this.asignatura="";
        totalEstudiantes++;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Profesor{nombre: "+getNombre()+", dni: "+getDni()+", etapa: "+this.etapa+", asignatura: "+this.asignatura);
    }

    public static int getTotalEstudiantes() {
        return totalEstudiantes;
    }

    public void matricular(String asignatura){
        this.asignatura=asignatura;
    }
}
