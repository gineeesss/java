package productos;

public class Ordenador extends Producto{
    //PROPIERTIES
    private String procesador;
    private int ram;
    private int hdd;
    private final int DESCUENTO; //en porcentaje %


    //METHODS

    public Ordenador(String marca, String modelo, float precio, String procesador, int ram, int hdd) {
        super(marca, modelo, precio);
        this.procesador = procesador;
        this.ram = ram;
        this.hdd = hdd;
        this.DESCUENTO = 10;
    }

    @Override
    public String toString() {
        return "Ordenador{" +
                "procesador='" + procesador + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", DESCUENTO=" + DESCUENTO +
                "} " + super.toString();
    }

    public float calcularDescuento(){
        return (super.getPrecio()-(super.getPrecio()*this.DESCUENTO)/100);
    }
    public void ampliarRam(int aumento){
        if(aumento> 0 & aumento <128){
            System.out.println("Memoria RAM aumentada desde "+this.ram+" a "+(this.ram+aumento));
            this.ram += aumento;
        }else System.out.println("Por favor introducir un número entre 0 y 128");
    }
}
