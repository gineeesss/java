package garaje;

public class Coche implements Comparable{
    private final String matricula;
    private final String marca;
    private final String modelo;
    private final int kilometraje;

    public Coche(String matricula, String marca, String modelo, int kilometraje) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", kilometraje='" + kilometraje + '\'' +
                '}';
    }

    public String   getMarca() {
        return marca;
    }

    public String getMatricula(){
        return matricula;
    }
    public int getKilometraje() {
        return kilometraje;
    }

    public int compareTo(Object o) {
        Coche miau = (Coche) o;
        if (this.kilometraje < miau.kilometraje) return -1;
        else if (this.kilometraje> miau.kilometraje)return 1;
        else return 0;

    }
}

