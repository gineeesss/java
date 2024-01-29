package banco;

import java.util.Scanner;

public class Cuenta {
    //PROPERTIES
    private int identificador;
    private float saldo;
    private static int totalCuentas;
    private static float totalSaldo;

    //METHODS
    public  Cuenta(int numCuenta){
        this.identificador=numCuenta;
        this.saldo=0;
        totalCuentas++;
    }
    public Cuenta(int numCuenta, float saldo){
        this.identificador=numCuenta;
        this.saldo=saldo;
        totalCuentas++;
        totalSaldo+=saldo;
    }
    public float getSaldo() {return saldo;}
    public int getIdentificador() {return identificador;}

    public static int getTotalCuentas() {return totalCuentas;}

    public static float getTotalSaldo() {return totalSaldo;}

    public float ingresar(float importe){
        this.saldo += importe;
        totalSaldo+=importe;
        return this.saldo;
    }
    public float retirar(float importe){
        Scanner scr = new Scanner(System.in);
        if (this.saldo - importe < 0){
            System.out.println("El balance de la cuenta quedará en negativo, ¿desea continuar? [S/N]");
        //    if(scr.nextLine().toLowerCase().equals("s")) this.saldo -= importe; // se puedde usar .equalsIgnoreCase()
            if (scr.nextLine().equalsIgnoreCase("s")){
                this.saldo=this.saldo - importe;
            }
        }else {
            this.saldo -=importe;
            totalSaldo-=importe;
        }
        this.saldo -= importe;
        return this.saldo;
    }
    public boolean esMorosa(){
        boolean morosa = false;
        if (saldo>=0){
            morosa = true;
            return  morosa;
        } else return morosa;
    }











}
