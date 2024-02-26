package cuentas;

public final class CuentaCorriente extends Cuenta{
    //PROPERTIES
    private float[] recibos ;
    private String titular;

    //METHODS

    public CuentaCorriente(int identificador, float saldo, float[] recibos, String titular) {
        super(identificador, saldo);
        this.recibos = recibos;
        this.titular = titular;
    }

    public CuentaCorriente(int identificador, float[] recibos, String titular) {
            super(identificador);
            this.recibos = recibos;
            this.titular = titular;
    }

    //METHODS
    public void actualizarCuenta(){
        float importeTotalRecibos = 0;
        for (int i =0;i<recibos.length;i++){
            importeTotalRecibos += recibos[i];
        }
        setSaldo(getSaldo()-importeTotalRecibos);
    }
}
