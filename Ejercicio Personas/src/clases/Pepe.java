package clases;

public class Pepe {
    private int id;
    private String nombre;
    private String edad;

    public Pepe(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String edadDeltio(int anio){
        int anioactual=2023;
        this.edad=String.valueOf(anioactual-anio);
        return this.edad;
    }

    @Override
    public String toString() {
        return "Pepe{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                '}';
    }
}
