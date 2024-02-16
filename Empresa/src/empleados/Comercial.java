package empleados;

public class Comercial extends Empleado {
    //OWN PROPERTIES
    private double comision;

    public Comercial(String nombre, int edad, double salario, double comision) {
        super(nombre, edad, salario);
        this.comision = comision;
    }

    @Override
    public String toString() {
        return "Comercial " +
                super.toString() +
                ", comision=" + comision;}
    public void aplicarPlus(){
        if (super.getEdad()>30 && comision>200){
            super.setSalario(super.getSalario()+super.getPLUS());
        }
    }
}
