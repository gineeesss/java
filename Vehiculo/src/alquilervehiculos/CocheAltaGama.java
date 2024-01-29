package alquilervehiculos;

public class CocheAltaGama  extends Coche{
    //PROPIEDADES


    //METODOS

    public CocheAltaGama(String marca, String modelo, int anioFabricacion, int numeroPuertas) {
        super(marca,modelo,anioFabricacion,numeroPuertas);
    }
    public float calcularAlquiler(int dias){
        return (super.calcularAlquiler(dias) + (25*dias));
    }
}
