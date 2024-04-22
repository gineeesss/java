public class Alumno implements Comparable<Alumno>{
    String nombre;
    int edad;

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                " edad=" + edad+"\n";
    }


    @Override
    public int compareTo(Alumno o) {
        if (this.edad > o.edad) return 1;
        else if (this.edad < o.edad) return -1;
        else return 0;
    }
}
