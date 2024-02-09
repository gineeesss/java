package productos;

public class Movil extends Producto{
    //PROPIERTIES
    private String procesador;
    private int ram;
    private int pulgadas;
    private final int DESCUENTO;

    //METHODS

    public Movil(String marca, String modelo, float precio, String procesador, int ram, int pulgadas) {
        super(marca, modelo, precio);
        this.procesador = procesador;
        this.ram = ram;
        this.pulgadas = pulgadas;
        this.DESCUENTO = 5; //en porcentaje %
        }

    @Override
    public String toString() {return "[Movil] "+super.toString()+" Procesador: "+procesador+" RAM: "+ram+"Pulgadas: "+pulgadas+" Descuento: "+DESCUENTO+"%";}
    public float calcularDescuento(){
        return ((getPrecio()*this.DESCUENTO)/100);
    }
    public void llamar(String numero){
        System.out.printf("Llamando al %s...",numero);
    }
}
