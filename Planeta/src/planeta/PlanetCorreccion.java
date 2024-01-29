package planeta;

import java.util.IllegalFormatCodePointException;

public class PlanetCorreccion {
    private String nombre;
    private int cantidadSatelites, diametro, distanciaSol;
    private double masa,volumen;
    private enum tipoPlaneta{ENANO, TERRESTRE, GASEOSO}
    private tipoPlaneta tipo;

    @Override
    public String toString() {
        return "PlanetCorreccion{" +
                "nombre='" + nombre + '\'' +
                ", cantidadSatelites=" + cantidadSatelites +
                ", diametro=" + diametro +
                ", distanciaSol=" + distanciaSol +
                ", volumen=" + volumen +
                ", tipo=" + tipo +
                '}';
    }

    public PlanetCorreccion(String nombre, int satelites, double masa, double volumen, int diametro, int distancia) {
        this.nombre = nombre;
        this.cantidadSatelites = satelites;
        this.masa = masa ;
        this.diametro = diametro;
        this.distanciaSol = distancia;
        this.volumen = volumen;
        if (this.nombre.equalsIgnoreCase("Mercurio")){
            this.tipo=tipoPlaneta.ENANO;
        } else if (this.nombre.equalsIgnoreCase("Venus") || this.nombre.equalsIgnoreCase("Tierra")) {
            this.tipo=tipoPlaneta.TERRESTRE;
        } else if(this.nombre.equalsIgnoreCase("Júpiter")){
            this.tipo=tipoPlaneta.GASEOSO;
        }
    }


    public double calcularDensidad(){
        return this.masa/this.volumen;
    }
    public boolean esExterior(){
        final int UA = 149597870;
        if(distanciaSol > (3*UA)){
            return true;
        }
        return false;
    }

}
