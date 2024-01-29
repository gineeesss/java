package planeta;

public class Planeta {
    private String nombre;
    private int cantidadSatelites;
    private double masa;
    private double volumen;
    private int diametro;
    private int distanciaSol;
    private enum tipoPlaneta{ENANO, TERRESTRE, GASEOSO}
    private tipoPlaneta tipo;

    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro, int distanciaSol) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        if (nombre == "Mercurio"){
            this.tipo = tipoPlaneta.ENANO;
        }
    }

    @Override
    public String toString() {
        return "Planeta{" +
                "nombre='" + nombre + '\'' +
                ", cantidadSatelites='" + cantidadSatelites + '\'' +
                ", masa=" + masa +
                ", diametro=" + diametro +
                ", distanciaSol=" + distanciaSol +
                ", densidad=" + calcularDensidad()+
                ", exterior=" + esEsterior()+
                ", tipo="+ tipo +
                '}';
    }

    public double calcularDensidad(){
        double densidad = this.masa/this.volumen;
        return densidad;
    }
    public boolean esEsterior(){
        boolean exterior = false;
        final int UA = 149597870;
        double cinturon = UA * 3.4;
        if (distanciaSol > cinturon){
            exterior = true;
        }
        return exterior;
    }
}