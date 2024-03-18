package electronica;

public abstract class Producto {
    private String marca,modelo;
    private float precio;
    private static int inventario;

    public Producto(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        inventario++;
    }

    @Override
    public String toString() {
        return  "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio + "€";
    }

    public float getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public static int getInventario() {
        return inventario;
    }

    public abstract float calcularDescuento();
}
