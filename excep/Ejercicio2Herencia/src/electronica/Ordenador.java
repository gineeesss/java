package electronica;

public final class Ordenador extends Producto{
    private String procesador;
    private int ram, hdd;
    private final int DESCUENTO=10;

    public Ordenador(String marca, String modelo, float precio, String procesador, int ram, int hdd) {
        super(marca, modelo, precio);
        this.procesador = procesador;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "Ordenador{" + super.toString() +
                ", procesador='" + procesador + '\'' +
                ", ram=" + ram + "GB" +
                ", hdd=" + hdd + "GB" +
                ", DESCUENTO=" + DESCUENTO + "%" +
                '}';
    }

    @Override
    public float calcularDescuento() {
        return super.getPrecio()*this.DESCUENTO/100;
    }

    public void ampliarRam(int aumento){
        this.ram+=aumento;
        System.out.println("Su memoria se ha ampliado a "+this.ram+"GB");
    }
}
