package personaPrincipal;
import persona.Persona;
public class personaPrincipal {
    public static void main (String[]args){
        Persona dani=new Persona("Dani", 40, 76f, "Informatico", 0f);
        Persona mercedes=new Persona("Mercedes", 31, 60f, "Cocinera",0f);

        dani.caminar(8f);
        dani.engordar(4f);
        mercedes.caminar(13.8f);
        dani.caminar(2f);

        System.out.println(dani.getNombre()+" ha recorrido: "+dani.obtenerRecorrido()+" Km.");
        System.out.println("Pesa: "+dani.getPeso()+" Kg");
        System.out.println();
        System.out.println(mercedes.getNombre()+" ha recorrido: "+mercedes.getRecorrido()+" Km.");
        System.out.println("Pesa: "+mercedes.getPeso()+" Kg");
    }
}
