import productos.*;
import java.util.Scanner;
public class Main {
    private static Scanner scr = new Scanner(System.in).useDelimiter("\\n");

    public static void main(String[] args) {
        Producto[] tienda = new Producto[10]; //el maximo de productos es 10, por lo que se crea array con 10 productos del tipo productos, la superclase

        tienda[Producto.getInventario()] = new Movil(scr.next(),scr.next(),scr.nextFloat(), scr.next(), scr.nextInt(),scr.nextInt());
        tienda[Producto.getInventario()] = new Ordenador("asus","rog",1000,"core17",16,1000);
        tienda[Producto.getInventario()] = new Televisor("LG","Casa",400,32);

        //for (Producto producto: tienda //usar cuando se que lo voy a utilzar en un array que tiene comienzo y final (es decir, está completo)) { System.out.println(producto)}

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
//                    consultarPrecio(scr.next(),scr.next(),tienda);
                    consultarPrecio2(tienda);
                    break;
                case 6:
                    //llamar(scr.next(),scr.next(),tienda);
                    llamar2(tienda);
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
        String[] caracComunes = new String[6];
        System.out.println("MARCA: ");
        caracComunes[0] = scr.next();
        System.out.println("MODELO: ");
        caracComunes[1] = scr.next();
        System.out.println("PRECIO: ");
        caracComunes[2] = scr.next();
            switch (opcion){
                case 1:
                    System.out.println("PROCESADOR: ");
                    caracComunes[3] = scr.next();
                    System.out.println("RAM: ");
                    caracComunes[4] = scr.next();
                    System.out.println("PULGADAS: ");
                    caracComunes[5] = scr.next();
                    tienda[Producto.getInventario()] = new Movil(caracComunes[0],caracComunes[1],Float.parseFloat(caracComunes[2]),caracComunes[3],Integer.parseInt(caracComunes[4]),Integer.parseInt(caracComunes[5]));
                    break;
                case 2:
                    System.out.println("PROCESADOR: ");
                    caracComunes[3] = scr.next();
                    System.out.println("RAM: ");
                    caracComunes[4] = scr.next();
                    System.out.println("HDD: ");
                    caracComunes[5] = scr.next();
                    tienda[Producto.getInventario()] = new Ordenador(caracComunes[0],caracComunes[1],Float.parseFloat(caracComunes[2]),caracComunes[3],Integer.parseInt(caracComunes[4]),Integer.parseInt(caracComunes[5]));
                    break;
                case 3:
                    System.out.println("PULGADAS: ");
                    caracComunes[3] = scr.next();
                    tienda[Producto.getInventario()] = new Televisor(caracComunes[0],caracComunes[1],Float.parseFloat(caracComunes[2]),Integer.parseInt(caracComunes[3]));
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
                for(Producto a : tienda) { if (a instanceof Televisor) System.out.println(a.toString());}
                break;
            case 2:
                for(Producto a : tienda) { if (a instanceof Movil) System.out.println(a.toString());}
                break;
            case 3:
                for(Producto a : tienda) { if (a instanceof Ordenador) System.out.println(a.toString());}
                break;
            default:
                System.out.println("Introducir un tipo entre [1 - 3]");
        }
    }
    //OPCION 5 --> CONSULTAR PRECIO PRODUCTO ESPECIFICO
    public static void consultarPrecio(String marca, String modelo,Producto[] tienda){
        for (int i = 0; i<Producto.getInventario();i++){
            if (modelo.equals(tienda[i].getMarca()) & marca.equals(tienda[i].getModelo())){
                System.out.println(tienda[i].calcularDescuento());
                return;
            }
        }System.out.println("No existe ningún producto con marca: "+marca+" y modelo: "+modelo);
    }

    public static int buscarProducto(String marca, String modelo,Producto[] tienda){
        for (int i = 0; i<Producto.getInventario();i++){
            if (modelo.equals(tienda[i].getMarca()) & marca.equals(tienda[i].getModelo())){
                return -i;
            }
        }System.out.println("No existe ningún producto con marca: "+marca+" y modelo: "+modelo);
        return -1;
    }

    public static void consultarPrecio2(Producto[] tienda) {
        int poscionArray = buscarProducto(marcaPreguntar(),modeloPreguntar(),tienda);
        if (poscionArray != -1) {
            System.out.println(tienda[poscionArray].calcularDescuento());
        }
    }
    public static String marcaPreguntar(){System.out.println("Introduir MARCA: "); return scr.next();}
    public static String modeloPreguntar(){ System.out.println("Introduir MODELO: "); return scr.next();}


    public static void llamar2(Producto[] tienda){
        int poscionArray = buscarProducto(marcaPreguntar(),modeloPreguntar(),tienda);

        if (poscionArray != -1) System.out.println("Introducir número: "); ((Movil)tienda[poscionArray]).llamar(scr.next());
    }




    //LLAMAR
    public static void llamar(String marca, String modelo, Producto[] tienda) {
        for (int i = 0; i < Producto.getInventario(); i++) {
            if ((modelo.equals(tienda[i].getMarca())) & (marca.equals(tienda[i].getModelo()))) {
                if (tienda[i] instanceof Movil) ((Movil) tienda[i]).llamar(scr.next());
                return;
            }
        }System.out.println("No existe ningún producto con marca: " + marca + " y modelo: " + modelo);
    }
    //CAMBIAR CANAL
    public static void cambiarCanal(String marca, String modelo, Producto[] tienda) {
        Scanner scr = new Scanner(System.in);

        for (int i = 0; i < Producto.getInventario(); i++) {
            if ((modelo.equals(tienda[i].getMarca())) & (marca.equals(tienda[i].getModelo()))) {
                if (tienda[i] instanceof Televisor) ((Televisor) tienda[i]).cambiarCanal(scr.next());
                return;
            }
        } System.out.println("No existe ningún producto con marca: " + marca + " y modelo: " + modelo);
    }
    //AUMENTAR RAM
    public static void aumentarRam(String marca, String modelo, Producto[] tienda) {
        Scanner scr = new Scanner(System.in);

        for (int i = 0; i < Producto.getInventario(); i++) {
            if ((modelo.equals(tienda[i].getMarca())) & (marca.equals(tienda[i].getModelo()))) {
                if (tienda[i] instanceof Ordenador) ((Ordenador) tienda[i]).ampliarRam(scr.nextInt());
                return;
            }
        }System.out.println("No existe ningún producto con marca: "+marca+" y modelo: "+modelo);
    }
    //MENU
    public static void menu(){
        System.out.println("\nMENU" +
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


/*
NO SE PUEDE HACER PORQUE NEXTLINE NO FUNCIONA CORRECCTAMENTE

 System.out.print("Introduce los datos del móvil (\nMarca:" + "\nModelo" + "\nPrecio" + "\nSistemaOperativo" + "\nCapacidadAlmacenamiento" + "\nRAM): \n");
 String movilCrear = scr.nextLine();
 String partes[] = movilCrear.split(" ");
 if (partes.length !=6){
 System.out.println("Por facot introducir las Características necesarias [6]");
 } else tienda[Producto.getInventario()] = new Movil(partes[0], partes[1], Float.parseFloat(partes[2]), partes[3], Integer.parseInt(partes[4]), Integer.parseInt(partes[5]));

 */
