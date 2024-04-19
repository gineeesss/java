import Agenda.Contacto;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scr = new Scanner(System.in).useDelimiter("\\n");
    public static void main(String[] args) {
        List<Contacto> agenda = new ArrayList<>(5);
        String nombre,correo,telefono,campoBusqueda;
        int opcion;
        do{
            menu();
            opcion = scr.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Introducir Nombre: ");
                    nombre=scr.next();
                    System.out.println("Introduir Correo: ");
                    correo=scr.next();
                    if (!existeCorreo(agenda,correo)){
                        System.out.println("Introducir Teléfono: ");
                        telefono=scr.next();
                        if (!existeTelefono(agenda,telefono)){
                            agenda.add(new Contacto(nombre,correo,telefono));
                        }else System.out.println("Este Telefono ya está registrado");
                    }else System.out.println("Este Correo ya está registrado");
                    break;
                    /*if (buscarCorreo(agenda,correo)!=-1){
                        System.out.println("Introducir Teléfono: ");
                        telefono=scr.next();
                        if (buscarTelefono(agenda,telefono)!=-1)){
                            agenda.add(new Contacto(nombre,correo,telefono));
                        }else System.out.println("Este Telefono ya está registrado");
                    }else System.out.println("Este Correo ya está registrado");*/
                case 2:
                    System.out.println("""
                            nBuscar por Nombre [N]
                            Buscar por Correo [C]
                            Buscar por Telefono [T]
                            """);
                    char busqueda = scr.next().toLowerCase().charAt(0);
                    switch (busqueda){
                        case 'n':
                            System.out.println("Insertar Nombre: ");
                            campoBusqueda = scr.next();
                            for (Contacto a: agenda) {
                                if (a.getNombre().equals(campoBusqueda)) System.out.println(a);
                            }
                            break;
                        case 'c':
                            System.out.println("Insertar Correo: ");
                            campoBusqueda = scr.next();
                            for (Contacto a: agenda) {
                                if (a.getCorreo().equals(campoBusqueda)){
                                    System.out.println(a);
                                break;
                                }
                            }
                            break;
                        case 't':
                            System.out.println("Insertar Telefono: ");
                            campoBusqueda = scr.next();
                            for (Contacto a: agenda) {
                                if (a.getTelefono().equals(campoBusqueda)){
                                    System.out.println(a);
                                    break;
                                }
                            }
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Introduce el Teéfono: ");
                    telefono=scr.next();
                    if (existeTelefono(agenda,telefono)) agenda.remove(buscarTelefono(agenda,telefono));
                    break;
                case 4:
                    mostrarAgenda(agenda);
                    break;
            }
        }while (opcion!=0);
        System.out.println("Gracias por Usar el Programa");
    }
    public static void mostrarAgenda(List<Contacto> agenda){
        for (Contacto a:agenda){
            System.out.println(a);
        }
    }
    public static void menu(){
        System.out.println("""
                [1] Crear Contacto
                [2] Buscar Contacto
                [3] Borrar Contacto(por telefono)
                [4] Mostrar Agenda Completa
                [0] Salir
                """);
    }
    public static boolean existeCorreo(List<Contacto> agenda, String correo){
        for (Contacto a: agenda ){
            if (a.getCorreo().equals(correo)) return true;
        }
        return false;
    }
    public static boolean existeTelefono(List<Contacto> agenda, String telefono){
        for (Contacto a: agenda ){
            if (a.getTelefono().equals(telefono)) return true;
        }
        return false;
    }
    public static int buscarCorreo(List<Contacto> agenda, String correo){
        for (Contacto a: agenda ){
            if (a.getCorreo().equals(correo)) return agenda.indexOf(a);
        }
        return -1;
    }
    public static int buscarTelefono(List<Contacto> agenda, String telefono){
        for (Contacto a: agenda ){
            if (a.getCorreo().equals(telefono)) return agenda.indexOf(a);
        }
        return -1;
    }
}
/*Crea un programa para gestionar contactos. Permitirá crear contactos que tendrán
nombre, correo y teléfono (ten en cuenta que no se puede repetir ni el mismo
número de teléfono ni el mismo mail). Permitirá buscar por nombre, correo
electrónico o teléfono, dando el resto de los datos. También permitirá borrar por
teléfono y mostrar la agenda completa de contactos.*/
