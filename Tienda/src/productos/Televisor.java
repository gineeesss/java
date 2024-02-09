package productos;

public class Televisor extends Producto{
    //PROPIERTIES
    private int pulgadas;
    private final int DESCUENTO; //en porcentaje %
    //METHODS

    public Televisor(String marca, String modelo, float precio, int pulgadas) {
        super(marca, modelo, precio);
        this.pulgadas = pulgadas;
        this.DESCUENTO = 8;
    }

    @Override
    public String toString() {return "[Televisor] "+super.toString()+" Pulgadas: "+pulgadas+" Descuento: "+DESCUENTO+"%";}

    public float calcularDescuento(){
        return (super.getPrecio()-(super.getPrecio()*this.DESCUENTO)/100);
    }
    public void cambiarCanal(String canal) {
        System.out.println("Cambiando al canal "+canal);
    }

}
