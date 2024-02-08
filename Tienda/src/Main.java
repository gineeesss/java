import productos.*;

import java.util.Scanner;

public class Main {


    public static void insertarDatos(){
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in).useDelimiter("\\n");
        Producto[] tienda = new Producto[10]; //el maximo de productos es 10, por lo que se crea array con 10 productos del tipo productos, la superclase

        tienda[Producto.getInventario()] = new Movil(scr.next(),scr.next(),scr.nextFloat(), scr.next(), scr.nextInt(),scr.nextInt());
        tienda[Producto.getInventario()] = new Ordenador("asus","rog",1000,"core17",16,1000);
        tienda[Producto.getInventario()] = new Televisor("LG","Casa",400,32);

        System.out.println(Producto.getInventario());


        for (Producto producto: tienda //usar cuando se que lo voy a utilzar en un array que tiene comienzo y final (es decir, está completo)
             ) {
            System.out.println(producto);
        }

        int option;
        do {
            menu();
            option=scr.nextInt();
            switch (option){
                case 1:
                    insertarInventario(tienda);
                    break;
                case 2:
                    System.out.println("El número total de producots es: "+Producto.getInventario());
                    break;
                case 3:
                    todosProductos(tienda);
                    break;
                case 4:
                    System.out.println("[1] Televisores" +
                            "\n[2] Móviles" +
                            "\n[3] Ordenadores");
                    productosTipo(scr.nextInt(), tienda);
                    break;
                case 5:
                    System.out.println("Por favor introducir Marca y Modelo");
                    consultarPrecio(scr.next(),scr.next(),tienda);
                    break;
                case 6:
                    llamar(scr.next(),scr.next(),tienda);
                    break;
                case 7:
                    System.out.println("Por favor introducir Marca y Modelo");
                    aumentarRam(scr.next(),scr.next(),tienda);
                    break;
                case 8:
                    cambiarCanal(scr.next(),scr.next(),tienda);
                    break;
            }
        }while (option!=0);
    }

    //OPCION 1 INSERTAR PRODUCTO
    public static void insertarInventario(Producto[] tienda){
        Scanner scr = new Scanner(System.in);
        System.out.println("Tipo de Producto a introducir \n[1] Móvil \n[2] Ordenador \n[3] Televisor");
        int opcion = scr.nextInt();
            switch (opcion){
                case 1:
                    tienda[Producto.getInventario()] = new Movil(scr.next(),scr.next(),scr.nextFloat(), scr.next(), scr.nextInt(),scr.nextInt());
                    break;
                case 2:
                    tienda[Producto.getInventario()] = new Ordenador(scr.next(),scr.next(),scr.nextFloat(), scr.next(), scr.nextInt(),scr.nextInt());
                    break;
                case 3:
                    tienda[Producto.getInventario()] = new Televisor(scr.next(),scr.next(),scr.nextFloat(),scr.nextInt());
                    break;
            }
    }
    //OPCION 3 --> CONSULTAR DESCRIPCION TODOS PRODUCCTOS
    public static void todosProductos(Producto[] tienda){
        for (int i = 0; i<Producto.getInventario();i++){
            System.out.println(tienda[i].toString());
        }
    }
//OPCON 4 --> CONSULTAR PRODUCTOS DE UN TIPO
    public static void productosTipo(int tipo, Producto[] tienda){
        switch (tipo){
            case 1:
                for (int i = 0; i<Producto.getInventario();i++) {
                    if (tienda[i] instanceof Televisor ){
                        System.out.println(tienda[i].toString());}}
                break;
            case 2:
                for (int i = 0; i<Producto.getInventario();i++) {
                    if (tienda[i] instanceof Movil ){
                        System.out.println(tienda[i].toString());}}
                break;
            case 3:
                for (int i = 0; i<Producto.getInventario();i++) {
                    if (tienda[i] instanceof Ordenador ){
                        System.out.println(tienda[i].toString());}}
                break;
            default:
                System.out.println("Introducir un tipo entre [1 - 3]");
        }
    }



    //OPCION 5 --> CONSULTAR PRECIO PRODUCTO ESPECIFICO
    public static void consultarPrecio(String marca, String modelo,Producto[] tienda){
        for (int i = 0; i<Producto.getInventario();i++){
            if ((modelo.equals(tienda[i].getMarca())) & (marca.equals(tienda[i].getModelo()))){
                System.out.println(tienda[i].calcularDescuento());
                break;
            }
        }System.out.println("No existe ningún producto con marca: "+marca+" y modelo: "+modelo);
    }

    //LLAMAR
    public static void llamar(String marca, String modelo, Producto[] tienda) {
        Scanner scr = new Scanner(System.in);

        for (int i = 0; i < Producto.getInventario(); i++) {
            if ((modelo.equals(tienda[i].getMarca())) & (marca.equals(tienda[i].getModelo()))) {
                if (tienda[i] instanceof Movil) ((Movil) tienda[i]).llamar(scr.next());
                break;
            }
        }System.out.println("No existe ningún producto con marca: " + marca + " y modelo: " + modelo);
    }

    //CAMBIAR CANAL
    public static void cambiarCanal(String marca, String modelo, Producto[] tienda) {
        Scanner scr = new Scanner(System.in);

        for (int i = 0; i < Producto.getInventario(); i++) {
            if ((modelo.equals(tienda[i].getMarca())) & (marca.equals(tienda[i].getModelo()))) {
                if (tienda[i] instanceof Televisor) ((Televisor) tienda[i]).cambiarCanal(scr.next());
                break;
            }
        } System.out.println("No existe ningún producto con marca: " + marca + " y modelo: " + modelo);
    }
    //AUMENTAR RAM
    public static void aumentarRam(String marca, String modelo, Producto[] tienda) {
        Scanner scr = new Scanner(System.in);

        for (int i = 0; i < Producto.getInventario(); i++) {
            if ((modelo.equals(tienda[i].getMarca())) & (marca.equals(tienda[i].getModelo()))) {
                if (tienda[i] instanceof Ordenador) ((Ordenador) tienda[i]).ampliarRam(scr.nextInt());
                break;
            } System.out.println("No existe ningún producto con marca: " + marca + " y modelo: " + modelo);
        }System.out.println("No existe ningún producto con marca: "+marca+" y modelo: "+modelo);
    }

    /*public static void aumentarRam(Producto[] tienda){
        Scanner scr = new Scanner(System.in);
        System.out.println("A cuál ordenador quiere aumentar la RAM: ");
        productosTipo(3,tienda);
        System.out.println("¿En cuánto quiere aumentar?");
        consultarPrecio(scr.next(),scr.next(),tienda);
        /*for (int i = 0; i<Producto.getInventario();i++) {
            if (tienda[i] instanceof Ordenador ){
                System.out.println("NUMERO: "+ i+" " +tienda[i].toString());}}
        int ordenador= scr.nextInt();
        tienda[ordenador].ampliarRam(scr.nextInt());
    }*/
    //MENU
    public static void menu(){
        System.out.println("MENU" +
                "\n[1] INSERTAR PRODUCTO" +
                "\n[2] CONSULTAR TOTAL PRODUCTOS" +
                "\n[3] CONSULTAR DESCRIPCION TODOS LOS PRODUCTOS" +
                "\n[4] CONSULTAR TODOS LOS PRODUCTOS DE UN TIPO" +
                "\n[5] CONSULTAR PRECIO PRODUCTO ESPECIFICO" +
                "\n[6] LLAMAR" +
                "\n[7] AUMENTAR RAM" +
                "\n[8] CAMBIAR DE CANAL");
    }
}


//HINTS
//Cuenta el inventario correctamente