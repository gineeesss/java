package electronica;

public final class Televisor extends Producto{
    private int pulgadas;
    private final int DESCUENTO=8;

    public Televisor(String marca, String modelo, float precio, int pulgadas) {
        super(marca, modelo, precio);
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return "Televisor{" + super.toString() +
                ", pulgadas=" + pulgadas +
                ", DESCUENTO=" + DESCUENTO + "%" +
                '}';
    }

    @Override
    public float calcularDescuento() {
        return super.getPrecio()*this.DESCUENTO/100;
    }

    public void cambiarCanal(int canal){
        System.out.println("Cambiando al canal "+canal);
    }
}
