package alquilervehiculos;

public class Coche extends Vehiculo{
    //PROPIEDADES
    private int numeroPuertas;
    //METODOS

    public Coche(String marca, String modelo, int anioFabricacion, int numeroPuertas) {
        super(marca,modelo,anioFabricacion);
        this.numeroPuertas = numeroPuertas;
    }
    public float calcularAlquiler(int dias){
        if (numeroPuertas==3) return 60*dias;
        else return 70*dias;
    }

    @Override
    public String toString() {
        return "Coche{" + super.toString() +
                "numeroPuertas=" + numeroPuertas +
                "} " ;
    }
}
