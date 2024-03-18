// Este es el programa para 1 solo restaurante

import ejercicio.Restaurante;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Creamos un objeto de la clase Restaurante
        Restaurante pomodoro = new Restaurante();

        int clientes=0; // Esta variable es para saber cuánta gente viene a comer

        // Hacemos un bucle while porque no sabemos cuántas veces se va a ejecutar el programa
        do {
            pomodoro.MostrarOcupacion();
            System.out.println("¿Cuántos venis a comer? Escribe -1 para terminar el programa");
            clientes = teclado.nextInt();
            // Controlamos cuando debe finalizar el programa
            if (clientes==-1){
                System.out.println("Gracias por su visita. Hasta pronto!!");
                break;
            };

            // Controlamos que si el número de personas es mayor que el tamaño de las mesas no se pueden sentar
            if (clientes>4) {
                System.out.println("Lo siento no tenemos espacio para grupos de ese tamaño");
            // Si el tamaño es correcto entonces intentamos encontrar sitio
            }else {
                // Primero buscamos si hay mesas vacías
                if (!pomodoro.BuscarVacias(clientes)) {
                    // Si no hay mesas vacías entonces es cuando buscamos hueco en otras mesas
                    if (!pomodoro.BuscarSitio(clientes))
                        // Y si tampoco hay hueco mostramos un mensaje de que no caben
                        System.out.println("Lo sentimos pero no nos quedan mesas donde quepa su grupo");
                }
            };

        } while (clientes!=-1);



    }
}
