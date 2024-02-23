package cuentas;

public abstract class CuentaRemunerada extends Cuenta{
    //PROPERTIES
    private float interes;

    //METHODS
    public CuentaRemunerada(int identificador, float saldo, float interes) {
        super(identificador, saldo);
        this.interes = interes;
    }

    public CuentaRemunerada(int identificador, float interes) {
        super(identificador);
        this.interes = interes;
    }

    public void aplicarIntereses(){
        setSaldo(getSaldo()+(getSaldo()*interes));
    }
}
