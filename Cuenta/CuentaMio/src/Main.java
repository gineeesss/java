import banco.Cuenta;
import java.util.Scanner;


// registrar las cuentas en un array

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int eleccion;
        float saldo;

        // Cuenta cuenta ;
        Cuenta[] cuenta =new Cuenta[10]; //se crea un array del tipo Cuenta, es decir de objeto cuenta, entonces cadda posicion es un objeto
        int[] auxiliar = new int[2]; // en la posicion 0 se guarda el numero de cuenta y en la 1 posicion

        System.out.println("BIENVENIDO/A AL BANCO CASTELAR");
        System.out.println("[1] NUEVO CLIENTE (SIN saldo)");
        System.out.println("[2] NUEVO CLIENTE (CON saldo)");
        System.out.println("[3] CONSULTAR SALDO");
        System.out.println("[4] INGRESAR DINERO");
        System.out.println("[5] RETIRAR DINERO");
        System.out.println("[6] CONSULTAR MOROSIDAD");
        System.out.println("[9] SALIR");

        do {
            eleccion = scr.nextInt();
            switch (eleccion) {
                case 1: //crear nueva cuenta
                    buscarCuentaArray(cuenta, auxiliar);
                    if (auxiliar[1]==-1) {
                        cuenta[Cuenta.getTotalCuentas()] = new Cuenta(auxiliar[0]);
                    } else {
                        System.out.println("Cuenta ya existe");
                    }
                    break;

                case 2: //cuenta con saldo

                    /*System.out.println("introduce numero de cuenta");
                    numeroCuenta = scr.nextInt();*/
                    buscarCuentaArray(cuenta,auxiliar);
                    if (auxiliar[1]==-1) {
                        cuenta[Cuenta.getTotalCuentas()] = new Cuenta(auxiliar[0]);
                        System.out.println("¿Con cuánto dinero quiere iniciar la cuenta?");
                        saldo = scr.nextFloat();
                        cuenta[auxiliar[1]].ingresar(saldo);}
                    else{
                        System.out.println("Cuenta ya existe");
                        }
                    break;

                case 3: // consultar saldo de una cuenta
                    /*existecuenta = false;
                    System.out.println("Introduzca el numero de cuenta que quiere consultar");
                    numeroCuenta = scr.nextInt();
                    for (int i=0;i<Cuenta.getTotalCuentas() && !existecuenta;i++){
                        if(numeroCuenta==cuenta[i].getIdentificador()){
                            existecuenta = true;
                            System.out.printf("El saldo de la cuenta %d es %.2f\n", cuenta[i].getIdentificador(), cuenta[i].getSaldo());
                        }
                    } if (!existecuenta) System.out.println("Lo sentimos pero esa cueta no existe");
                    break;*/
                    buscarCuentaArray(cuenta,auxiliar);
                    if (auxiliar[1]==-1) {
                        System.out.println("Cuenta NO existe");
                    } else System.out.printf("El saldo de la cuenta %d es %.2f", cuenta[auxiliar[1]].getIdentificador(), cuenta[auxiliar[1]].getSaldo());
                    break;
                case 4:
                    buscarCuentaArray(cuenta,auxiliar);
                    if (auxiliar[1]==-1) {
                        System.out.println("Cuenta NO existe");
                    } else {
                        System.out.println("Cuánto dinero quiere ingresar en la cuenta");
                        cuenta[auxiliar[1]].ingresar(scr.nextFloat());
                    }

                    break;
                case 5:
                    /*existecuenta = false;
                    System.out.println("Introduzca el numero de cuenta en la que quiere retirar");
                    numeroCuenta = scr.nextInt();
                    for (int i=0;i<Cuenta.getTotalCuentas() && !existecuenta;i++){
                        if(numeroCuenta==cuenta[i].getIdentificador()){
                            existecuenta = true;
                            System.out.println("¿Cuánto dinero quiere retirar en la cuenta?");
                            saldo = cuenta[i].retirar(scr.nextFloat());
                            System.out.printf("El nuevo saldo de la cuenta es %.2f\n",saldo); // cuenta[i].getSaldo()  si se usase el getter, sería redundante guardar el valor anterior en una variable (saldo)
                        }
                    } if (!existecuenta) System.out.println("Lo sentimos pero esa cueta no existe");
                    break;*/
                    buscarCuentaArray(cuenta,auxiliar);
                    if (auxiliar[1]==-1) {
                        System.out.println("Cuenta NO existe");
                    } else {
                        System.out.println("Cuánto dinero quiere retirar en la cuenta");
                        cuenta[auxiliar[1]].retirar(scr.nextFloat());
                    }
                case 6:
                    /*existecuenta = false;
                    System.out.println("Introduzca el numero de cuenta para comprobar");
                    numeroCuenta = scr.nextInt();
                    for (int i=0;i<Cuenta.getTotalCuentas() && !existecuenta;i++){
                        if(numeroCuenta==cuenta[i].getIdentificador()){
                            existecuenta = true;
                            if(cuenta[i].esMorosa()){
                                System.out.println("Esta cuenta SI es morosa" + cuenta[i].getSaldo());
                            }else System.out.println("Esta cuenta NO es morosa" + cuenta[i].getSaldo());
                        }
                    } if (!existecuenta) System.out.println("Lo sentimos pero esa cueta no existe");
                    break;*/
                    buscarCuentaArray(cuenta,auxiliar);
                    if (auxiliar[1]==-1) {
                        System.out.println("Cuenta NO existe");
                    } else {
                        cuenta[auxiliar[1]].esMorosa();
                    }
                case 7:
                    System.out.printf("En nuestro  banco hayun total de %d cuentas\n", Cuenta.getTotalCuentas());
                    System.out.printf("El dinero total que hay en el banco es %.2f €\n", Cuenta.getTotalSaldo());
                    break;
            }
        }while(eleccion != 9);
    }

    private static int buscarCuenta(int numeroCuenta, Cuenta[] cuenta){ //se recibe el numero de cucenta a buscar y el array donde están todas las cuentas
    //boolean existecuenta = false;
        for (int i=0;i<Cuenta.getTotalCuentas() /*&& !existecuenta*/;i++){
            if(numeroCuenta==cuenta[i].getIdentificador()){
                //existecuenta = true;
                return i; //devuelva la posicion de la cuenta en el array, no el numero de la cuenta
            }
        }
        return -1; //cuando returnea -1, significa que la cuenta no exsite
    }

    private static int preguntarCuenta(){
        Scanner scr = new Scanner(System.in);
        System.out.println("Introduzca el número de cuenta");
        int numeroCuenta = scr.nextInt();
        return numeroCuenta;
        }

    private static void buscarCuentaArray(Cuenta [] cuenta, int[] auxiliar) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Introduzac numero cuenta [metodo]");
        auxiliar[0] = scr.nextInt();
        auxiliar[1] = -1;
        for (int i = 0; i < Cuenta.getTotalCuentas() && (auxiliar[1] == -1) /*&& !existecuenta*/; i++) {
            if (auxiliar[0] == cuenta[i].getIdentificador()) {
                auxiliar[1] = i;
            }
            return; //cuando returnea -1, significa que la cuenta no exsite
        }
    }
}

