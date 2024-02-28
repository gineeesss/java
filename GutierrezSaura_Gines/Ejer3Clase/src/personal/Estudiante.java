package personal;

public class Estudiante extends Persona{
    //PROPIEDADES
    private String etapa;
    private String asignatura;
    private static int totalEstudiantes;
    //METODOS

    public Estudiante(String nombre, String dni, String etapa) {
        super(nombre, dni);
        this.etapa = etapa;
        totalEstudiantes++;
    }

    public String mostrarDatos() {
        return "Estudiaante{" +
                "etapa='" + etapa + '\'' +
                ", asignatura='" + asignatura + '\'' +
                "} " + super.mostrarDatos();
    }

    public void matricular(String asignatura) {
        this.asignatura = asignatura;
    }

    public static int getTotalEstudiantes() {
        return totalEstudiantes;
    }

}
