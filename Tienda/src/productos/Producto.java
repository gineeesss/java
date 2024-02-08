package productos;

public abstract class Producto {
    //PROPIERTIES
    private String marca;
    private String modelo;
    private float precio;
    private static int inventario;
    //METHODS

    public Producto(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        inventario ++;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                '}';
    }

    public static int getInventario() {
        return inventario;
    }

    public abstract float calcularDescuento();



    //GETTERS

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPrecio() {
        return precio;
    }
}
