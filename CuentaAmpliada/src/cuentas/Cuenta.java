package cuentas;

import java.util.Scanner;

public abstract class Cuenta {
    //PROPERTIES
    private int identificador;
    private float saldo;

    //METHODS


    public Cuenta(int identificador, float saldo) {
        this.identificador = identificador;
        this.saldo = saldo;
    }

    public Cuenta(int identificador) {
        this.identificador = identificador;
        this.saldo = 0f;
    }

    public int getIdentificador() {
        return identificador;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void ingresar(float importe) {
        this.saldo += importe;
        System.out.println("Saldo actual de la cuenta: " + this.saldo);
    }

    public void retirar(float importe) {
        Scanner scr = new Scanner(System.in);
        float nuevoSaldo = this.saldo -= importe;
        if (nuevoSaldo < 0) {
            System.out.println("El nuevo saldo quedaría en negativo: " + nuevoSaldo + "\n¿Desea continuar ?\n[S/s] Si - [N/n]No");
        }
        if (scr.next().equalsIgnoreCase("s")) {
            System.out.println("Retirando " + importe + "\nNuevo saldo: " + nuevoSaldo);
            this.saldo = nuevoSaldo;
        } else System.out.println("Retirando " + importe + "\nNuevo saldo: " + nuevoSaldo);
        this.saldo = nuevoSaldo;
    }
    public void esMorosa(){
        if (this.saldo < 0){
            System.out.println("La cuenta "+ this.identificador + " es MOROSA.");
        } else System.out.println("La cuenta "+this.identificador + " NO es morosa.");
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "identificador=" + identificador +
                ", saldo=" + saldo +
                '}';
    }
}