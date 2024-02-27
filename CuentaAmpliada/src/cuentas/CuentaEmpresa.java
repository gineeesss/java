package cuentas;

public class CuentaEmpresa extends CuentaRemunerada{
    public CuentaEmpresa(int identificador, float saldo, float interes) {
        super(identificador, saldo, interes);
    }

    public CuentaEmpresa(int identificador, float interes) {
        super(identificador, interes);
    }

    @Override
    public String toString() {
        return super.toString() +"CuentaEmpresa{}";
    }

    @Override
    public void aplicarIntereses() {
        super.aplicarIntereses();
        setSaldo(getSaldo()-(getSaldo()*0.05f));
    }
}
