package circulo;

import java.util.Scanner;
public class Circulo {
//PROPERTIES
    private float radio;
    private static int totalCirculos;
//METHODS

    public Circulo(float radio){
        this.radio=radio;
        totalCirculos++;
    }
    /*public Circulo(){
        this.radio=radio;
        this.area=(float)(Math.PI * Math.pow(radio,2));
        this.circunferencia = (float)(Math.PI * 2 *radio);
        totalCirculos++;
    }*/

    public float getRadio() {
        return radio;
    }
    public static float circunferencia(float radio){
        return (float)(Math.PI * 2 *radio);
    }
    public static int getTotalCirculos() {
        return totalCirculos;
    }
    public static float area(float radio){
        return (float)(Math.PI * Math.pow(radio,2));
    }
    public static float radioPreguntar(){
        Scanner scr = new Scanner(System.in);
        System.out.println("Introducir radio: ");
        float radio = scr.nextFloat();
        return radio;
    }


}
