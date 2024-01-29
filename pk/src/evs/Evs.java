package evs;

public class Evs {
    //propiedades
    int ps;
    int ataq;
    int def;
    int ataqEsp;
    int defEsp;
    int vel;


    public Evs() {
        this.ps = (int)(Math.pow(Math.random(),2)*255 +1);
        this.ataq = (int)(Math.pow(Math.random(),2)*255 +1);
        this.def = (int)(Math.pow(Math.random(),2)*255 +1);
        this.ataqEsp = (int)(Math.pow(Math.random(),2)*255 +1);
        this.defEsp = (int)(Math.pow(Math.random(),2)*255) +1;
        this.vel = (int)(Math.pow(Math.random(),2)*255) +1;
    }

    @Override
    public String toString() {
        return "Evs{" +
                "ps=" + ps +
                ", ataq=" + ataq +
                ", def=" + def +
                ", ataqEsp=" + ataqEsp +
                ", defEsp=" + defEsp +
                ", vel=" + vel +
                '}';
    }
}
