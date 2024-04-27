package Agenda;

public class Contacto {
    private String nombre;
    private String correo;//nose puede repetir
    private String telefono;//nose puede repetir
    public Contacto(String nombre, String correo, String telefono){
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "\nNombre: " +this.nombre+
                "\nCorreo: " +this.correo+
                "\nTelefono: "+this.telefono;
    }
}
