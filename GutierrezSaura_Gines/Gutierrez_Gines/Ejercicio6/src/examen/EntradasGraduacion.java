package examen;

import java.util.Scanner;

public class EntradasGraduacion {
    //propiedades
    private int entradasButacas;
    private int entradasAnfiteatro;
    private int entradasPalco;

    //methods

    public EntradasGraduacion(int entradasButacas, int entradasAnfiteatro, int entradasPalco) {
        this.entradasButacas = entradasButacas;
        this.entradasAnfiteatro = entradasAnfiteatro;
        this.en
    tradasPalco = entradasPalco;
    }
    public void venderEntradas(){
        Scanner scr = new Scanner(System.in);
        System.out.println("Para que zona quiere la entrada:");
        System.out.println("ZONAS  \nBUTACAS   [1] \nANFITEATRO [2] \nPALCO     [3]");
        int eleccionZona = scr.nextInt();
        System.out.println("NÚMERO DE ENTRADAS:");
        int numEntradas = scr.nextInt();
        switch (eleccionZona){
            case 1:
                if(numEntradas <= this.entradasButacas) {
                    this.entradasButacas = this.entradasButacas - numEntradas;
                } else System.out.println("Has exedido el numero de entradas disponibles: ");
                break;
            case 2:
                if(numEntradas <= this.entradasAnfiteatro) {
                    this.entradasAnfiteatro = this.entradasAnfiteatro - numEntradas;
                } else System.out.println("Has exedido el numero de entradas disponibles: ");
                break;
            case 3:
                if(numEntradas <= this.entradasPalco) {
                    this.entradasPalco = this.entradasPalco - numEntradas;
                } else System.out.println("Has exedido el numero de entradas disponibles: ");
                break;
        }
    }

    @Override
    public String toString() {
        return "EntradasGraduacion{" +
                  "entradasButacas=" + entradasButacas +
                ", entradasAnfiteatro=" + entradasAnfiteatro +
                ", entradasPalco=" + entradasPalco +
                '}';
    }
}
