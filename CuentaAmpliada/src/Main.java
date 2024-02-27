import java.util.Scanner;
import cuentas.*;

import javax.sound.midi.MidiEvent;

public class Main {
    static Scanner scr =  new Scanner(System.in).useDelimiter("\\n");
    static int contadorCuentas = 0;
    public static void main(String[] args) {
        Cuenta[] banco = new Cuenta[10];
        int opcion;
        float[][] array = new float[10][10];
        for (int i = 0;i<array.length;i++){
            for (int j = 0; j<array[0].length;j++){
                array[i][j]=(float) (Math.random() * 10 +100 + 1);
            }
        }
        for (float[] a: array) {
            for (float b: a) {
                System.out.print(b+" ");
            }
            System.out.println();
        }
        do {
            menu();
            opcion = scr.nextInt();
            switch (opcion) {
                case 1:
                    abrirCuentaCero(banco);
                    break;
                case 2:
                    for (Cuenta a:banco) {
                        System.out.println(a);
                    }
                    break;
                case 3:
                    System.out.println("Introducir identificador cuenta: ");
                    ingresarDinero(banco,scr.nextInt());
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
            }
        }while (opcion!=0);
    }

    public static void ingresarDinero(Cuenta[] banco, int identificador){
        if (existeCuenta(banco, identificador)){
            System.out.println("Cuanta cantidad desea ingresar: ");
            float ingreso= scr.nextFloat();
            banco[buscarCuenta(banco,identificador)].setSaldo(ingreso);
        }else System.out.println("La cuenta con el número de identificador: "+identificador+" no existe.");
    }

    public static void abrirCuentaCero(Cuenta[] banco){
        System.out.println("Elige el tipo de cuenta:");
        System.out.println("[1] Cuenta Corriente");
        System.out.println("[2] Cuenta Personal - remunerada");
        System.out.println("[3] Cuenta Empresa - remunerada");
        int opcion = scr.nextInt();
        int identificador;
        String titular;
        float interes;
        switch (opcion){
            case 1:
                identificador = scr.nextInt();
                if(existeCuenta(banco, identificador)){
                    titular = scr.next();
                    banco[contadorCuentas]= new CuentaCorriente(identificador, arrayRecibos(), titular);
                    contadorCuentas++;
                } else System.out.println("Identificador existente, intentar de nuevo con otro identificador");
                break;
            case 2:
                identificador = scr.nextInt();
                if(existeCuenta(banco, identificador)) {
                    interes= scr.nextFloat();
                    banco[contadorCuentas]=new CuentaPersonal(identificador,interes);
                }else System.out.println("Identificador existente, intentar de nuevo con otro identificador");
                break;
            case 3:
                identificador = scr.nextInt();
                if (existeCuenta(banco, identificador)){
                    interes=scr.nextFloat();
                    banco[contadorCuentas]=new CuentaEmpresa(identificador, interes);
                }else System.out.println("Identificador existente, intentar de nuevo con otro identificador");
                break;
        }
    }

    public static float[] arrayRecibos(){
        System.out.println("Cuantos recibos: ");
        int cantidadRecibos = scr.nextInt();
        float[] recibos = new float[cantidadRecibos];
        for (int i = 0; i<recibos.length;i++){
            System.out.println("Introducir importe "+(i+1)+"º recibo: ");
            recibos[i]=scr.nextFloat();
        }
        return recibos;
    }
    public static boolean existeCuenta(Cuenta[] banco, int identificador){
        if (contadorCuentas!=0) {
            for (Cuenta a : banco) {
                if (a.getIdentificador() == identificador) return false;
            }
        }return true;
    }

    public static int buscarCuenta(Cuenta[] banco, int identificador){
        for (int i = 0;i<banco.length;i++){
            if (banco[i].getIdentificador()==identificador){
                return i;
            }
        } return -1;
    }
    public static void menu(){
        System.out.println("[1] Abrir cuenta ");
        System.out.println("[2] Abrir cuenta con saldo");
        System.out.println("[3] Consultar saldo");
        System.out.println("[4] Ingresar dinero");
        System.out.println("[5] Retirar dinero");
        System.out.println("[6] Consultar morosidad");
        System.out.println("[7] Actualizar una cuenta corriente");
        System.out.println("[8] Aplicar interés a una cuenta remunerada");
        System.out.println("[0] Salir");
    }
}
