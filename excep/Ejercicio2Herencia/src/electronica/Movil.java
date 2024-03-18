package electronica;

public final class Movil extends Producto{
    private String procesador;
    private int ram, pulgadas;
    private final int DESCUENTO=5;

    public Movil(String marca, String modelo, float precio, String procesador, int ram, int pulgadas) {
        super(marca, modelo, precio);
        this.procesador = procesador;
        this.ram = ram;
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return "Movil{" + super.toString() +
                ", procesador='" + procesador + '\'' +
                ", ram=" + ram + "GB" +
                ", pulgadas=" + pulgadas +
                ", DESCUENTO=" + DESCUENTO + "%" +
                '}';
    }

    @Override
    public float calcularDescuento() {
        return super.getPrecio()*this.DESCUENTO/100;
    }

    public void llamar(String numero){
        System.out.println("Llamando al número "+numero);
    }

}
