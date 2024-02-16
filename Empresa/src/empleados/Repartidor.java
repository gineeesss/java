package empleados;

public class Repartidor extends Empleado{
    //OWN PROPERTIES
    private String zona;

    public Repartidor (String nombre, int edad, double salario, String zona) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    @Override
    public String toString() {
        return "Repartidor " +
                super.toString() +
                ", zona='" + zona + '\'' ;
    }
    public void aplicarPlus(){
        if (super.getEdad()<25 && zona.equalsIgnoreCase("zona 3")){
            super.setSalario(super.getSalario()+super.getPLUS());
        }
    }
}
