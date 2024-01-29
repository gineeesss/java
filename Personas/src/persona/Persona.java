package persona;

public class Persona {
    private String nombre=" ", profesion=" ";
    private int edad;
    private float peso, recorrido;

    public Persona(String nombre, int edad, float peso, String profesion, float recorrido){
        this.nombre=nombre;
        this.edad=edad;
        this.peso=peso;
        this.profesion=profesion;
        this.recorrido=recorrido;

    }
    public void caminar (float recorrido){
        this.recorrido+=recorrido;
    }
    public float engordar (float peso){
        this.peso+=peso;
        return this.peso;
    }
    public float obtenerRecorrido(){
        return this.recorrido;
    }
    public String getNombre() {
        return nombre;
    }
    public float getPeso() {
        return peso;
    }
    public float getRecorrido() {
        return recorrido;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public void setRecorrido(float recorrido) {
        this.recorrido = recorrido;
    }
}
