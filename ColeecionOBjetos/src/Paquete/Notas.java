package Paquete;

public class Notas {
    private String modulo;
    private float nota;
    public Notas(String modulo, float nota){
        this.modulo = modulo;
        this.nota = nota;
    }

    public float getNota() {
        return nota;
    }
    public String getModulo(){
        return modulo;
    }
    @Override
    public String toString() {
        return "\nmodulo: " + modulo +
                "\n nota: " + nota;
    }
}
