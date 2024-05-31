import java.util.Scanner;
        import java.math.*;
public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numMax = 0;
        int numInt = 0;
        int numOculto = 21;
        int opcion;
        boolean configurado = false ;
        do {
            System.out.println("MENU \n1.Configurar \n2.Jugar \n3.Salir");
            opcion = scr.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el numero de intentos prermitidos:");
                    numInt = scr.nextInt();
                    System.out.println("Introduce el numero máximo generado");
                    numMax = scr.nextInt();
                    configurado = true;
                case 2:
                    if(configurado==true) {
                        int intentos = 0;
                        int adivinando;
                        do {
                            System.out.println("Introduce Número que creeas que es el oculto:");
                            adivinando = scr.nextInt();
                            if (adivinando < numOculto) {
                                System.out.println("El número oculto es mayor");
                            } else if (adivinando > numOculto) {
                                System.out.println("El número oculto es meno");
                            }
                            intentos++;
                        } while (adivinando != numOculto);
                        if (adivinando == numOculto) {
                            System.out.println("¡Has ganado! Has necesitado " + intentos);
                        } else System.out.println("¡Perdiste! Has agotado todos los intento permitidos.");
                    }   else System.out.println("El juego aún no está configurado");
                    break;
                case 3:
                    break;
            }
        }while (opcion !=3);
    }
}