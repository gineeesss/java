public class Alumno implements Comparable<Alumno>{
    private String nombre;
    private Integer edad;

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                " edad=" + edad+"\n";
    }


    /*@Override
    public int compareTo(Alumno o) {
        if (this.edad > o.edad) return 1;
        else if (this.edad < o.edad) return -1;
        else return 0;
    }*/

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    @Override
    public int compareTo(Alumno o) {
        if (this.nombre.length() > o.nombre.length()){
            return -1;
        } else if (this.nombre.length() < o.nombre.length()) {
            return 1;
        }else return 0;
    }
}
