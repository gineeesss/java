public final class Movil {
    private String numero;
    private int tiempo;
    private float tarifa,gasto;

    public Movil(String numero, float tarifa) {
        this.numero = numero;
        this.tarifa = tarifa;
        this.tiempo=0;
        this.gasto=0f;
    }

    public void mostrarDatos(){
        int minutos,segundos;
        minutos=this.tiempo/60;
        segundos=this.tiempo-(minutos*60);
        System.out.println("Número: "+this.numero+", Tiempo de uso: "+minutos+" minutos "+segundos+" segundos, Coste: "+this.gasto+" €");
    }

    public void llamar(Movil movil,int tiempo){
        this.tiempo+=tiempo;
        this.gasto+=((float)tiempo/60.0f)*this.tarifa;
        movil.tiempo+=tiempo;
    }
}
