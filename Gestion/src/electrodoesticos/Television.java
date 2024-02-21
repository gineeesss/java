package electrodoesticos;

public class Television extends Electrodomestico {
    //OWN PROPERTIES
    private int tamanio;
    private boolean smartTV;

    public Television(String marca, float precio, int peso, char consumoEnergetico, Color color, int tamanio, boolean smartTV) {
        super(marca, precio, peso, consumoEnergetico, color);
        this.tamanio = tamanio;
        this.smartTV = smartTV;
    }

    @Override
    public String toString() {
        return "Television " +super.toString()+ "| tamaño: "+tamanio+"| SmartTV: "+smartTV;
    }

    public void precioFinal() {
        super.precioFinal();
        if (this.tamanio > 40) setPrecio((getPrecio() * 1.3f));
        if (this.smartTV) setPrecio((getPrecio() + 50));
    }

    public void instalarNetflix() {
        if (this.smartTV) {
            System.out.println("Netflix instalado en el televisor "+ getMarca());
        }else System.out.println("No se puede instalar Netflix si el televisor no es SmartTV");
    }
}