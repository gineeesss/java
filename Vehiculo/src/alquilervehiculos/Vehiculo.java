package alquilervehiculos;

public abstract class  Vehiculo {
    //PROPIEDADES
    private final String marca;
    private final String modelo;
    private final int anioFabricacion;
    static private float ingresoAlguiler;
    //METHODS

    public Vehiculo(String marca, String modelo, int anioFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
    }

    public abstract float calcularAlquiler(int dias);

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anioFabricacion=" + anioFabricacion +
                '}';
    }
    public static float getIngresoAlguiler(){
        return ingresoAlguiler;
    }
    public static void setIngresoAlguiler(float ingresoAlguiler) {
        Vehiculo.ingresoAlguiler += ingresoAlguiler;
    }
}
