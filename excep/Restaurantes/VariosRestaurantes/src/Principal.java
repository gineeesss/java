// Este es el programa para varios restaurantes

import ejercicio.Restaurante;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /* En lugar de un objeto ahora creamos un array de objetos de la clase Restaurante
        Tenemos que modificar el constructor para decir como queremos que sea cada objeto (es decir
        como queremos que sea de grande cada restaurante)
         */
        Restaurante[] sitio = new Restaurante[3];
        sitio[0]= new Restaurante("Pomodoro",10,4);
        sitio[1]= new Restaurante("Mafia",18,6);
        sitio[2]= new Restaurante("BDeBurguer",9,5);

        int clientes=0, opcion=0; // Estas variables son para saber cuánta gente viene a comer y a qué restaurante quieren ir

        // Hacemos un bucle while porque no sabemos cuántas veces se va a ejecutar el programa
        do {
            // Preguntamos a qué restaurante quieren ir
            System.out.println("A qué restaurante quieres ir a comer?? Indica el número (Escribe -1 para terminar el programa)" +
                    "\n 0) Pommodoro" +
                    "\n 1) La mafia se sienta a la mesa" +
                    "\n 2) BDeBurguer");
            try {
                opcion = teclado.nextInt();

                // Controlamos cuando debe finalizar el programa
                if (opcion == -1) {
                    System.out.println("Gracias por su visita. Hasta pronto!!");
                    break;
                }

                // Mostramos la ocupación del restaurante que ha elegido el usuario
                sitio[opcion].MostrarOcupacion();

                // Preguntamos cuánta gente va a comer
                System.out.println("¿Cuántos venis a comer?");
                clientes = teclado.nextInt();

                // Primero buscamos si hay mesas vacías
                if (!sitio[opcion].BuscarVacias(clientes)) {
                    // Si no hay mesas vacías entonces es cuando buscamos hueco en otras mesas
                    if (!sitio[opcion].BuscarSitio(clientes)) {
                        // Y si tampoco hay hueco mostramos un mensaje de que no caben
                        System.out.println("Lo sentimos pero no nos quedan mesas donde quepa su grupo");
                    }
                }
            }catch (ArrayIndexOutOfBoundsException ex){
                ex = new ArrayIndexOutOfBoundsException("Indice que no existe en el array");
                System.out.println(ex.getMessage());
                teclado.nextLine();
            }catch (InputMismatchException ex){
                ex = new InputMismatchException("No ha introducido un int");
                System.out.println(ex.getMessage());
                teclado.nextLine();
            }
        } while (opcion!=-1);
    }
}

//InputMismatchException
//ArrayIndexOutOfBoundsException