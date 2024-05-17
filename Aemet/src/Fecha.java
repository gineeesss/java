public class Fecha {
    public int dia,mes,anio;
    public Fecha(String fecha) {
        String [] arrayFecha = fecha.split("/");
        this.dia = Integer.parseInt(arrayFecha[0]);
        this.mes = Integer.parseInt(arrayFecha[1]);
        this.anio = Integer.parseInt(arrayFecha[2]);
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }
}
