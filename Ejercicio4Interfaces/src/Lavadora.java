public final class Lavadora extends Electrodomestico{
    private int carga;

    public Lavadora(String marca, float precio, int peso, char consumo, Tipo_Color color, int carga) {
        super(marca, precio, peso, consumo, color);
        this.carga = carga;
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.carga>10) setPrecio(getPrecio()+50);
    }

    @Override
    public String toString() {
        return "Lavadora{" + super.toString() +
                ", carga=" + carga +
                '}';
    }
}
