package clases;
import java.util.Scanner;

public class Personas1 {
    Scanner scr = new Scanner(System.in);
    private String nombre="";
    private String apellidos ="";
    private String dni = "";
    private int anioNacimiento;
    private int edad;
    public Personas1(String nombre, String apellidos, int anioNacimiento){
        final int anioActual = 2023;
        this.edad = anioActual - anioNacimiento;
        this.nombre=this.CambiarNombre(nombre); // se pasa una copa de la variable, no la propiedad integra
        this.apellidos=apellidos;
        this.dni=this.CalcularDNI();
        this.anioNacimiento=anioNacimiento;
    }
    @Override
    public String toString() {
        return "\nPersonas1{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", anioNacimiento=" + anioNacimiento +'\''+
                ", edad=" + edad +
                '}';
    }
    private String CalcularDNI(){
        System.out.print("\n"+this.nombre + ", por favor introduce tu DNI:");
        String letra = "";
        String dniLetra;
        int resto;
        int dniSinLetra = scr.nextInt();
        resto = dniSinLetra%23;
        switch (resto){ //se puede hacer con un charat, mas eficazmente, crear string con todos los caracteres y con chart elegir la posicion
            case 0: letra="T"; break;
            case 1: letra="R"; break;
            case 2: letra="W"; break;
            case 3: letra="A"; break;
            case 4: letra="G"; break;
            case 5: letra="M"; break;
            case 6: letra="Y"; break;
            case 7: letra="F"; break;
            case 8: letra="P"; break;
            case 9: letra="D"; break;
            case 10: letra="X"; break;
            case 11: letra="B"; break;
            case 12: letra="N"; break;
            case 13: letra="J"; break;
            case 14: letra="Z"; break;
            case 15: letra="S"; break;
            case 16: letra="Q"; break;
            case 17: letra="V"; break;
            case 18: letra="H"; break;
            case 19: letra="L"; break;
            case 20: letra="C"; break;
            case 21: letra="K"; break;
            case 22: letra="E"; break;
        }
        dniLetra = String.valueOf(dniSinLetra);
        this.dni =  dniLetra + letra;
        return this.dni;
    }
    private String CambiarNombre(String nombre){
        if (this.edad >= 18){
            System.out.println(nombre + ", quieres cambiar tu nombre?\nPara cambiar de nombre presiona [1], para seguir pulsa [Otra tecla numérica] ");
            int quieres;
            quieres = scr.nextInt();
            if (quieres == 1) {
                System.out.print(nombre + ", introduce tu nuevo nombre:");
                nombre = scr.next();
            }
        }
        int round double pow boo
        return nombre;
    }
}
