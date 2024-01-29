package banco;

import java.util.Scanner;

public class Cuenta {
    //PROPERTIES
    int identificador;
    float saldo;

    //METHODS

    public  Cuenta(int numCuenta){
        this.identificador=numCuenta;
        this.saldo=0;
    }
    public Cuenta(int numCuenta, float saldo){
        this.identificador=numCuenta;
        this.saldo=saldo;
    }
    public float getSaldo() {
        return saldo;
    }
    public int getIdentificador() {
        return identificador;
    }

    public float ingresar(float importe){
        return this.saldo += importe;
    }
    public float retirar(float importe){
        Scanner scr = new Scanner(System.in);
        if (this.saldo - importe < 0){
            System.out.println("El balance de la cuenta quedará en negativo, ¿desea continuar? [S/N]");
            if(scr.nextLine().toLowerCase().equals("s")) this.saldo -= importe; // se puedde usar .equalsIgnoreCase()
        }else this.saldo -=importe;
        return this.saldo -= importe;
    }
    public boolean esMorosa(){
        boolean morosa = false;
        if (saldo>=0){
            morosa = true;
            return  morosa;
        } else return morosa;
    }











}
