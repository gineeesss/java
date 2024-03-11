public class Planeta implements Parabolico, Cohete, Tierra{
    private double masa, radio;
    public Planeta(double velocidad, double angulo) {
        this.masa = masa;
        this.radio = radio;
    }
    public double alcance(double velocidad, double angulo){
        double nuevo=velocidad*angulo;
        return nuevo;
    }

    @Override
    public double fuerza() {
        return this.masa*Tierra.g;
    }

    @Override
    public double velocidad() {
        return Math.sqrt(2*Tierra.g*this.masa/this.radio);
    }


}
