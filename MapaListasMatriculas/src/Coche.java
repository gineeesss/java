public class Coche implements Comparable<Coche>{
    private final String matricula;
    private final String marca;
    private final String modelo;
    private final Integer kilometraje;

    public Coche(String matricula,String marca, String modelo, int kilometraje) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }


    @Override
    public String toString() {
        return "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", kilometraje='" + kilometraje+"\n";
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

    public int compareTo(Coche o) {
        /*if (this.kilometraje < o.kilometraje) return -1;
        else if (this.kilometraje> o.kilometraje)return 1;
        else return 0;*/
        return this.kilometraje.compareTo(-o.getKilometraje());
    }
}

