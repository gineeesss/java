public class Tiempo {
    private String fecha;
    private Float prec,tmed,tmin,tmax,velmedia,racha;

    public Tiempo(String fecha, float prec, float tmed, float tmin, float tmax, float velmedia, float racha) {
        this.fecha = fecha;
        this.prec = prec;
        this.tmed = tmed;
        this.tmin = tmin;
        this.tmax = tmax;
        this.velmedia = velmedia;
        this.racha = racha;
    }

    public String getFecha() {
        return fecha;
    }

    public Float getTmed() {
        return tmed;
    }

    public Float getPrec() {
        return prec;
    }

    public Float getTmin() {
        return tmin;
    }

    public Float getTmax() {
        return tmax;
    }

    public Float getVelmedia() {
        return velmedia;
    }

    public Float getRacha() {
        return racha;
    }
}
