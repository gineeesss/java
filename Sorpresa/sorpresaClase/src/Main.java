import ejercicio.Restaurante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Restaurante[] sitio = new Restaurante[3];
        sitio[0] = new Restaurante("Pomodoro",10,4);
        sitio[1] = new Restaurante("Mafia",18,6);
        sitio[2] = new Restaurante("Burguer",9,5);

        int opcion=0, clientes=0;
        do{
            System.out.println("A qué restaurante quieres ira a comer"+
                    "\n [0] Pomodoro"+
                    "\n [1] Mafia"+
                    "\n [2] Burguer");
            opcion = scr.nextInt();
            if(opcion==-1){
                System.out.println("Gracias por su visita.");
                break;
            }
            sitio[opcion].MostrarOcupacion();
            System.out.println("\n¿Cuántos venis a comer? Escribe -1 para terminar el programa");
            clientes=scr.nextInt();
            if (clientes>4){
                System.out.println("\nLo siento no hay mesas para más de 4 personas");
            } else{
                if(!sitio[opcion].BuscarVacias(clientes)){
                   /* if (!sitio[opcion].BuscarSitio(clientes))
                        System.out.println("lo sentimos");*/
                }
            }
        }while (opcion!=-1);
    }



}