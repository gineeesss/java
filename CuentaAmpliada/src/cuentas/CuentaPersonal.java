package cuentas;

public class CuentaPersonal extends CuentaRemunerada{
    //PROPERTIES


    //METHODS

    public CuentaPersonal(int identificador, float saldo, float interes) {
        super(identificador, saldo, interes);
    }

    public CuentaPersonal(int identificador, float interes) {
        super(identificador, interes);
    }
}
