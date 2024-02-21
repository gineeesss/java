package electrodoesticos;

public class Lavadora extends Electrodomestico{
    //OWN PROPERTIES
    private int carga;

    public Lavadora(String marca, float precio, int peso, char consumoEnergetico, Color color, int carga) {
        super(marca, precio, peso, consumoEnergetico, color);
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora " + super.toString() + "| Carga: "+carga;
    }
    public void precioFinal(){
        super.precioFinal();
        if (this.carga >10){
            setPrecio(getPrecio()+50);
        }
    }
}
