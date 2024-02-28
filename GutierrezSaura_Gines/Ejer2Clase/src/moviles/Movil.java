package moviles;

public class Movil {
    //PROPIEDADES
    private int numero;
    private int tiempo;
    private float tarifa;
    private float gasto;

    //METODOS

//SIEMPRE PONER DAR VALORES A LAS PROPIEDADES, AUNQUE SEA 0
    public Movil(int numero, float tarifa) {
        this.numero = numero;
        this.tarifa = tarifa;
        this.tiempo=0;
        this.gasto=0;
    }

    public void mostrarDatos() {
        System.out.println( "Movil{" +
                "numero=" + numero +
                ", tiempo=" + (tiempo/60)+":"+(tiempo%60)+
                ", tarifa=" + tarifa +
                ", gasto=" + gasto +
                '}');
    }

    public int getNumero() {
        return numero;
    }

    public float getTarifa() {
        return tarifa;
    }

    public void setTiempo(int tiempo) {
        this.tiempo += tiempo;
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
