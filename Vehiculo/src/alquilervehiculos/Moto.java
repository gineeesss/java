package alquilervehiculos;

public class Moto  extends Vehiculo{
    //PROPIEDADES
    private int cilindrada;
    //METODOS

    public Moto(String marca, String modelo, int anioFabricacion,int cilindrada) {
        super(marca,modelo,anioFabricacion);
        this.cilindrada = cilindrada;
    }
    public void miau(){
        System.out.println("miau");
    }
    public float calcularAlquiler(int dias){
        if(cilindrada>500)
            return (50*dias);
        else return (75*dias);
    }

    @Override
    public String toString() {
        return "Moto{" + super.toString() +
                "cilindrada=" + cilindrada +
                '}';
    }
}
