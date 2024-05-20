public class Tiempo {
    private String fecha;
    private float prec,tmed,tmin,tmax,velmedia,racha;

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

    public float getPrec() {
        return prec;
    }

    public float getTmed() {
        return tmed;
    }

    public float getTmin() {
        return tmin;
    }

    public float getTmax() {
        return tmax;
    }

    public float getVelmedia() {
        return velmedia;
    }

    public float getRacha() {
        return racha;
    }
}
