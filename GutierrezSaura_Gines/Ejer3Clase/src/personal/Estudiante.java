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

    public void mostrarDatos() {
        System.out.println("Estudiaante{" +
                "dni: "+this.getDni()+"nombre: "+this.getNombre()+
                "etapa='" + etapa + '\'' +
                ", asignatura='" + asignatura + '\'' +
                "} " );
    }

    public void matricular(String asignatura) {
        this.asignatura = asignatura;
    }

    public static int getTotalEstudiantes() {
        return totalEstudiantes;
    }

}
