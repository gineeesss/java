import banco.Cuenta;

import java.util.Scanner;


// registrar las cuentas en un array

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        float[][] vector = new float[2][10];

        // Cuenta cuenta ;
        Cuenta[] cuenta =new Cuenta[10];


        menu();
        int eleccion;
        int contador =0; // cuenta el numero de cuentas que hay creadas
        boolean existecuenta;
        int numeroCuenta;
        do {
            eleccion = scr.nextInt();
            switch (eleccion) {
                case 0: //crear nueva cuenta
                    contador = cuentaNueva(scr, contador, cuenta);
                    menu();
                    break;

                case 1: //cuenta con saldo
                    contador = cuentaConSaldo(scr, cuenta, contador);
                    break;
                case 2: // consultar saldo de una cuenta
                    consultarSaldo(scr, contador, cuenta);
                    menu();
                    break;
            }
        }while(eleccion != 6);
    }

    private static void consultarSaldo(Scanner scr, int contador, Cuenta[] cuenta) {
        int numeroCuenta;
        boolean existecuenta;
        existecuenta = false;
        System.out.println("Introduzca el numero de cuenta que quiere consultar");
        numeroCuenta = scr.nextInt();
        for (int i = 0; i< contador && !existecuenta; i++){
            if(numeroCuenta== cuenta[i].getIdentificador()){
                existecuenta = true;
                System.out.printf("El saldo de la cuenta %d es %.2f\n", cuenta[i].getIdentificador(), cuenta[i].getSaldo());
            }
        }
        if (!existecuenta) System.out.println("Lo sentimos pero esa cueta no existe");
    }

    private static int cuentaConSaldo(Scanner scr, Cuenta[] cuenta, int contador) {
        int numeroCuenta;
        System.out.println("Introduce el numero de la cuenta (3 cifras):");
        numeroCuenta = scr.nextInt();
        System.out.println("¿Con cuánto dinero vas a abrir la cuenta?");
        float saldo = scr.nextFloat();
        cuenta[contador] = new Cuenta(numeroCuenta, saldo);
        contador++;
        menu();
        return contador;
    }

    private static void menu() {
        System.out.println("BIENVENIDO/A AL BANCO CASTELAR");
        System.out.println("[0] NUEVO CLIENTE (crear nueva cuenta)");
        System.out.println("[1] NUEVA CUENTA CON SALDO");
        System.out.println("[2] CONSULTAR SALDO");
        System.out.println("[4] RETIRAR DINERO");
        System.out.println("[5] CONSULTAR MOROSIDAD");
        System.out.println("[6] SALIR");
    }

    private static int cuentaNueva(Scanner scr, int contador, Cuenta[] cuenta) {
        int numeroCuenta;
        boolean existecuenta;
        existecuenta = false;
        System.out.println("introduce numero de cuenta");
        numeroCuenta  = scr.nextInt();
        for (int i = 0; i< contador && !existecuenta; i++){
            if(numeroCuenta== cuenta[i].getIdentificador()){
                existecuenta = true;
                System.out.println("Ese numero de cuenta ya existe, introduce una nueva");
            }
        }
        if (!existecuenta) {
            cuenta[0] = new Cuenta(numeroCuenta);
            contador++;
        }
        return contador;
    }
}
