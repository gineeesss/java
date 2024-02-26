package moviles;

public class Movil {
    //PROPIEDADES
    private int numero;
    private int tiempo;
    private float tarifa;
    private float gasto;

    //METODOS


    public Movil(int numero, float tarifa) {
        this.numero = numero;
        this.tarifa = tarifa;
    }

    public String mostrarDatos() {
        return "Movil{" +
                "numero=" + numero +
                ", tiempo=" + tiempo +
                ", tarifa=" + tarifa +
                ", gasto=" + gasto +
                '}';
    }

    public int getNumero() {
        return numero;
    }

    public float getTarifa() {
        return tarifa;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public void setGasto(float gasto) {
        this.gasto = gasto;
    }

    public void llamar(Movil movil, int tiempo){
        float tiempoMinutos = (tiempo/60f);
        this.setGasto(this.gasto+((movil.getTarifa())*tiempoMinutos));
        this.tiempo +=tiempo;
        movil.setTiempo(tiempo);
    }
}
