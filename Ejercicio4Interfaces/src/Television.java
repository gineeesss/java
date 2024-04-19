public final class Television extends Electrodomestico{
    private int tamaño;
    private boolean smartTV;

    public Television(String marca, float precio, int peso, char consumo, Tipo_Color color, int tamaño, boolean smartTV) {
        super(marca, precio, peso, consumo, color);
        this.tamaño = tamaño;
        this.smartTV = smartTV;
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.tamaño>40) setPrecio(getPrecio()*1.30f);
        if (this.smartTV) setPrecio(getPrecio()+50);
    }

    @Override
    public String toString() {
        return "Television{" + super.toString() +
                ", tamaño=" + tamaño +
                ", smartTV=" + smartTV +
                '}';
    }

    public void instalarNetflix(){
        if (this.smartTV) System.out.println("Netflix instalado en la televisión "+getMarca());
    }
}
