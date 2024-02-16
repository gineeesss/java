package empleados;

public abstract class Empleado {
    //PROPERTIES
    private String nombre;
    private int edad;
    private double salario;
    private final int PLUS = 100;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", PLUS=" + PLUS ;
    }

    public int getEdad() {return edad;}

    protected void setSalario(double salario) {this.salario = salario;}

    public int getPLUS() {
        return PLUS;}

    public double getSalario() {return salario;}

    public abstract void aplicarPlus();

}
