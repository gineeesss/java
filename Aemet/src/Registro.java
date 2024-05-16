import java.util.Date;

public class Registro {
    public Fecha fecha;
    public float prec,tmed,tmin,tmax,velmedia,racha;

    public Registro(String[] linea) {
        this.fecha = new Fecha(linea[0]);
        this.prec = Float.parseFloat(linea[1]);
        this.tmed = Float.parseFloat(linea[2]);
        this.tmin = Float.parseFloat(linea[3]);
        this.tmax = Float.parseFloat(linea[4]);
        this.velmedia = Float.parseFloat(linea[5]);
        this.racha = Float.parseFloat(linea[6]);
    }
}
