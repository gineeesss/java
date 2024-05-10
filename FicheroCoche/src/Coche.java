public class Coche implements Comparable<Coche>{
    private  String matricula;
    private  String marca;
    private  String modelo;
    private  Integer kilometraje;

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

    public int compareTo(Coche o) { //en Integer, al ser un tipo primitio, ya tiene implemetedo una ordenacion con compareto (de menor a mayor)
        /*if (this.kilometraje < o.kilometraje) return -1;
        else if (this.kilometraje> o.kilometraje)return 1;
        else return 0;*/
        return this.kilometraje.compareTo(-o.getKilometraje());
    }
    public String escribir(){
        return matricula+";"+marca+";"+modelo+";"+kilometraje;
    }
}

