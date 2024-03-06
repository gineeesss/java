import electrodoesticos.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Electrodomestico[] gestion = new Electrodomestico[6];
        gestion[0] = new Lavadora("Cara",10,100,'a', Electrodomestico.Color.rojo,72);
        gestion[1] = new Lavadora("Media",10,31,'H', Electrodomestico.Color.azul,22);
        gestion[2] = new Lavadora("Barata",10,10,'f', Electrodomestico.Color.blanco,100);
        gestion[3] = new Television("SmartTV pequeña",10,31,'L', Electrodomestico.Color.negro,22,true);
        gestion[4] = new Television("Normal",10,31,'c', Electrodomestico.Color.gris,44,false);
        gestion[5] = new Television("Cara",10,31,'a', Electrodomestico.Color.gris,44,true);


        System.out.println("MOSTRANDO TODOS LOS ELECTRODOMESTICOS");
        electrodomesticosMostrar(gestion);

        aplicarPrecioFinal(gestion);

        System.out.println("\nMOSTRANDO TODOS LOS ELECTRODOMESTICOS  CON PRECIO FINAL APLICADOS");
        electrodomesticosMostrar(gestion);

        System.out.println("\nMOSTRANDO TODOS LOS ELECTRODOMESTICOS  MAS CAROS");
        electrodomesticosMasCaros(gestion);

        System.out.println("\nINSTALANDO NETFLIX");
        instalarNetflix(gestion);
        precioTotal(gestion);
        Arrays.sort(gestion);
        for (Electrodomestico a : gestion){
            System.out.println(a);
            System.out.println();
        }
    }


    public static void instalarNetflix(Electrodomestico[] gestion){
        for (Electrodomestico a: gestion) {
            if(a instanceof Television) ((Television) a).instalarNetflix();
        }
    }
    public static void precioTotal(Electrodomestico[] gestion){
        int precioTotalLavadores = 0;
        int precioTotalTelevisiones = 0;
        for (Electrodomestico a: gestion){
            if(a instanceof Television)  precioTotalTelevisiones += a.getPrecio();
            if(a instanceof Lavadora)  precioTotalLavadores += a.getPrecio();
        }
        System.out.println("Precio total de Lavadoras: "+precioTotalLavadores);
        System.out.println("Precio total de Televisiones: "+precioTotalTelevisiones);
    }
    public static void electrodomesticosMasCaros(Electrodomestico[] gestion){
        int lavadoraMasCara = 0;
        int televisionMasCara = 0;
        float precioLavadora = 0;
        float precioTelevision = 0;
        for (int i =0; i<gestion.length;i++){
            if(gestion[i] instanceof Lavadora){
                if (gestion[i].getPrecio() >precioLavadora) lavadoraMasCara = i;precioLavadora = gestion[i].getPrecio();
            } else if (gestion[i] instanceof  Television) {
                if (gestion[i].getPrecio() > precioTelevision) televisionMasCara = i; precioTelevision = gestion[i].getPrecio();
            }
        }
        System.out.println(gestion[lavadoraMasCara]);
        System.out.println(gestion[televisionMasCara]);
    }
    public static void  electrodomesticosMostrar(Electrodomestico[] gestion){
        for (Electrodomestico a: gestion) {
            System.out.println(a+"\n");
        }
    }
    public static void  aplicarPrecioFinal(Electrodomestico[] gestion){
        for (Electrodomestico a: gestion) {
            a.precioFinal();
        }
    }
}
