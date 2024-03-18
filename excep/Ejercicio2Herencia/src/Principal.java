import electronica.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Producto[] productos = new Producto[10];
        int opcion=0;
        do {
            opcion=mostrarMenu();
            switch (opcion) {
                case 1:
                    switch (tipoArticulo()) {
                        case 1:
                            añadirMovil(productos);
                            break;
                        case 2:
                            añadirOrdenador(productos);
                            break;
                        case 3:
                            añadirTelevisor(productos);
                            break;
                    }
                    break;
                case 2:
                    System.out.printf("En este momento tenemos %d artículos en la tienda\n", Producto.getInventario());
                    break;
                case 3:
                    for (int i=0; i<Producto.getInventario();i++) {
                        System.out.println(productos[i].toString());
                    }
                    break;
                case 4:
                    switch (tipoArticulo()) {
                        case 1:
                            for (Producto i : productos) {
                                if (i instanceof Movil) System.out.println(i.toString());
                            }
                            break;
                        case 2:
                            for (Producto i : productos) {
                                if (i instanceof Ordenador) System.out.println(i.toString());
                            }
                            break;
                        case 3:
                            for (Producto i : productos) {
                                if (i instanceof Televisor) System.out.println(i.toString());
                            }
                            break;
                    }
                    break;
                case 5:
                    consultarPrecio(productos);
                    break;
                case 6:
                    usarMovil(productos);
                    break;
                case 7:
                    usarOrdenador(productos);
                    break;
                case 8:
                    usarTelevisor(productos);
                    break;
                case 0:
                    System.out.println("Hasta pronto");
                    break;
            }
        }while (opcion!=0);
    }

    private static int mostrarMenu(){
        Scanner teclado = new Scanner(System.in).useDelimiter("\\n");
        System.out.println("Elige una de las siguientes opciones:" +
                "\n1) Agregar un nuevo artículo" +
                "\n2) Ver el número de artículos del inventario" +
                "\n3) Mostrar las características de TODOS los productos" +
                "\n4) Mostrar las características de UN TIPO de producto" +
                "\n5) Consultar el precio de un producto" +
                "\n6) LLamar con un móvil" +
                "\n7) Ampliar memoria de un ordenador" +
                "\n8) Cambiar el canal en un televisor" +
                "\n0) Salir del programa");
        return teclado.nextInt();
    }

    private static int tipoArticulo(){
        Scanner teclado = new Scanner(System.in).useDelimiter("\\n");
        System.out.println("¿En qué tipo de producto estás interesado?" +
                "\n1) Móvil" +
                "\n2) Ordenador" +
                "\n3) Televisor");
        return teclado.nextInt();
    }

    private static void añadirMovil(Producto[] productos){
        Scanner teclado = new Scanner(System.in).useDelimiter("\\n");
        String marca,modelo,procesador;
        float precio;
        int ram,pulgadas;

        System.out.println("Necesitaré que me indiques las características:");
        System.out.println("¿Marca?");
        marca= teclado.next();
        System.out.println("¿Modelo?");
        modelo= teclado.next();
        System.out.println("¿Procesador?");
        procesador= teclado.next();
        try{
            System.out.println("¿RAM (número)?");
            ram= teclado.nextInt();
            System.out.println("¿Pulgadas (número)?");
            pulgadas= teclado.nextInt();
            System.out.println("¿Precio (número)?");
            precio= teclado.nextFloat();
            productos[Producto.getInventario()] = new Movil(marca,modelo,precio,procesador,ram,pulgadas);
        }catch (InputMismatchException ex){
            ex = new InputMismatchException("Introduir datos con  el formato adecuado");
            System.out.println(ex.getMessage());
            teclado.next();
        }
     }

    private static void añadirOrdenador(Producto[] productos){
        Scanner teclado = new Scanner(System.in).useDelimiter("\\n");
        String marca,modelo,procesador;
        float precio;
        int ram,hdd;

        System.out.println("Necesitaré que me indiques las características:");
        System.out.println("¿Marca?");
        marca= teclado.next();
        System.out.println("¿Modelo?");
        modelo= teclado.next();
        System.out.println("¿Procesador?");
        procesador= teclado.next();
        try {
        System.out.println("¿RAM (número)?");
        ram= teclado.nextInt();
        System.out.println("¿Disco duro (número)?");
        hdd= teclado.nextInt();
        System.out.println("¿Precio (número)?");
        precio= teclado.nextFloat();
        productos[Producto.getInventario()] = new Ordenador(marca,modelo,precio,procesador,ram,hdd);
        }catch(InputMismatchException ex){
            ex = new InputMismatchException("Introducir los datos con el formato adecuado");
            System.out.println(ex.getMessage());
            teclado.nextLine();
        }
    }

    private static void añadirTelevisor(Producto[] productos){
        Scanner teclado = new Scanner(System.in).useDelimiter("\\n");
        String marca,modelo;
        float precio;
        int pulgadas;

        System.out.println("Necesitaré que me indiques las características:");
        System.out.println("¿Marca?");
        marca= teclado.next();
        System.out.println("¿Modelo?");
        modelo= teclado.next();
        try {
        System.out.println("¿Pulgadas (número)?");
        pulgadas= teclado.nextInt();
        System.out.println("¿Precio (número)?");
        precio= teclado.nextFloat();
        productos[Producto.getInventario()] = new Televisor(marca,modelo,precio,pulgadas);
        }catch (InputMismatchException ex){
            ex = new InputMismatchException("Introducir los datos con el formato adecuado");
            System.out.println(ex.getMessage());
            teclado.nextLine();
        }
    }

    private static void consultarPrecio(Producto[] productos){
        int i= buscarProducto(productos);
        if (i==-1){
            System.out.println("Lo siento, pero ese producto no lo tenemos en la tienda");
        } else{
            System.out.printf("El precio de tu producto es de %.2f €\n",productos[i].getPrecio()-productos[i].calcularDescuento());
        }
    }

    private static int buscarProducto(Producto[] productos){
        Scanner teclado = new Scanner(System.in).useDelimiter("\\n");
        String marca, modelo;
        System.out.println("Dime la marca del producto que estás buscando");
        marca= teclado.next();
        System.out.printf("Dime el modelo de %s que estás buscando\n",marca);
        modelo= teclado.next();
        for (int i=0; i<Producto.getInventario();i++){
            if (productos[i].getMarca().equalsIgnoreCase(marca) && productos[i].getModelo().equalsIgnoreCase(modelo)) return i;
        }
        return -1;
    }

    private static void usarMovil(Producto[] productos){
        Scanner teclado = new Scanner(System.in).useDelimiter("\\n");
        System.out.println("Necesito saber el móvil desde el que quieres llamar");
        int i=buscarProducto(productos);
        if (i==-1){
            System.out.println("Lo siento, pero no tenemos ese móvil");
        } else{
            System.out.println("Dime a qué número quieres llamar");
            ((Movil) productos[i]).llamar(teclado.next());
        }
    }

    private static void usarOrdenador(Producto[] productos){
        Scanner teclado = new Scanner(System.in).useDelimiter("\\n");
        System.out.println("Necesito saber el ordenador al que le quieres ampliar la memoria");
        int i=buscarProducto(productos);
        if (i==-1){
            System.out.println("Lo siento, pero no tenemos ese ordenador");
        } else{
            System.out.println("Dime cuanta memoria RAM quieres añadir");
            ((Ordenador) productos[i]).ampliarRam(teclado.nextInt());
        }
    }

    private static void usarTelevisor(Producto[] productos){
        Scanner teclado = new Scanner(System.in).useDelimiter("\\n");
        System.out.println("Necesito saber el televisor que quieres utilizar");
        int i=buscarProducto(productos);
        if (i==-1){
            System.out.println("Lo siento, pero no tenemos ese televisor");
        } else{
            System.out.println("Dime qué número de canal quieres ver");
            try{
            ((Televisor) productos[i]).cambiarCanal(teclado.nextInt());
            }catch (InputMismatchException ex){
                ex  = new InputMismatchException("Hay que introducir un numero entero");
            }catch (ClassCastException ex){
                ex = new ClassCastException("Hay que introducir un numero entero");
                System.out.println(ex.getMessage());
            }
        }
    }
}
//InputMismatchException
//ArrayIndexOutOfBoundsException
//ClassCastException